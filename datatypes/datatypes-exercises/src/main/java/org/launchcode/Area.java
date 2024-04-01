package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the length of the rectangle: ");
        double length  = scanner.nextDouble();

        System.out.println("Please enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double area = length * width;

        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }
}
