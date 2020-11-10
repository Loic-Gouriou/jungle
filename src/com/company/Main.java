package com.company;

public class Main {

    public static void main(String[] args) {

        Ecosystem ecosystem = Ecosystem.getInstance();
        ecosystem.startLife();

        boolean utilisateurVoirAncien = true;
        if (utilisateurVoirAncien){
            ecosystem = Ecosystem.getInstance();
        }
    }
}
