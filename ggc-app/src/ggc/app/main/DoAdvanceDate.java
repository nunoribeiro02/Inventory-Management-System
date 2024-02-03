package ggc.app.main;

import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
import ggc.WarehouseManager;
import ggc.exceptions.NoSuchDateException;
import ggc.app.exceptions.InvalidDateException;

//FIXME import classes

/**
 * Advance current date.
 */
class DoAdvanceDate extends Command<WarehouseManager> {

  DoAdvanceDate(WarehouseManager receiver) {
    super(Label.ADVANCE_DATE, receiver);
    addIntegerField("days", Prompt.daysToAdvance());
  }

  @Override
  public final void execute() throws CommandException, InvalidDateException {
    try{
      int days = integerField("days");
      _receiver.advanceDate(days);
    } catch (NoSuchDateException e){
      throw new InvalidDateException(e.getDate());
    }
  }
}
