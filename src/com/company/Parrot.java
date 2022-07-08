package com.company;

public class Parrot {
    private String animalSpecies;
    private String color;
    private int life;


    void setAnimalSpecies(String parAn){
        this.animalSpecies = parAn;
    }
    void setColor(String parColor){
        this.color = parColor;
    }
    void setLife(int parLife){
        this.life = parLife;
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

    void canParrot(){
        System.out.println("Говорит");
        System.out.println("Летит");
    }

}
