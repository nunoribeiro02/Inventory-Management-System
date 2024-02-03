package ggc;

// FIXME import classes (cannot import from pt.tecnico or ggc.app)

import java.io.Serializable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import ggc.exceptions.BadEntryException;
import ggc.exceptions.NoSuchDateException;
import ggc.exceptions.NoSuchPartnerException;
import ggc.classes.*;

/**
 * Class Warehouse implements a warehouse.
 */
public class Warehouse implements Serializable {

  /** Serial number for serialization. */
  private static final long serialVersionUID = 202109192006L;

  // Attributes
  private int _currentTime;
  private Map<String, Partner> _partners = new HashMap<String, Partner>(); 

  // FIXME define contructor(s)
  public Warehouse(){
    _currentTime = 0;
  }

  // Getters and Setters
  public int getCurrentTime(){
    return _currentTime;
  }

  public void setCurrentTime(int currentTime){
    _currentTime = currentTime;
  }

  // Methods
  public void advanceDate(int days) throws NoSuchDateException{
    if (days < 0)
      throw new NoSuchDateException(days);

    setCurrentTime(_currentTime + days);
  }

  public Partner showPartner(String id) throws NoSuchPartnerException{
    if (!_partners.containsKey(id)){
      throw new NoSuchPartnerException(id);
    }
    
    return _partners.get(id);
  }

  /**
   * @param txtfile filename to be loaded.
   * @throws IOException
   * @throws BadEntryException
   */
  void importFile(String txtfile) throws IOException, BadEntryException /* FIXME maybe other exceptions */ {
    //FIXME implement method
  }

}
