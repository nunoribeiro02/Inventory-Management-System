package ggc.classes.transactions;

public class Batch {
    
    private String _partnerKey;
    private String _productId;
    private double _price;
    private int _quantity;

    // Constructor
    public Batch(String partnerKey, String productId, double price, int quantity){
        _partnerKey = partnerKey;
        _productId = productId;
        _price = price;
        _quantity = quantity;
    }
    
    // Getters and Setters
    public String getPartnerKey(){
        return _partnerKey;
    }

    public String getProductId(){
        return _productId;
    }

    public double getPrice(){
        return _price;
    }

    public int getQuantity(){
        return _quantity;
    }

    public void setPartnerKey(String partnerKey){
        this._partnerKey = partnerKey;
    }

    public void setProductId(String productId){
        this._productId = productId;
    }

    public void setPrice(double price){
        this._price = price;
    }

    public void setQuantity(int quantity){
        this._quantity = quantity;
    }    

    @Override
    public String toString() {
        return  _partnerKey + "| " + _productId + "| " + _price + "| " + _quantity;
    }

}
