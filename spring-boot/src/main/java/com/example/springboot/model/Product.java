package com.example.springboot.model;

public class Product {

    private String name;
    private String id;
    private double price;
    private double qty;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }


    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public double getQty() {
        return qty;
    }




}
