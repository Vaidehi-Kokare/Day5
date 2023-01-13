package com.bridgelabz.day5;

public class CoinSimulation {
    public static void main(String[] args) {
        int coinValue = (int)(Math.random()*10 % 2);
        int is_HEAD=1;
        if (coinValue==is_HEAD)
            System.out.println("Head");
        else
            System.out.println("Tail");
    }
}
