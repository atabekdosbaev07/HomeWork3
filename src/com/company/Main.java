package com.company;

public class Main {
    public static void main(String[] args) {

        Fish fish = new Fish();
        fish.setAnimalSpecies("Fish");
        fish.setColor("gold");
        fish.setLife(15);
        fish.canFish();
        System.out.println("Вид: "+fish.getAnimalSpecies());
        System.out.println("Цвет: "+fish.getColor());
        System.out.println("Жизнь: "+fish.getLife());
        System.out.println();

        Parrot parrot = new Parrot();
        parrot.setAnimalSpecies("Bird");
        parrot.setColor("green");
        parrot.setLife(40);
        parrot.canParrot();
        System.out.println("Вид: "+parrot.getAnimalSpecies());
        System.out.println("Цвет: "+parrot.getColor());
        System.out.println("Жизнь: "+parrot.getLife());
        System.out.println();

        Cat cat = new Cat();
        cat.setAnimalSpecies("domestic cat");
        cat.setName("Тom");
        cat.setColor("White");
        cat.setLife(15);
        cat.canCat();
        System.out.println("Вид: "+cat.getAnimalSpecies());
        System.out.println("Имя: "+cat.getName());
        System.out.println("Цвет: "+cat.getColor());
        System.out.println("Жизнь: "+cat.getLife());
        System.out.println();

        Dog dog = new Dog();
        dog.setAnimalSpecies("domestic dog");
        dog.setName("Balto");
        dog.setColor("black");
        dog.setLife(13);
        dog.canDog();
        System.out.println("Вид: "+dog.getAnimalSpecies());
        System.out.println("Имя: "+dog.getName());
        System.out.println("Цвет: "+dog.getColor());
        System.out.println("Жизнь: "+dog.getLife());
        System.out.println();
    }

}