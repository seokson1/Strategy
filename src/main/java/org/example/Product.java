package org.example;

public class Product {

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int discount(Coupon percentageCoupon) {
        return percentageCoupon.calc(price);
    }
}
