package ggc;

//FIXME import classes (cannot import from pt.tecnico or ggc.app)

import ggc.classes.Partner;
import ggc.classes.transactions.Acquisition;
import ggc.classes.transactions.Batch;

import java.io.Serializable;
import java.io.IOException;
import java.io.FileNotFoundException;

import ggc.exceptions.BadEntryException;
import ggc.exceptions.ImportFileException;
import ggc.exceptions.InvalidAmountException;
import ggc.exceptions.UnavailableFileException;
import ggc.exceptions.MissingFileAssociationException;
import ggc.exceptions.NoSuchDateException;
import ggc.exceptions.NoSuchPartnerException;
import ggc.exceptions.NoSuchProductException;
import ggc.exceptions.PartnerAlreadyExistsException;
import ggc.classes.Product;
import ggc.classes.Partner;
import java.util.List;

/** Façade for access. */
public class WarehouseManager {

  /** Name of file storing current warehouse. */
  private String _filename = "";

  /** The wharehouse itself. */
  private Warehouse _warehouse = new Warehouse();

  //FIXME define other attributes
  //FIXME define constructor(s)
  //FIXME define other methods

  /**
   * @@throws IOException
   * @@throws FileNotFoundException
   * @@throws MissingFileAssociationException
   */
  public void save() throws IOException, FileNotFoundException, MissingFileAssociationException {
    //FIXME implement serialization method
  }

  /**
   * @@param filename
   * @@throws MissingFileAssociationException
   * @@throws IOException
   * @@throws FileNotFoundException
   */
  public void saveAs(String filename) throws MissingFileAssociationException, FileNotFoundException, IOException {
    _filename = filename;
    save();
  }

  /**
   * @@param filename
   * @@throws UnavailableFileException
   */
  public void load(String filename) throws UnavailableFileException, ClassNotFoundException  {
    //FIXME implement serialization method
  }

  /**
   * @param textfile
   * @throws ImportFileException
   */
  public void importFile(String textfile) throws ImportFileException {
    try {
      _warehouse.importFile(textfile);
    } catch (IOException | BadEntryException /* FIXME maybe other exceptions */ e) {
      throw new ImportFileException(textfile, e);
    }
  }
  
  public int showDate(){
    return _warehouse.getCurrentTime();
  }

  public int showBalance(){
    return _warehouse.getBalance();
  }


  public void advanceDate(int days) throws NoSuchDateException{
    _warehouse.advanceDate(days);
  }

  public void registerPartner(String partnerKey, String name, String address) throws PartnerAlreadyExistsException{
    _warehouse.registerPartner(partnerKey, name, address);
  }

  public Partner showPartner(String id) throws NoSuchPartnerException{
    return _warehouse.showPartner(id);
  }

  public List<Partner> showAllPartners() {
    return _warehouse.showAllPartners();
  }

  public String showAllProducts() {
    return _warehouse.showAllProducts();
  }


  public List<Batch> showBatchesByPartner(String key) throws NoSuchPartnerException {
    return _warehouse.showBatchesByPartner(key);
  }

  public List<Batch> showBatchesByProduct(String id) throws NoSuchProductException {
    return _warehouse.showBatchesByProduct(id);
  }

  public List<Batch> showAllBatches() {
    return _warehouse.showAllBatches();
  }

  public void registerSaleTransactionString(String partnerKey, String productId, int deadline, int amount) throws NoSuchPartnerException, NoSuchProductException,
            NoSuchDateException, InvalidAmountException
  {
    _warehouse.registerSaleTransaction(partnerKey, productId, deadline, amount);
  }
}