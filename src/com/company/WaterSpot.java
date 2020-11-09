package com.company;

public class WaterSpot {
    private int waterQuantity;
    private int waterWidth;
    private int waterHeight;
    Coords coords;

    public WaterSpot(int waterQuantity, int waterWidth, int waterHeight) {
        this.waterQuantity = waterQuantity;
        this.waterWidth = waterWidth;
        this.waterHeight = waterHeight;
        this.coords = new Coords(0,0);
    }
}
