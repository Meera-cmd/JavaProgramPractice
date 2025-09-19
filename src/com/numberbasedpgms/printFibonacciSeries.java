package com.numberbasedpgms;

import java.util.Scanner;

//Q4. Print fibonacci series
public class printFibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of fibonacci numbers to be generated : ");
        int num = scanner.nextInt();

        System.out.println("The fibonacci series generated is : ");
        generateFibonaccoSeries(num);
    }

    public static void generateFibonaccoSeries(int num) {
        int first = 0;
        int second = 1;
        for (int i = 1; i <= num; i++) {
            System.out.println(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
