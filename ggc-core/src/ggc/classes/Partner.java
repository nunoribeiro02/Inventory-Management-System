package ggc.classes;

public class Partner {
    private String _partnerKey;
    private String _name;
    private String _address;
    private int _points;
    private double _valueAcquisitions;
    private double _valueSales;
    private double _valuePaidSales;
    
    // Constructor

    public Partner(String partnerKey, String name, String address){
        _partnerKey = partnerKey;
        _name = name;
        _address = address;
        _points = 0;
        _valueAcquisitions = 0;
        _valueSales = 0;
        _valuePaidSales = 0;
    }

    // Getters Setters
    public String getPartnerKey(){
        return _partnerKey;
    }

    public String getName(){
        return _name;
    }

    public String getAddress(){
        return _address;
    }

    public int getPoints(){
        return _points;
    }

    public double getValueAcquisitions(){
        return _valueAcquisitions;
    }

    public double getValueSales(){
        return _valueSales;
    }

    public double getValuePaidSales(){
        return _valuePaidSales;
    }

    public void setPartnerKey(String partnerKey){
        _partnerKey = partnerKey;
    }

    public void setName(String name){
        _name = name;
    }

    public void setAddress(String address){
        _address = address;
    }

    public void setPoints(int points){
        _points = points;
    }

    public void setValueAcquisitions(double valueAcquisitions){
        _valueAcquisitions = valueAcquisitions;
    }

    public void setValueSales(double valueSales){
        _valueSales = valueSales;
    }

    public void setValuePaidSales(double valuePaidSales){
        _valuePaidSales = valuePaidSales;
    }

    // Methods
    
}
