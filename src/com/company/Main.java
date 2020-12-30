package com.company;
import animal.Cat;
import animal.Dog;

public class Main {

    public static void main(String[] args) {

        //Create Dog and Cat Objects

        Dog dog = new Dog("Doodle", "Friendly", 15, 2000.00);
        Cat cat= new Cat("Ragdoll", "Alert", 19, 1500.00);


        /*
        dog.setBreed("Doodle");
        cat.setBreed("Ragdoll");
        */


        System.out.println(dog.getBreed());
        System.out.println(dog.getBehavior());
        System.out.println(dog.getLifespan());
        System.out.println(dog.getPrice());
        System.out.println(dog.getSound());

        System.out.println(cat.getBreed());
        System.out.println(cat.getBehavior());
        System.out.println(cat.getLifespan());
        System.out.println(cat.getPrice());
        System.out.println(cat.getSound());




        /*
        Created Dog Object
        Dog dog1= new Dog("Doodle", 4, "Friendly", 2000.00);
        Dog dog2= new Dog("Golden Retriever", 2, "more friendly", 1500.00);

        Call setters

        dog1.setBreed("Doodle");
        dog1.setLifespan(15);
        dog1.setBehavior("Friendly");
        dog1.setPrice(2000.0);

        Call getters

        System.out.println("Breed: " +dog1.getBreed());
        System.out.println("Lifespan: " +dog1.getLifespan());
        System.out.println("Behavior: " +dog1.getBehavior());
        System.out.println("Price: " +dog1.getPrice());

        System.out.println("Breed: " +dog2.getBreed());
        System.out.println("Lifespan: " +dog2.getLifespan());
        System.out.println("Behavior: " +dog2.getBehavior());
        System.out.println("Price: " +dog2.getPrice());

         */






    }
}
