package shop2;

import java.util.Date;

public class Sale {
    private final String productName;
    private final Date date;

    public Sale(String productName, Date date){
        this.productName = productName;
        this.date = date;
    }

    public String getProductName(){
        return productName;
    }

    public Date getDate(){
        return date;
    }

    @Override
    public String toString(){
        return "Product name = " + productName + ", date = " + date;
    }
}
