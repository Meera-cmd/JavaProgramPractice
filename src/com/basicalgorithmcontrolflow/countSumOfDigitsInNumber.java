package com.basicalgorithmcontrolflow;

import java.util.Scanner;

//Q9. Pgm to count the sum of digits in a number
public class countSumOfDigitsInNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        int sumOfDigit = countSumOfDigit(num);
        System.out.println("The sum of digits  : " + sumOfDigit);
    }

    public static int countSumOfDigit(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        return sum;
    }
}
