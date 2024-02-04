package ggc.exceptions;

/**
 * 
 */
public class PartnerAlreadyExistsException extends Exception {

	/** Serial number for serialization. */
	private static final long serialVersionUID = 202009192006L;

	/** The the key that is already associated with a partner. */
	private final String _key;

	/**
	 * @param filename 
	 */
	public PartnerAlreadyExistsException(String key) {
		_key = key;
	}
	
	/**
	 * @return the key
	 */
	public String getKey() {
		return _key;
	}

}
