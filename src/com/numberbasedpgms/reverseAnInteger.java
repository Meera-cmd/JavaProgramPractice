package com.numberbasedpgms;

import java.util.Scanner;

//Q5. Pgm to reverse an Integer
public class reverseAnInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        int reverseNum = reverseInteger(num);
        System.out.println("The reversed integer is : " + reverseNum);
    }

    public static int reverseInteger(int num) {
        int revNum = 0;
        int temp = 0;
        while (num != 0) {
            int digit = num % 10;
            revNum = temp * 10 + digit;
            num = num / 10;
            temp = revNum;
        }
        return revNum;
    }
}
