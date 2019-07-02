package com.coding.sales.Entity;

import sun.awt.SunGraphicsCallback;

import java.io.OptionalDataException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * @author liyunze
 * @date 2019/7/2 18:23
 * @copyright Copyright © 2019 广电运通 All rights reserved.
 */
public class Product {
    private String productName;
    private String number;
    private String unit;
    private Double price;
    private String discountCard;
    private String fullReduction;

    public Product(String productName, String number, String unit, Double price, String discountCard, String fullReduction) {
        this.productName = productName;
        this.number = number;
        this.unit = unit;
        this.price = price;
        this.discountCard = discountCard;
        this.fullReduction = fullReduction;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDiscountCard() {
        return discountCard;
    }

    public void setDiscountCard(String discountCard) {
        this.discountCard = discountCard;
    }

    public String getFullReduction() {
        return fullReduction;
    }

    public void setFullReduction(String fullReduction) {
        this.fullReduction = fullReduction;
    }


    public  void getSubTotal(int num){
        double subTotal = this.price * num;
        String[] split = this.fullReduction.split(",");
        List<String> list = Arrays.asList(split);
        if(num > 4){
            if (list.contains("第3件半价")) {
                double cost1 = 2.5 * this.price;
            }
            if (list.contains("满3送1")) {
                double cost2 = (num - 1 ) * this.price;
            }
        }


    }
}
