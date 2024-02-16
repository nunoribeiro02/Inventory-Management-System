package ggc;

// FIXME import classes (cannot import from pt.tecnico or ggc.app)

import java.io.Serializable;
import java.security.Permissions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import ggc.exceptions.BadEntryException;
import ggc.exceptions.NoSuchDateException;
import ggc.exceptions.NoSuchPartnerException;
import ggc.exceptions.NoSuchProductException;
import ggc.exceptions.PartnerAlreadyExistsException;
import ggc.exceptions.InvalidAmountException;
import ggc.classes.Partner;
import ggc.classes.Product;
import ggc.classes.transactions.Batch;
import ggc.classes.transactions.Sale;
import ggc.classes.transactions.Transaction;


/**
 * Class Warehouse implements a warehouse.
 */
public class Warehouse implements Serializable {

  /** Serial number for serialization. */
  private static final long serialVersionUID = 202109192006L;

  // Attributes
  private int _currentTime;
  private int _balance;
  private int _transactionCounter;
  private Map<String, Partner> _partners = new HashMap<String, Partner>(); 
  private Map<String, Product> _products = new HashMap<String, Product>(); 
  private Map<String, Batch> _batches = new HashMap<String, Batch>(); 
  private Map<Integer, Transaction> _transactions = new HashMap<Integer, Transaction>(); 

  // FIXME define contructor(s)
  public Warehouse(){
    _currentTime = 0;
    _balance = 0;
    _transactionCounter = 0;
  }

  // Getters and Setters
  public int getCurrentTime(){
    return _currentTime;
  }

  public void setCurrentTime(int currentTime){
    _currentTime = currentTime;
  }

  public int getBalance(){
    return _balance;
  }

  public void setBalance(int balance){
    _balance = balance;
  }

  // Methods
  public void advanceDate(int days) throws NoSuchDateException{
    if (days < 0)
      throw new NoSuchDateException(days);

    setCurrentTime(_currentTime + days);
  }

  public void registerPartner(String partnerKey, String name, String address) throws PartnerAlreadyExistsException{
    if (_partners.containsKey(partnerKey)){
      throw new PartnerAlreadyExistsException(partnerKey);
    }

    Partner p = new Partner(partnerKey, name, address);
    _partners.put(partnerKey, p);
  }

  public Partner showPartner(String partnerKey) throws NoSuchPartnerException{
    if (!_partners.containsKey(partnerKey)){
      throw new NoSuchPartnerException(partnerKey);
    }
    
    return _partners.get(partnerKey);
  }

  public List<Partner> showAllPartners() {
    List<Partner> partnersShow = new ArrayList<Partner>();
    for (String key: _partners.keySet()){
      try {
        partnersShow.add(showPartner(key));
      }
      catch (NoSuchPartnerException e){
      }
    }

    return partnersShow;
  }

  public String showAllProducts() {
    List<Product> productList = _products.values().stream().toList();
    String producString = productList.stream().map(Object::toString).collect(Collectors.joining(", "));

    String producStringFinal = String.join("\n", producString);

    return producStringFinal;
  }

  public List<Batch> showBatchesByPartner(String key) throws NoSuchPartnerException{
    if (!_partners.containsKey(key)){
      throw new NoSuchPartnerException(key);
    }

    List<Batch> batchesList = _batches.values().stream().toList();
    batchesList.removeIf(b -> b.getQuantity() == 0);
    batchesList.removeIf(b -> b.getPartner().getPartnerKey() != key);
    
    return batchesList;
  }

  public List<Batch> showBatchesByProduct(String id) throws NoSuchProductException {
    if (!_batches.containsKey(id)){
      throw new NoSuchProductException(id);
    }

    List<Batch> batchesList = _batches.values().stream().toList();
    batchesList.removeIf(b -> b.getQuantity() == 0);
    batchesList.removeIf(b -> b.getProduct().getProductId() != id);
    
    return batchesList;
  }

  public List<Batch> showAllBatches() {
    List<Batch> batchesList = _batches.values().stream().toList();
    batchesList.removeIf(b -> b.getQuantity() == 0);

    return batchesList;
  }

  
  /**
   * @param txtfile filename to be loaded.
   * @throws IOException
   * @throws BadEntryException
   */
  void importFile(String txtfile) throws IOException, BadEntryException /* FIXME maybe other exceptions */ {
    //FIXME implement method
  }

  public void registerSaleTransaction(String partnerKey, String productId, int deadline, int amount) throws NoSuchPartnerException, NoSuchProductException,
            NoSuchDateException, InvalidAmountException
  {
    if (!_partners.containsKey(partnerKey)){
      throw new NoSuchPartnerException(partnerKey);
    }
    if (!_products.containsKey(productId)){
      throw new NoSuchProductException(productId);
    }
    if (deadline < getCurrentTime()){
      throw new NoSuchDateException(deadline);

    }

    Product prod = _products.get(productId);
    int stock = prod.getTotalStock();
    if (amount < 0 || amount > stock){
      throw new InvalidAmountException(productId, amount, stock);
    }

    Partner p = _partners.get(partnerKey);
    Sale s = new Sale(_transactionCounter, partnerKey, productId, amount, deadline)
    _transactions.put(_transactionCounter, s);
    _transactionCounter++;
  }
}
