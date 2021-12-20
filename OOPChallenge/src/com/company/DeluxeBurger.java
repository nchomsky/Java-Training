package com.company;

public class DeluxeBurger extends BaseBurger{
    public DeluxeBurger() {
        super("Deluxe", "White", "Sausage and Bacon", 14.54);
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Soda", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

}
