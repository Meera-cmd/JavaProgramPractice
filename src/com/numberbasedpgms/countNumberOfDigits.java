package com.numberbasedpgms;

import java.util.Scanner;

//Q1. Pgm to count number of digits
public class countNumberOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        int digitCount = countDigit(num);
        System.out.println("The number of digits in the given number is : " + digitCount);
    }
    public static int countDigit(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}
