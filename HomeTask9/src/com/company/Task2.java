package com.company;

public class Task2 {
    /*Дата представлена строкой вида "15.07.2016".
      Перевести её в строковый формат вида "15 июля 2016".
      При неверном формате входной строки вернуть пустую строку
    */
    public static void main(String[] args) {
        String date = "15.07.2016";
        String[] arrayDate = date.split("\\s|,|!|\\.");

        String second = arrayDate[1];
        if (arrayDate[1].matches("\\d+")) {

            switch (second) {
                case "01":
                    arrayDate[1] = second.replace("01", "января");
                    break;
                case "02":
                    arrayDate[1] = second.replace("02", "февраля");
                    break;
                case "03":
                    arrayDate[1] = second.replace("03", "марта");
                    break;
                case "04":
                    arrayDate[1] = second.replace("04", "апрел");
                    break;
                case "05":
                    arrayDate[1] = second.replace("05", "мая");
                    break;
                case "06":
                    arrayDate[1] = second.replace("06", "июня");
                    break;
                case "07":
                    arrayDate[1] = second.replace("07", "июля");
                    break;
                case "08":
                    arrayDate[1] = second.replace("08", "августа");
                    break;
                case "09":
                    arrayDate[1] = second.replace("09", "сентября");
                    break;
                case "10":
                    arrayDate[1] = second.replace("10", "октября");
                    break;
                case "11":
                    arrayDate[1] = second.replace("11", "ноября");
                    break;
                case "12":
                    arrayDate[1] = second.replace("12", "декабря");
                    break;
            }
            for (String s : arrayDate) {
                System.out.print(s + " ");
            }
        } else {
            System.out.println("");
        }

    }
}
