package com.company;

public class Dog {
    private String animalSpecies;
    private String name;
    private String color;
    private int life;


    void setAnimalSpecies(String dogAn){
        this.animalSpecies = dogAn;
    }
    void setName(String dogtName){
        this.name = dogtName;
    }
    void setColor(String dogColor){
        this.color = dogColor;
    }
    void setLife(int dogLife){
        this.life = dogLife;
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

    void canDog(){
        System.out.println("Охраняет дом");
    }
}
