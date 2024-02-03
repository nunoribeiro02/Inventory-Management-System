package ggc.exceptions;

/**
 * 
 */
public class NoSuchDateException extends Exception {

	/** Serial number for serialization. */
	private static final long serialVersionUID = 202009192006L;

	/** The given date. */
	private final int _date;

	/**
	 * @param filename 
	 */
	public NoSuchDateException(int date) {
		_date = date;
	}
	
	/**
	 * @return the date
	 */
	public int getDate() {
		return _date;
	}

}
