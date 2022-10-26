package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        addArrayListLinkedList(arrayList, linkedList);
        System.out.println("Размер ArrayList: " + arrayList.size());
        System.out.println("Размер LinkedList: " + linkedList.size());

        getElement(arrayList, linkedList);

    }

    public static void addArrayListLinkedList(ArrayList<Integer> arrayList, LinkedList<Integer> linkedList) {

        int amountAdd = 1000000;

        Random random = new Random();
        int min = 0;
        int max = 10;
        int number = 0;
        for (int i = 0; i < amountAdd; i++) {
            number = min + random.nextInt(max - min);
            arrayList.add(number);
        }

        for (int i = 0; i < amountAdd; i++) {
            number = min + random.nextInt(max - min);
            linkedList.add(number);
        }
        //System.out.println("ArrayList: " + arrayList);
        //System.out.println("LinkedList: " + linkedList);
    }

    public static void getElement(ArrayList<Integer> arrayList, LinkedList<Integer> linkedList) {

        int amountGet = 100000;

        long startTime = System.nanoTime();
        for (int i = 0; i < amountGet; i++) {
            arrayList.get((int) (Math.random() * (arrayList.size() - 1)));
        }
        long resultTime = System.nanoTime() - startTime;
        System.out.println("\nПрошло времени в нс для ArrayList - " + resultTime);

        long startTime1 = System.nanoTime();
        for (int i = 0; i < amountGet; i++) {
            linkedList.get((int) (Math.random() * (linkedList.size() - 1)));
        }
        long resultTime1 = System.nanoTime() - startTime1;
        System.out.println("Прошло времени в нс для LinkedList - " + resultTime1);

        if (resultTime > resultTime1) {
            System.out.println("LinkedList быстрее ArrayList на " + (resultTime - resultTime1) + " нс.");
        } else {
            System.out.println("ArrayList быстрее LinkedList на " + (resultTime1 - resultTime) + " нс.");
        }

    }
}
