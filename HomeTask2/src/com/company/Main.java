package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //#1 часы
        System.out.println("Введите время - часы:");
        Scanner in = new Scanner(System.in);
        int hours = in.nextInt();
        System.out.println("Введите время - минуты:");
        int min = in.nextInt();
        System.out.println("Введите время - секунды:");
        int sec = in.nextInt();
        int resultInSec = (hours*3600)+(min*60)+sec;
        System.out.printf("Вы ввели время (часы: минуты:секунды)- %d:%d:%d,", hours, min, sec);
        System.out.println( " что в секундах составляет - " + resultInSec);

        //#6 чётное ли число?
        System.out.println();
        System.out.println("Введите целое число");
        int number = in.nextInt();
        if(number%2 == 0){
            System.out.println("Вы ввели чётное число");
        }
        else{
            System.out.println("Вы ввели нечётное число");
        }

        //#8 время поезда в пути
        System.out.println();
        int h1 = 9;
        int m1 = 25;
        int h2 = 13;
        int m2 = 01;
        int resultInMinute = (h2*60+m2)-(h1*60+m1);
        System.out.printf("Отправление поезда в %d:%d. Прибытие поезда в %d:%02d.\n", h1, m1, h2,m2);
        System.out.println("Время поезда в пути " +resultInMinute+ " минут.");

        //#5 третье число
        System.out.println();
        System.out.println("Введите целое число, которое больше или равно 100:");
        int number1 = in.nextInt();
        System.out.println("Третья цифра справа ы вашем числе - " + number1 % 1000/100);

        //#7 реверс
        System.out.println();
        System.out.println("Введите целое трёхзначное число:");
        int number2 = in.nextInt();
        int num1 = number2 /100;
        int num2 = number2 %100/10;
        int num3 = number2 % 10;
        System.out.printf("Вы ввели число - %d, ваше число в обратном порядке - %d%d%d\n", number2, num3, num2, num1);

        //#7 реверс с массивом
        System.out.println();
        System.out.println("Введите целое трёхзначное число:");
        Scanner in1 = new Scanner(System.in);
        String number3 = in1.nextLine();
        String[] array;
        array = number3.split("");
        int n1 = Integer.parseInt(array[0]);
        int n2 = Integer.parseInt(array[1]);
        int n3 = Integer.parseInt(array[2]);
        System.out.println("Ваше число в обратном порядке - " +n3 + n2 + n1);


    }
}
