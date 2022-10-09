package com.company;

import java.util.Objects;

public abstract class Animal {
    private String className;
    private String animalGroup;
    private String location;
    private String food;

    public Animal() {
        System.out.println("Please, set parameters for your object");
    }
    public Animal(String className, String animalGroup, String location, String food){
        this.className = className;
        this.location = location;
        this.animalGroup = animalGroup;
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public String getFood() {
        return food;
    }

    public String getClassName() {
        return className;
    }

    public String getAnimalGroup() {
        return animalGroup;
    }

    public void hunting(String victim){
        System.out.printf("This %s hunts %s\n" ,getClassName(), victim);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(className, animal.className) &&
                Objects.equals(animalGroup, animal.animalGroup) &&
                Objects.equals(location, animal.location) && Objects.equals(food, animal.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(className, animalGroup, location, food);
    }

    @Override
    public String toString() {
        return "Animal " + className +": " +
                "animalGroup - " + animalGroup +
                ", location - " + location + ".";
    }
}
