package ggc.classes;

public class Partner {
    private String _partnerKey;
    private String _name;
    private String _adress;
    private int _points;
    private double _valueAcquisitions;
    private double _valueSales;
    private double _valuePaidSales;
        
    // Getters Setters
    public String getPartnerKey(){
        return _partnerKey;
    }

    public String getName(){
        return _name;
    }

    public String getAdress(){
        return _adress;
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

    public void setAdress(String adress){
        _adress = adress;
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
