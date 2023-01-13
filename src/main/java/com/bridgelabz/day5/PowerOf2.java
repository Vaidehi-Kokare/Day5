package com.bridgelabz.day5;
import java.util.Scanner;
public class PowerOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        System.out.println("Power Table of 2 till " + num + " :");
        int product = 1;
        for (int i=1; i<=num; i++) {
            product =product*2;
            System.out.println(i+ " -> " + product);
        }

    }
}
