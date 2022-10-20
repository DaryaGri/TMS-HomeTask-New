package com.company;

public class Task3 {

    public static void main(String[] args) {
        String phoneNumber = "+--375(29) 663-82-20";
        boolean checkPhone = true;
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (checkPhoneNumber(phoneNumber.charAt(i))) {
                checkPhone = true;
            }else{
                System.out.println("Invalid phone number!");
                checkPhone = false;
                break;
            }
        }
        if(checkPhone) {
            for (int j = 0; j < phoneNumber.length(); j++) {
                if (!printNumber(phoneNumber.charAt(j))) {
                    System.out.print(phoneNumber.charAt(j));
                }
            }
        }


    }

    static char[] symbols = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '-', '(', ')', ' '};

    private static boolean checkPhoneNumber(char charAt) {
        for (int i = 0; i < symbols.length; i++) {
            if (charAt == symbols[i]) {
                return true;
            }
        }
        return false;
    }

    static char[] symbols1 = {'-', '(', ')', ' '};

    private static boolean printNumber(char charAt) {
        for (int i = 0; i < symbols1.length; i++) {
            if (charAt == symbols1[i]) {
                return true;
            }
        }
        return false;
    }
}
