package com.numberbasedpgms;

import java.util.Scanner;

//Q7. Pgm to convert integer to octal number
public class convertIntegerToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer number : ");
        int num = scanner.nextInt();
        int octalNum = integerToOctal(num);
        System.out.println("The corresponding octal number of " + num + " : " + octalNum);
    }

    public static int integerToOctal(int num) {
        int i = 1, sum = 0, rem, temp;
        temp = num;
        while (temp != 0) { //59!=0   7!=0
            rem = temp % 8; //59%8=3  7%8=7
            sum = sum + i * rem; //0+1*3=3 3+10*7 =73 ---> final result
            i = i * 10; //1*10=10 10*10=100
            temp = temp / 8; //59/8=7 7/8=0
        }
        return sum;
    }
}
