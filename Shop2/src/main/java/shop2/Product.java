package shop2;

public class Product {
    public final String name;
    private final double price;
    private double quantity;
    private final String measurement;

    public Product(String name,double price,double quantity,String measurement){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.measurement = measurement;
    }

    public void setQuantity(double quantity){
        this.quantity = quantity;
    }

    public String getName(){
        return  name;
    }

    public double getPrice(){
        return price;
    }

    public double getQuantity(){
        return quantity;
    }

    public String getMeasurement(){
        return  measurement;
    }
    @Override
    public String toString(){
        return "name = " + name + ", price = " + price + ", quantity = " + quantity + ", measurement = "+ measurement;
    }
}
