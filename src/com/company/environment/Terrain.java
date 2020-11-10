package com.company.environment;

import com.company.Drawable;

public class Terrain extends Drawable {

    int waterHeight = 30;
    int waterWidth = 120;

    private WaterSpot waterSpot;

    public Terrain() {

        waterHeight = 10;
        waterWidth = 120;
        waterSpot = new WaterSpot(1500, waterHeight / 4, waterWidth / 4);
    }

    public void update(){
        waterSpot.update();
    }
    public WaterSpot getTerrainWaterSpot(){
        return waterSpot;
    }

    public void draw(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < waterHeight; i++){
            for (int j = 0; j < waterWidth; j++){
                if (i==0 || i == waterHeight-1){
                    sb.append("_");
                }
                else if (j == 0 || j == waterWidth-1){
                    sb.append("|");
                }
                else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());

    }
}
