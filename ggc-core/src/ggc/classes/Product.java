package ggc.classes;

public class Product{
    
    private double _maxPrice;
    private String _id;
    private int _totalStock;

    public Product(String id){
        _id = id;
        _maxPrice = 0;
    }

    // Getters and Setters
    public double getMaxPrice(){
        return _maxPrice;
    }

    public String getProductId(){
        return _id;
    }

    public int getTotalStock(){
        return _totalStock;
    }

    public void setMaxPrice(double maxPrice){
        _maxPrice = maxPrice;
    }

    public void setProductId(String id){
        _id = id;
    }

    public void setTotalStock(int totalStock){
        _totalStock = totalStock;
    }

    /** 
     * @return String
     */
    @Override
    public String toString(){
        return _id + "|" + Math.round(_maxPrice) + "|" + _totalStock;
    }
}
