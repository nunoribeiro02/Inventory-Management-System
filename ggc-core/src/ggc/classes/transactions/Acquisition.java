package ggc.classes.transactions;

import ggc.classes.Date;
import ggc.classes.Partner;

public class Acquisition extends Transaction{

    private int _paidValue;
    private Date _datePaid;

    // Constructor
    public Acquisition(String partnerKey, String productId, int quantity){
        super(partnerKey, productId, quantity);
        _paidValue = 0;
        _datePaid = null;
    }

    // Getters and Setters
    public int getPaidValue(){
        return _paidValue;
    }

    public Date getDatePaid(){
        return _datePaid;
    }

    public void setPaidValue(int paidValue){
        _paidValue = paidValue;
    }

    public void setDatePaid(Date datePaid){
        _datePaid = datePaid;
    }
    

    // Methods

}
