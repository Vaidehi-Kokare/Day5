package com.bridgelabz.day5;

import java.util.Scanner;

public class HarmonicNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        double harmonicNo =0;
        for (int i = 1; i<=num; i++) {
            harmonicNo = harmonicNo +(float)1/i;
        }
        System.out.println(harmonicNo);
    }

}
