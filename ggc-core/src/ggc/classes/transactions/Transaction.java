package ggc.classes.transactions;

import java.sql.Date;

public abstract class Transaction {

    private int _id;
    private String _partnerKey;
    private String _productId;
    private int _quantity;

    //Constructor
    public Transaction(String partnerKey, String productId, int quantity){
        _partnerKey = partnerKey;
        _productId = productId;
        _quantity = quantity;
    }

    //Getters and Setters
    public int getId(){
        return _id;
    }

    public String getPartnerKey(){
        return _partnerKey;
    }

    public String getProductId(){
        return _productId;
    }   

    public int getQuantity(){
        return _quantity;
    }

    public void setId(int id){
        _id = id;
    }

    public void setPartnerKey(String partnerKey){
        _partnerKey = partnerKey;
    }

    public void setProductId(String productId){
        _productId = productId;
    }

    public void setQuantity(int quantity){
        _quantity = quantity;
    }

    
}
