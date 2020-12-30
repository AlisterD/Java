package com.company;
import animal.Dog;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //Created Dog Object
        Dog dog1= new Dog();

        //Call setters
        dog1.setBreed("Doodle");
        dog1.setLifespan(15);
        dog1.setBehavior("Friendly");
        dog1.setPrice(2000.0);

        //Call getters

        System.out.println("Breed: " +dog1.getBreed());
        System.out.println("Lifespan: " +dog1.getLifespan());
        System.out.println("Behavior: " +dog1.getBehavior());
        System.out.println("Price: " +dog1.getPrice());






    }
}
