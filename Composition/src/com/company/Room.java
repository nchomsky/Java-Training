package com.company;

public class Room {
    private Bed theBed;
    private Dresser theDresser;
    private Fan theFan;

    public Room(Bed theBed, Dresser theDresser, Fan theFan) {
        this.theBed = theBed;
        this.theDresser = theDresser;
        this.theFan = theFan;
    }

    public void turnTheLightsOn(){
        theFan.powerOn();
        makeBed();
    }

    private void makeBed(){
        theBed.putDuvetOn();
    }


}
