package com.company;

public class Predator {

    private  static final int drinkQuantity = 3;

    private int Age;
    private int AgeMax;
    private static final int AgeMaxAll = 42;

    private int NbLifePoints;
    private int NbLifePointsMax;
    private static final int NbLifePointsAll = 100;

    private Smelling smelling;
    private Vision vision;

    private Coords coords;

    public void hunt(Prey prey){

    }
    public void mate(Predator predator){

    }
    public void eat(Prey prey){

    }
    public void drink(WaterSpot waterSpot){
        int waterAvalaible = waterSpot.getWaterForDrink(drinkQuantity);
    }
    public void move(){

    }

    public void update() {
        drink(Ecosystem.getInstance().getWaterSpot());
    }
}
