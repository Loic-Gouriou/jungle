package com.company.environment;

public class Terrain {

    int waterHeight = 30;
    int waterWidth = 120;

    private WaterSpot waterSpot;

    public Terrain() {

        waterHeight = 30;
        waterWidth = 120;
        waterSpot = new WaterSpot(1500, waterHeight / 4, waterWidth / 4);
    }

    public void update(){
        waterSpot.update();
    }
    public WaterSpot getTerrainWaterSpot(){
        return waterSpot;
    }
}
