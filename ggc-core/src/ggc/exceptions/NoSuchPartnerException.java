package ggc.exceptions;

/**
 * 
 */
public class NoSuchPartnerException extends Exception {

	/** Serial number for serialization. */
	private static final long serialVersionUID = 202009192006L;

	/** The key that doens't correlate with a partner. */
	private final String _key;

	/**
	 * @param filename 
	 */
	public NoSuchPartnerException(String id) {
		_key = id;
	}
	
	/**
	 * @return the id
	 */
	public String getPartnerKey() {
		return _key;
	}

}
