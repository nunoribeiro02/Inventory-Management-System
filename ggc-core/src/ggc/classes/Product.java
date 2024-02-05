package ggc.classes;

public class Product{
    
    private double _maxPrice;
    private String id;

    public Product(String id){
        this.id = id;
        this._maxPrice = 0;
    }

    // Getters and Setters
    public double getMaxPrice(){
        return _maxPrice;
    }

    public String getId(){
        return id;
    }

    public void setMaxPrice(double maxPrice){
        this._maxPrice = maxPrice;
    }

    public void setId(String id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product ID: " + id + "| Max Price: " + _maxPrice;
    }
}
