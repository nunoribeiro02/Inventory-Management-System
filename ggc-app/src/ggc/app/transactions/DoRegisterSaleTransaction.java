package ggc.app.transactions;

import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
import ggc.WarehouseManager;
//FIXME import classes
import ggc.app.exceptions.DuplicatePartnerKeyException;
import ggc.app.exceptions.InvalidDateException;
import ggc.app.exceptions.UnavailableProductException;
import ggc.app.exceptions.UnknownPartnerKeyException;
import ggc.app.exceptions.UnknownProductKeyException;
import ggc.exceptions.InvalidAmountException;
import ggc.exceptions.NoSuchPartnerException;
import ggc.exceptions.NoSuchProductException;

/**
 * 
 */
public class DoRegisterSaleTransaction extends Command<WarehouseManager> {

  public DoRegisterSaleTransaction(WarehouseManager receiver) {
    super(Label.REGISTER_SALE_TRANSACTION, receiver);
    addStringField("partnerKey", Message.requestPartnerKey());
    addStringField("productId", Message.requestProductId());
    addIntegerField("deadline", Message.requestPaymentDeadline());
    addIntegerField("amount", Message.requestAmount());
  }

  @Override
  public final void execute() throws CommandException, UnknownPartnerKeyException, UnknownProductKeyException, 
          InvalidDateException, UnavailableProductException {
    try {
      String partnerKey = integerField("partnerKey")
      String productId = stringField("productId");
      int deadline = integerField("deadline");
      int amount = integerField("amount");
      _receiver.registerSaleTransaction(partnerKey, productId, deadline, amount);
    } catch (NoSuchPartnerException e) {
      throw new UnknownPartnerKeyException(e.getPartnerKey());  
    } catch (NoSuchProductException e) {
        throw new UnknownProductKeyException(e.getProductId());  
    } catch (NoSuchDateException e ){
      throw new InvalidDateException(e.getDate());  
    } catch (InvalidAmountException e ){
      throw new UnavailableProductException(e.getProductId(), e.getAmount(), e.getStock());  
    }

}
