package com.company;

import java.util.Objects;

public class Cat extends Animal implements Actions{
    private String color;
    private int numOfMiceCaught;

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumOfMiceCaught(int numOfMiceCaught) {
        this.numOfMiceCaught = numOfMiceCaught;
    }

    public String getColor() {
        return color;
    }

    public int getNumOfMiceCaught() {
        return numOfMiceCaught;
    }
    public Cat(){
    }

    public Cat(String className, String animalGroup, String color, String location, String food) {
        super(className, animalGroup, location, food);
        this.color = color;
    }

    public void miceCaught(){
        System.out.printf("Cat has caught %d mice \n", getNumOfMiceCaught());
    }

    @Override
    public void eat() {
        System.out.println("Cat eats "+ getFood());
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow-Meow");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return color.equals(cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }
}

