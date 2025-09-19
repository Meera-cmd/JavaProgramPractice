package com.basicalgorithmcontrolflow;

import java.util.Scanner;

//Q11. Pgm to find whether the number is prime or not
public class verifyPrimeNumberOrNot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        if (isPrime(num)) {
            System.out.println("The number is a prime number");
        } else {
            System.out.println("The number is not a prime number");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
