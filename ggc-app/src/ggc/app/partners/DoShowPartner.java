package ggc.app.partners;

import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
import ggc.WarehouseManager;
import ggc.app.exceptions.UnknownPartnerKeyException;
import ggc.exceptions.NoSuchPartnerException;

/**
 * Show partner.
 */
class DoShowPartner extends Command<WarehouseManager> {

  DoShowPartner(WarehouseManager receiver) {
    super(Label.SHOW_PARTNER, receiver);
    addStringField("key", Prompt.partnerKey());
  }

  @Override
  public void execute() throws CommandException, UnknownPartnerKeyException {
    try{
      String key = stringField("key");
      _display.popup(Message.showPartner(_receiver.showPartner(key)));
    } catch (NoSuchPartnerException e){
      throw new UnknownPartnerKeyException(e.getPartnerKey());
    }
  }

}
