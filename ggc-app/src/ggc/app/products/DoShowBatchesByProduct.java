package ggc.app.products;

import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
import ggc.WarehouseManager;
import ggc.exceptions.NoSuchProductException;
import ggc.app.exceptions.UnknownProductKeyException;

/**
  * Show batches that include given product .
 */
class DoShowBatchesByProduct extends Command<WarehouseManager> {

  DoShowBatchesByProduct(WarehouseManager receiver) {
    super(Label.SHOW_BATCHES_BY_PRODUCT, receiver);
    addStringField("id", Message.requestProductId());
  }

  @Override
  public final void execute() throws CommandException, UnknownProductKeyException {
    try{
      String id = stringField("id");
      _display.popup(_receiver.showBatchesByProduct(id));
    } catch (NoSuchProductException e){
      throw new UnknownProductKeyException(e.getProductId());
    }  
  }
  
}
