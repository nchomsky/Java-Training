package com.company;

public class HealthyBurger extends BaseBurger{

    private String addition5Name;
    private double addition5Price;

    private String addition6Name;
    private double addition6Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", "Brown Rye", meat, price);
    }

    public void addHamburgerAddition5(String name, double price){
        this.addition5Name = name;
        this.addition5Price = price;
    }

    public void addHamburgerAddition6(String name, double price){
        this.addition6Name = name;
        this.addition6Price = price;
    }

    @Override
    public double itemizeBurger() {
        double hamburgerPrice = super.itemizeBurger();
        if(addition5Name != null){
            hamburgerPrice += addition5Price;
        } else  if (addition6Name != null){
            hamburgerPrice += addition6Price;
        }
        return hamburgerPrice;
    }
}
