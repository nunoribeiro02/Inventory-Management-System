package ggc.classes.transactions;

import ggc.classes.Date;
import ggc.classes.Partner;
import ggc.classes.Product;

public class Sale extends Transaction {
    
    private int _baseValue;
    private int _sellValue;
    private int _paymentDeadline;
    private int _datePaid;

    // Constructor
    public Sale(int id, String partnerKey, String productId, int quantity, int paymentDeadline){
        super(id, partnerKey, productId, quantity);
        _baseValue = 0;
        _sellValue = 0;
        _paymentDeadline = paymentDeadline;
        _datePaid = 0;
    }

    // Getters and Setters
    public int getBaseValue(){
        return _baseValue;
    }

    public int getSellValue(){
        return _sellValue;
    }

    public int getPaymentDeadline(){
        return _paymentDeadline;
    }

    public int getDatePaid(){
        return _datePaid;
    }

    public void setBaseValue(int baseValue){
        _baseValue = baseValue;
    }

    public void setSellValue(int sellValue){
        _sellValue = sellValue;
    }

    public void setPaymentDeadline(int paymentDeadline){
        _paymentDeadline = paymentDeadline;
    }

    public void setDatePaid(int datePaid){
        _datePaid = datePaid;
    }

    // Methods

}
