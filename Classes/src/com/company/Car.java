package com.company;

import java.util.Locale;

//public keyword is an access modifier that we use to determine what access we want to allow others to have
//public allows other classes to access this class
//by using private we are only allowing access to the internals of this class through the object. Not allowing outside access
public class Car {
    //    these are state/characteristics of the car
    //null is the internal default state for a class
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")){
//        use the keyword 'this' to reference the field of the class
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return model;
    }
}