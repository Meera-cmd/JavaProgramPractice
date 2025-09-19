package com.numberbasedpgms;

import java.util.Scanner;

//Q2. Pgm to Swap 2 integers without using 3rd variable
public class swapTwoIntegersWithoutThirdVariable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number (a): ");
        int a = scanner.nextInt();
        System.out.println("Enter second number (b): ");
        int b = scanner.nextInt();
        System.out.println("Swapping the numbers.....");
        swapNumbers(a, b);
    }
    public static void swapNumbers(int a, int b) {
        a = a - b;
        b = a + b;
        a = b - a;
        System.out.println("Swapped numbers are a : " + a + " b : " + b);
    }
}