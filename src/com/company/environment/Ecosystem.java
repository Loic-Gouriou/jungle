package com.company.environment;

import com.company.creatures.Predator;
import com.company.creatures.Prey;

public class Ecosystem {

    private int waterWidth;
    private int waterHeight;

    private Terrain Terrain;

    private static final int MAX_ARRAY_ELEMENTS = 10;
    private Predator[] predatorList;
    private Prey[] preyList;
    private Plant[] plantList;

    private static Ecosystem ecosystemInstance = null;

    static public Ecosystem getInstance(){
        if(ecosystemInstance == null){
        ecosystemInstance = new Ecosystem();
        }
        return ecosystemInstance;
    }

    private Ecosystem() {
        Terrain = new Terrain();
        predatorList = new Predator[MAX_ARRAY_ELEMENTS];
        preyList = new Prey[MAX_ARRAY_ELEMENTS];
        plantList = new Plant[MAX_ARRAY_ELEMENTS];

        for (int i = 0; i < MAX_ARRAY_ELEMENTS; i++) {
            predatorList[i] = new Predator();
            preyList[i] = new Prey();
            plantList[i] = new Plant();
        }
    }


    public void startLifeCycle() {
        while (true) {

            Terrain.update();

            for (Prey prey: preyList){
                prey.update();
            }

            for (Predator pred : predatorList){
                pred.update();
            }

            for (Plant plant : plantList){
                plant.update();
            }

            try {
                Thread.sleep(1000);
            }

            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public WaterSpot getWaterSpot(){
        return Terrain.getTerrainWaterSpot();
    }
}