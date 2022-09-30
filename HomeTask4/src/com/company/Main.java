package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //#1 средняя температура:
        //int[] month = {18, 20, 20, 21, 19, 20, 22, 25}; - можно в коде задать массив, а можно сканнер:
        System.out.println("Введите количество дней в вашем месяце:");
        Scanner in = new Scanner(System.in);
        int arrSize = in.nextInt();

        System.out.println("Введите температуру каждого дня месяца:");
        int month[] = new int[arrSize];
        for(int i=0; i<month.length; i++){
            month[i] = in.nextInt();
        }

        averageTemperature(month);
        System.out.println();

        //#2 замена низшей оценки:
        System.out.println("Your marks:");
        int[] marks = new int[10];
        Random random = new Random();
        int min = 1;
        int max = 11;
        int createMarks = 0;
        for (int i=0; i<marks.length; i++) {
            createMarks = min + random.nextInt(max - min);
            marks[i] = createMarks;
            System.out.print(marks[i] + " ");
        }

        System.out.println("\n"+"Your sorted marks:");
        insertionSort(marks);
        for(int i=0;i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        averageMark(marks);

        System.out.println("\n"+"Your upgraded marks:");
        for (int i:marks) {
            System.out.print(i + " ");
        }

    }
    public static void averageTemperature ( int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        int a = array.length;
        double result = (double) sum / a;
        System.out.printf("Средняя температура за данный месяц: %.2f°C", result);
    }
    public static void insertionSort (int[] array1){
        for (int i = 1; i < array1.length; i++) {
            int current = array1[i];
            int j = i - 1;
            while (j >= 0 && current < array1[j]) {
                array1[j + 1] = array1[j];
                j--;
            }
            array1[j + 1] = current;
        }
    }
    public static void averageMark( int[] array){
        int sum = 0;
        for (int i = 1; i < array.length; i++) {
            sum = sum + array[i];
        }
        int a = array.length-1;
        int result =  sum / a;
        System.out.printf("Your average mark without first min value: %d", result);
        array[0] = result;
    }

}