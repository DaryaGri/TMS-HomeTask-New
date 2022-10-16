package com.company;

public enum Month {
    ЯНВАРЯ("01"), ФЕВРАЛЯ("02"), МАРТА("03"), АПРЕЛЯ("04"), МАЯ("05"),
    ИЮНЯ("06"), ИЮЛЯ("07"), АВГУСТА("08"), СЕНТЯБРЯ("09"), ОКТЯБРЯ("10"),
    НОЯБРЯ("11"), ДЕКАБРЯ("12");

    String numbermonth;
    Month(String numbermonth){
        this.numbermonth = numbermonth;
    }

    public String getNumbermonth() {
        return numbermonth;
    }
}
