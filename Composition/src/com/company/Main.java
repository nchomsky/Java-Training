package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

//        Composition is a "Has-A" relationship (essentially objects that have objectS)
//        The pc has a case, has a monitor, and has a motherboard
        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();


        Dresser dresser = new Dresser("Brown", 6,35, 56, 18);
        Fan fan = new Fan("black", 5, 5);
//        Bed bed = new Bed("full", "ikea", new Duvet("green", "cotton", true) );

//        Room room = new Room(bed, dresser, fan);
//        room.turnTheLightsOn();

    }
}
