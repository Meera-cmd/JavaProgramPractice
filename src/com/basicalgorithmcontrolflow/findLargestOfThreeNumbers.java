package com.basicalgorithmcontrolflow;

import java.util.Scanner;

//Q10. Pgm to find largest among 3 numbers
public class findLargestOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter the second number : ");
        int secondNum = scanner.nextInt();
        System.out.println("Enter the third number : ");
        int thirdNum = scanner.nextInt();
        int largestNumber = findLargestThreeNumbers(firstNum, secondNum, thirdNum);
        System.out.println("The largest number is : " + largestNumber);
    }

    public static int findLargestThreeNumbers(int num1, int num2, int num3) {
        int largestNum;
        if (num1 >= num2 && num1 >= num3) {
            largestNum = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largestNum = num2;
        } else {
            largestNum = num3;
        }
        return largestNum;
    }
}
