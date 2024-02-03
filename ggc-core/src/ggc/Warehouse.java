package ggc;

// FIXME import classes (cannot import from pt.tecnico or ggc.app)

import java.io.Serializable;
import java.io.IOException;
import ggc.exceptions.BadEntryException;

/**
 * Class Warehouse implements a warehouse.
 */
public class Warehouse implements Serializable {

  /** Serial number for serialization. */
  private static final long serialVersionUID = 202109192006L;

  // Attributes
  private int _currentTime;

  // FIXME define contructor(s)
  public Warehouse(){
    _currentTime = 0;
  }

  // FIXME define methods
  public int getCurrentTime(){
    return _currentTime;
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
