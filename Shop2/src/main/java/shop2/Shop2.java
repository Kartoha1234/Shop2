package shop2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;

public class Shop2 {
    public ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Sale> sales = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();

    public String addProduct(){
        String name = JOptionPane.showInputDialog("Enter product name");
        double price = Double.parseDouble(JOptionPane.showInputDialog("Enter product price"));
        String[] availableMeasurement = {"KG", "Item", "MB", "Liters"};
        String measurement = (String) JOptionPane.showInputDialog(
                null,
                "Select product measurement",
                "Product measurement",
                JOptionPane.QUESTION_MESSAGE,
                null,
                availableMeasurement,
                availableMeasurement[0]);
        double quantity = Double.parseDouble(JOptionPane.showInputDialog("Enter product quantity"));
        Product product = new Product(name,price,quantity,measurement);
        this.products.add(product);
        System.out.println(this.products);
        return "Product added successfully";
    }

    public ArrayList<Product> readAllProducts(){
        return products;
    }

    public void deleteProductByName(String name){
        products.removeIf(n ->(n.getName() == name));
    }

    public String addCustomer(){
        String name = JOptionPane.showInputDialog("Enter customer name");
       int ID = Integer.parseInt(JOptionPane.showInputDialog("Enter customer ID"));
        Customer customer = new Customer(name,ID);
        this.customers.add(customer);
        System.out.println(this.customers);
        return "Customer added successfully";

    }

    public String buyProduct(){
        String name = JOptionPane.showInputDialog("Enter product name to buy");
        deleteProductByName(name);
        sales.add(new Sale(name, new Date(System.currentTimeMillis())));
        return "Customer bought the product" + name;
    }

    public ArrayList<Sale> readAllSales(){
        return sales;
    }

}
