package com.company.environment;

import com.company.creatures.Predator;
import com.company.creatures.Prey;
import org.fusesource.jansi.AnsiConsole;

import static org.fusesource.jansi.Ansi.ansi;

public class Ecosystem {



    private int waterWidth;
    private int waterHeight;

    private Terrain terrain;

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
        AnsiConsole.systemInstall();
        terrain = new Terrain();
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
            updateElements();
            drawElements();
            try {
                Thread.sleep(1000);
            }

            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public WaterSpot getWaterSpot(){
        return terrain.getTerrainWaterSpot();
    }

    private void updateElements(){
        terrain.update();

        for (Prey prey: preyList){
            prey.update();
        }

        for (Predator pred : predatorList){
            pred.update();
        }

        for (Plant plant : plantList){
            plant.update();
        }
    }

    private void drawElements(){

        System.out.println(ansi().eraseScreen());
        char escCode = 0x1B;
        int row = 0; int column = 0;

        System.out.print(String.format("%c[%d;%df",escCode,row,column));

        terrain.draw();

        for (Prey prey: preyList){
            prey.draw();
        }

        for (Predator pred : predatorList){
            pred.draw();
        }

        for (Plant plant : plantList){
            plant.draw();
        }
    }
}