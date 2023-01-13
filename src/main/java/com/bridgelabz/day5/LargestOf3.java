package com.bridgelabz.day5;

import java.util.Scanner;

public class LargestOf3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int max = num1;
        if (num2 > max) {
            max = num2;
        } else if (num3 > max) {
            max = num3;
        }
        System.out.println("Largest number of the three is " + max);
    }
}
