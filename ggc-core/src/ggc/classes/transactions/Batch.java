package ggc.classes.transactions;

import java.text.Collator;

import ggc.classes.Partner;
import ggc.classes.Product;

public class Batch implements Comparable<Batch>{
    
    private Partner _partner;
    private Product _product;
    private double _price;
    private int _quantity;

    // Constructor
    public Batch(Partner partner, Product product, double price, int quantity) {
        _partner = partner;
        _product = product;
        _price = price;
        _quantity = quantity;
    }
    
    // Getters and Setters
    public Partner getPartner(){
        return _partner;
    }

    public Product getProduct(){
        return _product;
    }

    public double getPrice(){
        return _price;
    }

    public int getQuantity(){
        return _quantity;
    }

    public void setPartner(Partner partner){
        _partner = partner;
    }

    public void setProduct(Product product){
        _product = product;
    }

    public void setPrice(double price){
        _price = price;
    }

    public void setQuantity(int quantity){
        _quantity = quantity;
    }    

    @Override
    public String toString() {
        return  _product.getProductId() + "|" + _partner.getPartnerKey() + "|" + _price + "|" + _quantity + "\n";
    }

    @Override
    public int compareTo(Batch comparedBatch) {
        Collator myCollator = Collator.getInstance();
        String comparedProduct = comparedBatch.getProduct().getProductId();
        String comparedPartner = comparedBatch.getPartner().getPartnerKey();
        double comparedPrice = comparedBatch.getPrice();
        int comparedQuantity = comparedBatch.getQuantity();

        if (comparedProduct == _product.getProductId()){
            if (comparedPartner == _partner.getPartnerKey()){
                if (comparedPrice == _price){
                    return _quantity - comparedQuantity;
                }
                return Double.compare(_price, comparedPrice);
            }
            return myCollator.compare(_partner.getPartnerKey(), comparedPartner);
        }
        return myCollator.compare(_product.getProductId(), comparedProduct);
    }
}
