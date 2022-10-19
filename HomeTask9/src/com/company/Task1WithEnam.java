package com.company;

import java.util.Scanner;

public class Task1WithEnam {

    public static void main(String[] args) {
        System.out.println("Введите дату - число, месяц, год:");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();

        String[] arrayDate = date.split("\\s|,|!|\\.");
        if (arrayDate[1].matches("[а-яёА-ЯЁ]+")) {
            for (Month month : Month.values()) {
                if (month.name().equalsIgnoreCase(arrayDate[1])) {
                    System.out.printf("%s.%s.%s.", arrayDate[0], month.getNumbermonth(), arrayDate[2]);
                }
            }
        } else {
            System.out.println("Введён некорректный формат даты");
        }

    }
}
