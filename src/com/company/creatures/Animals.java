package com.company.creatures;

import com.company.environment.Coords;
import com.company.environment.Ecosystem;
import com.company.senses.Vision;
import com.company.environment.WaterSpot;

public class Animals {
    private Vision vision;

    private Coords coords;

    private  static final int drinkQuantity = 3;
    public void drink(WaterSpot waterSpot){
        int waterAvalaible = waterSpot.getWaterForDrink(drinkQuantity);
    }
    public void update() {
        drink(Ecosystem.getInstance().getWaterSpot());
    }
    public void mate(){

    }

}
