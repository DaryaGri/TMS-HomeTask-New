package com.company;

public class Task2 {
    /*Дата представлена строкой вида "15.07.2016".
      Перевести её в строковый формат вида "15 июля 2016".
      При неверном формате входной строки вернуть пустую строку
    */
    public static void main(String[] args) {
        String date = "15.07.2016";
        String[] arrayDate = date.split("\\s|,|!|\\.");

        if (arrayDate[1].matches("\\d+")) {
            arrayDate[1] = "июля";
            for (String s : arrayDate) {
                System.out.print(s + " ");
            }
        } else {
            System.out.println("");
        }

    }
}
