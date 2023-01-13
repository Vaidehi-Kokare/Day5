package com.bridgelabz.day5;

public class Triplet {
    static void findTriplet(int[] Numbers) {
        boolean found = false;
        for (int i = 0; i < Numbers.length - 2; i++) {
            for (int j = i + 1; i < Numbers.length - 1; i++) {
                for (int k = j+1; k < Numbers.length; k++) {
                    if (Numbers[i] + Numbers[j] + Numbers[k] == 0) {
                        System.out.println(Numbers[i] + " " + Numbers[j] + " " + Numbers[k]);

                        found = true;

                    }
                }
            }
        }

        if (found == false)
            System.out.println("Triplet does not exist");
    }

    public static void main(String[] args) {

        int[] Numbers = { 0, -1, 2, -3, 1, 4 };
        findTriplet(Numbers);

    }

}