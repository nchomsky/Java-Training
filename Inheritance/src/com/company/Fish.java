package com.company;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){
        System.out.println("fish.rest() called");
    }

    private void moveMuscles(){
        System.out.println("fish.movemuscles() called");
    }

    private void moveBackFin(){
        System.out.println("fish.moveBackFin() called");
    }

    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
