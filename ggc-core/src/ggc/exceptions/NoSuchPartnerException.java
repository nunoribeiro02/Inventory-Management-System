package ggc.exceptions;

/**
 * 
 */
public class NoSuchPartnerException extends Exception {

	/** Serial number for serialization. */
	private static final long serialVersionUID = 202009192006L;

	/** The id that doens't correlate with a partner. */
	private final String _id;

	/**
	 * @param filename 
	 */
	public NoSuchPartnerException(String id) {
		_id = id;
	}
	
	/**
	 * @return the id
	 */
	public String getId() {
		return _id;
	}

}
