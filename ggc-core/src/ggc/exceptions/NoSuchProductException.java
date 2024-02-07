package ggc.exceptions;

/**
 * 
 */
public class NoSuchProductException extends Exception {

	/** Serial number for serialization. */
	private static final long serialVersionUID = 202009192006L;

	/** The id that doens't correlate with a product. */
	private final String _id;

	/**
	 * @param filename 
	 */
	public NoSuchProductException(String id) {
		_id = id;
	}
	
	/**
	 * @return the id
	 */
	public String getProductId() {
		return _id;
	}

}
