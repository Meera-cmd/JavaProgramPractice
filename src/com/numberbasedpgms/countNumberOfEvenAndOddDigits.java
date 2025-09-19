package com.numberbasedpgms;

import java.util.Scanner;

//Q3. Pgm to count number of even and odd digits
public class countNumberOfEvenAndOddDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        countNumOfEvenOddDigit(num);
    }

    public static void countNumOfEvenOddDigit(int num) {
        int countEvenDigits = 0;
        int countOddDigits = 0;

        int digit = 0;
        while (num != 0) {
            digit = num % 10;

            if (digit % 2 == 0) {
                countEvenDigits++;
            } else {
                countOddDigits++;
            }
            num = num / 10;
        }
        System.out.println("The number of even digits in the given number is : " + countEvenDigits);
        System.out.println("The number of odd digits in the given number is : " + countOddDigits);

    }
}
