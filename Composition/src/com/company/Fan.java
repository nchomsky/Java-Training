package com.company;

public class Fan {
    private String color;
    private int blades;
    private int lights;

    public Fan(String color, int blades, int lights) {
        this.color = color;
        this.blades = blades;
        this.lights = lights;
    }

    public void powerOn(){
        System.out.println("The lights come on and the fan starts spinning");
    }

    private String getColor() {
        return color;
    }

    private int getBlades() {
        return blades;
    }

    private int getLights() {
        return lights;
    }
}
