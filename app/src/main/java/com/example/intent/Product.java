package com.example.intent;

public class Product {
    String ProductName;
    double ProductPrice;

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public double getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(double productPrice) {
        ProductPrice = productPrice;
    }

    public Product(String productName, double productPrice) {
        ProductName = productName;
        ProductPrice = productPrice;
    }
}
