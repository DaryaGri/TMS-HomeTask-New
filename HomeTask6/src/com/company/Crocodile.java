package com.company;

public class Crocodile extends Animal implements Actions{
    private int age;
    private int weight;

    public Crocodile(){

    }

    public Crocodile( String className, String animalGroup, String location, String food) {
        super(className, animalGroup, location, food);
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String info(int age, int weight){
        this.age = age;
        this.weight = weight;
        return "Age - " + getAge()+" years. " + "Weight - " + getWeight()+ "kg.";

    }

    @Override
    public void eat() {
        System.out.println("This crocodile eats "+ getFood());
    }

    @Override
    public void makeNoise() {
        System.out.println("This animal don't make any noise");
    }

}
