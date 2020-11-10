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
        this.coords = new Coords(0, 0);
    }

    public void update() {
        System.out.println("water quantity left : " + waterQuantity);
    }

    public int getWaterForDrink(int WaterQuantityRequested) {
        if (waterQuantity > WaterQuantityRequested) {
            waterQuantity -= WaterQuantityRequested;
            return WaterQuantityRequested;
        } else if (waterQuantity > 0) {
            WaterQuantityRequested = waterQuantity;
            waterQuantity = 0;

        }
        return WaterQuantityRequested;
    }
}
