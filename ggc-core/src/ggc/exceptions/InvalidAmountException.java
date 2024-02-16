package ggc.exceptions;

/**
 * 
 */
public class InvalidAmountException extends Exception {

	/** Serial number for serialization. */
	private static final long serialVersionUID = 202009192006L;

	/** The productId, amount, stock */
    private final String _productId;
	private final int _amount;
    private final int _stock;

	/**
	 * @param filename 
	 */
	public InvalidAmountException(String productId, int amount, int stock) {
		_productId = productId;
        _amount = amount;
        _stock = stock;
	}
	
	/**
	 * @return the product id
	 */
	public String getProductId() {
		return _productId;
	}

    /**
	 * @return the request amount
	 */
	public int getAmount() {
		return _amount;
	}

    /**
	 * @return the product stock
	 */
	public int getStock() {
		return _stock;
	}
}