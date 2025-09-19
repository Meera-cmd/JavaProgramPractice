package com.basicalgorithmcontrolflow;

import java.util.Scanner;

//Q8. Pgm to check if a year is leap year or not
public class checkLeapYearOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int num = scanner.nextInt();
        checkLeapYear(num);
    }

    public static void checkLeapYear(int year) {

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println(year + " is not a leap year");
                }
            } else {
                System.out.println(year + " is a leap year");
            }
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
