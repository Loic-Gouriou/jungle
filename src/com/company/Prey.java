package com.company;

public class Prey {

    private int Age;
    private int AgeMax;
    private static final int AgeMaxAll = 42;

    private int NbLifePoints;
    private int NbLifePointsMax;
    private static final int NbLifePointsAll = 100;

    private Hearing hearing;
    private Vision vision;

    private Coords coords;

    public void moveToFeed(Plant plant){

    }
    public void runAway(Predator predator){

    }
    public void mate(){

    }
    public void eat(Plant plant){

    }
    public void drink(WaterSpot waterSpot){

    }
    public void move(){

    }

    public void update() {
        drink(Ecosystem.getInstance().getWaterSpot());
    }
}
