package com.company;

public class BaseBurger {
    private String name;
    private String rollType;
    private String meat;
    private double price;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;
    public BaseBurger(String name, String rollType, String meat, double price) {
        this.name = name;
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeBurger(){
        double hamburgerPrice = this.price;
        if(addition1Name != null){
            hamburgerPrice += this.addition1Price;
        } else if(addition2Name != null){
            hamburgerPrice += this.addition2Price;
        } else if(addition3Name != null){
            hamburgerPrice += this.addition3Price;
        }else if(addition4Name != null){
            hamburgerPrice += this.addition4Price;
        }

        return hamburgerPrice;
    }

}

