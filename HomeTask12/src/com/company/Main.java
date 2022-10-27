package com.company;

import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Samsung Galaxy S21", 1050));
        phones.add(new Phone("Apple iPhone 12", 1100));
        phones.add(new Phone("Xiaomi Redmi Note 11 Pro", 625));

        phones.stream().sorted(new PhoneComparator()).forEach(p ->
                System.out.printf("Price without discount: %s - %d$\n", p.getName(), p.getPrice()));
        System.out.println();

        System.out.println("Enter season name:");
        String nameSeason = new Scanner(System.in).nextLine();

        phones.stream().sorted(new PhoneComparator()).forEach(p -> System.out.printf(nameSeason +
                " price: %s - %.2f$\n", p.getName(), p.getSeasonDiscount(nameSeason)));

    }

    static class PhoneComparator implements Comparator<Phone> {

        @Override
        public int compare(Phone a, Phone b) {
            if (a.getPrice() > b.getPrice()) {
                return 1;
            } else if (a.getPrice() == b.getPrice()) {
                return 0;
            } else {
                return -1;
            }
        }
    }
}
