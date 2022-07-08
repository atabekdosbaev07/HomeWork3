package com.company;

public class Cat {
    private String animalSpecies;
    private String name;
    private String color;
    private int life;


    void setAnimalSpecies(String catAn){
        this.animalSpecies = catAn;
    }
    void setName(String catName){
        this.name = catName;
    }
    void setColor(String catColor){
        this.color = catColor;
    }
    void setLife(int catLife){
        this.life = catLife;
    }


    String getAnimalSpecies(){
        return animalSpecies;
    }
    String getName(){
        return name;
    }
    String getColor(){
        return color;
    }
    int getLife() {
        return life;
    }

    void canCat(){
        System.out.println("Быстро карабкается на поверхности");
        System.out.println("Ловит мышей");
    }


}
