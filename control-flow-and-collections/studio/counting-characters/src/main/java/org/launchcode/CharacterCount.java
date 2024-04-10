package org.launchcode;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a string: ");
            String str = scanner.nextLine().toLowerCase();
            scanner.close();

//        String str = "I don't want to work, I just want to bang on the drums all day.";
        int count = 0;
//        int vCount = 0; // vowel count
//        int cCount = 0; // consonant count

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vCount++;
            } else if (str.charAt(i) > 'a' && str.charAt(i) < 'z') {
                cCount++;
            }
        }
    System.out.println("Total number of characters in string: " + count);

    }
}
