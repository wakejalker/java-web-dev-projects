package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        double numMiles = input.nextDouble();

        System.out.println("How much gas did you use (in gallons)?");
        double numGallons = input.nextDouble();

        double mpg = numMiles / numGallons;

        System.out.println("YYou are running on " + mpg + " mpg.");
    }
}
