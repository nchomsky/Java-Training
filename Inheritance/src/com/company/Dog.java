package com.company;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
//       Super will make it so that the parent classes method is called (the method dog 'inherited'!)
        super.move(10);
    }

    public void run(){
        System.out.println("Dog.run called");
        move(20);
    }
//    methods specific to a class should be private so no other classes/objects can access that method for that class
    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called.");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
