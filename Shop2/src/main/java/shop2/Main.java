package shop2;
import shop2.Product;
import shop2.Shop2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Shop2 miniMart = new Shop2();
        String result = miniMart.addProduct();
        JOptionPane.showConfirmDialog(null, miniMart.addProduct());

        for (Product product: miniMart.readAllProducts()) {
            System.out.println(product.toString());
        }

        miniMart.buyProduct();

        JOptionPane.showConfirmDialog(null,miniMart.addCustomer());

        for (Sale sale: miniMart.readAllSales()) {
            System.out.println(sale.toString());
        }
    }
}