package com.company;

public class Fish {

    private String animalSpecies;
    private String color;
    private int life;


    void setAnimalSpecies(String an){
        this.animalSpecies = an;
    }
    void setColor(String fishColor){
        this.color = fishColor;
    }
    void setLife(int fishLife){
        this.life = fishLife;
    }




    String getAnimalSpecies(){
        return animalSpecies;
    }
    String getColor(){
        return color;
    }
    int getLife() {
       return life;
    }

    void canFish(){
        System.out.println("Дышет под водой ");
    }
}
