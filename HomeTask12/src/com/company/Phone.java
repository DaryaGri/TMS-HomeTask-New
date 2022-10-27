package com.company;


interface SeasonPrice {
    double result(double x, double y);
}

public class Phone {
    private String name;
    private int price;

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getDiscount(int discount, SeasonPrice func) {
        return func.result(discount, price);
    }

    public double getSeasonDiscount(String season) {
        switch (season) {
            case "winter":
                return getDiscount(30, (discount, currPrice) -> {
                    return currPrice - (currPrice * discount / 100);
                });
            case "spring":
                return getDiscount(12, (discount, currPrice) -> {
                    return currPrice - discount * 2;
                });
            case "summer":
                return getDiscount(17, (discount, currPrice) -> {
                    return currPrice - (currPrice * discount / 100);
                });
            case "autumn":
                return getDiscount(5, (discount, currPrice) -> {
                    return currPrice - (currPrice * discount / 100);
                });
            default:
                return price;
        }
    }

}

