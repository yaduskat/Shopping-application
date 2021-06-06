package com.example.springboot.controller;

import com.example.springboot.Application;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.springboot.model.Product;

public class PriceController {
    //calculate price for a particular product and for a particular quantity
    @PostMapping("/home")
    public Product returnPrices(Product product,int qty) {
        double price=0;
        if (product.getName() == "Horseshoe") {
            double pricePerUnit = 825 / 5;
            int cartoonCount = qty / 5;
            int remainingUnits = qty % 5;
            if (remainingUnits == 0) {
                if (cartoonCount >= 3) {
                    price=  (cartoonCount * 825) - (cartoonCount * 825 * 0.1);
                } else {
                    price= (cartoonCount) * 825;
                }
            } else {
                if (cartoonCount < 3) {
                    price= (cartoonCount * 825) + (remainingUnits * pricePerUnit * 1.3);
                } else {
                    price= (cartoonCount * 825) + (remainingUnits * pricePerUnit * 1.3) - (cartoonCount * 825 * 0.1);
                }

            }
        } else if (product.getName() == "PenguinEars") {
            double pricePerUnit = 175 / 20;
            int cartoonCount = qty / 20;
            int remainingUnits = qty % 20;
            if (remainingUnits == 0) {
                if (cartoonCount >= 3) {
                    price= (cartoonCount * 175) - (cartoonCount * 175 * 0.1);
                } else {
                    price= (cartoonCount) * 175;
                }
            } else {
                if (cartoonCount < 3) {
                    price= (cartoonCount * 175) + (remainingUnits * pricePerUnit * 1.3);
                } else {
                    price= (cartoonCount * 175) + (remainingUnits * pricePerUnit * 1.3) - (cartoonCount * 175 * 0.1);
                }

            }
        }
        product.setPrice(price);
        return product;
    }

    //return price to show in the list with it's quantities upto 50
   /* public void returnPrice(Product prod){
        for(int a=1;a<=50;a++){
            prod.setQty(a);
            new PriceController().returnPrices(prod);
        }
    }*/
}
