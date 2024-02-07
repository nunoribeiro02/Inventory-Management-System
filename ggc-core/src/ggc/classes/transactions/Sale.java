package ggc.classes.transactions;

import ggc.classes.Date;
import ggc.classes.Partner;
import ggc.classes.Product;

class Sale extends Transaction {
    
    private int _baseValue;
    private int _sellValue;
    private Date _paymentDeadline;
    private Date _datePaid;

    // Constructor
    public Sale(String partnerKey, String productId, int quantity, Date paymentDeadline){
        super(partnerKey, productId, quantity);
        _baseValue = 0;
        _sellValue = null;
        _paymentDeadline = paymentDeadline;
        _datePaid = null;
    }

    // Getters and Setters
    public int getBaseValue(){
        return _baseValue;
    }

    public int getSellValue(){
        return _sellValue;
    }

    public Date getPaymentDeadline(){
        return _paymentDeadline;
    }

    public Date getDatePaid(){
        return _datePaid;
    }

    public void setBaseValue(int baseValue){
        _baseValue = baseValue;
    }

    public void setSellValue(int sellValue){
        _sellValue = sellValue;
    }

    public void setPaymentDeadline(Date paymentDeadline){
        _paymentDeadline = paymentDeadline;
    }

    public void setDatePaid(Date datePaid){
        _datePaid = datePaid;
    }

    // Methods

}
