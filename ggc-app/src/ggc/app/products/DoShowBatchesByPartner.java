package ggc.app.products;

import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
import ggc.WarehouseManager;
import ggc.app.exceptions.UnknownPartnerKeyException;
import ggc.exceptions.NoSuchPartnerException;

/**
 * Show batches supplied by partner.
 */
class DoShowBatchesByPartner extends Command<WarehouseManager> {

  DoShowBatchesByPartner(WarehouseManager receiver) {
    super(Label.SHOW_BATCHES_SUPPLIED_BY_PARTNER, receiver);
    addStringField("key", Message.requestPartnerKey());
  }

  @Override
  public final void execute() throws CommandException, UnknownPartnerKeyException {
    try{
      String key = stringField("key");
      _display.popup(_receiver.showBatchesByPartner(key));
    } catch (NoSuchPartnerException e){
      throw new UnknownPartnerKeyException(e.getPartnerKey());
    }
  }

}
