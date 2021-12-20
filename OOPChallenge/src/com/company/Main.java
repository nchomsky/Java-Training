package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BaseBurger burger = new BaseBurger("Basic", "White", "Sausage", 3.56);
        double price = burger.itemizeBurger();
        burger.addHamburgerAddition1("Tomato", 0.25);
        burger.addHamburgerAddition2("Lettuce", 0.75);
        burger.addHamburgerAddition3("Cheese", 0.50);
    }
}
