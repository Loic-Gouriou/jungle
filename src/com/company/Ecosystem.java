package com.company;

public class Ecosystem {

    WaterSpot waterSpot;

    public Ecosystem(){
        waterSpot = new WaterSpot();
    }

    public Ecosystem(WaterSpot waterSpot) {
        this.waterSpot = waterSpot;
    }
}
