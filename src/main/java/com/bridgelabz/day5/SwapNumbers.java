package com.bridgelabz.day5;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();
        System.out.println("Numbers before swapping: " + num1 + " " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Numbers after swapping: " + num1 + " " + num2);
    }
}
