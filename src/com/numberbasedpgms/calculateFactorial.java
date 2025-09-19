package com.numberbasedpgms;

import java.util.Scanner;

//Q6. Pgm to find the factorial of a number // 4!= 4*3*2*1 =24
public class calculateFactorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        int result = calculateFactorial(num);
        System.out.println("The factorial of " + num + " : " + result);
    }

    public static int calculateFactorial(int num) {
        int result = 1;
        if (num == 0 | num == 1) {
            return 1;
        }
        for (int i = 2; i <= num; i++) {
            result *= i; //1*2=2  2*3=6  6*4=24 if num=4
        }
        return result; //24
    }
}
