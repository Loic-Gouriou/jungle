package com.company;

public class Ecosystem {

    private int waterWidth;
    private int waterHeight;

    private WaterSpot waterSpot;


    public Ecosystem(){
        waterHeight = 30;
        waterWidth = 120;
        waterSpot = new WaterSpot(500, waterHeight/4, waterWidth/4);
    }

    public Ecosystem(WaterSpot waterSpot) {
        this.waterSpot = waterSpot;
    }
}
