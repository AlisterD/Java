package com.company;
import animal.Animal;
import animal.Cat;
import animal.Dog;

public class Main {

    public static void main(String[] args) {

        //Create Dog and Cat Objects from subclass

        Dog dog = new Dog("Doodle", "Friendly", 15, 2000.00);
        Cat cat= new Cat("Ragdoll", "Alert", 19, 1500.00);

        //From SuperClass
        Animal dog2 = new Dog("bulldog", "calm", 13, 500.00);
        //casting from Subclass to SuperClass
        System.out.println(((Dog)dog2).getSound());


        if(dog instanceof Dog)
            System.out.println("dog is an instance of Dog");
        if(cat instanceof Cat)
            System.out.println("cat is an instance of Cat");
        if(dog2 instanceof Dog)
            System.out.println("dog2 is an instance of Dog");
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


        //call static members
        Animal.setSeller("Petco");
        System.out.println(Animal.getSeller());

        //notice how it gets from superclass from line above
        System.out.println(dog.getSeller());
        System.out.println(cat.getSeller());







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
