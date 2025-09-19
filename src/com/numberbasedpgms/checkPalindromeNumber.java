package com.numberbasedpgms;

import java.util.Scanner;

//Q8. Pgm to check if an integer is a palindrome or not
public class checkPalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        checkPalindrome(num);
    }

    public static void checkPalindrome(int num) {
        int revNum = 0;
        int temp = 0;
        int number = num;
        while (num != 0) {
            int digit = num % 10;
            revNum = temp * 10 + digit;
            num = num / 10;
            temp = revNum;
        }
        if (revNum == number) {
            System.out.println("The number " + number + " is palindrome");
        } else {
            System.out.println("The number " + number + " is not palindrome");
        }
    }
}
