package com.company;

public class Task1 {
    /*Дата представлена строкой вида "15 июля 2016".
      Перевести её в цифровой формат "15.07.2016".
      День и месяц всегда представлять двумя цифрами, например: 03.04.2011.
      При неверном формате входной строки вернуть пустую строку.
	 */
    public static void main(String[] args) {

        String date = "15 июля 2016";
        String[] arrayDate = date.split("\\s|,|!|\\.");

        if (arrayDate[1].matches("[а-яёА-ЯЁ]+")) {
            arrayDate[1] = "07";
            int[] arrayInt = new int[3];
            for (int i = 0; i < arrayDate.length; i++) {
                arrayInt[i] = Integer.parseInt(arrayDate[i]);
            }
            for (int s : arrayInt) {
                System.out.printf("%02d.", s);
            }
        } else {
            System.out.println("");
        }

    }
}
