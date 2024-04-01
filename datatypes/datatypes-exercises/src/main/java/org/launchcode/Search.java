package org.launchcode;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {

        String aliceSentence = "Alice was beginning to get very " +
                "tired of sitting by her sister on the bank, and " +
                "of having nothing to do: once or twice she had peeped " +
                "into the book her sister was reading, but it had no " +
                "pictures or conversations in it, ‘and what is the use " +
                "of a book,’ thought Alice ‘without pictures or " +
                "conversation?’";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to search for: ");
        String searchTerm = scanner.nextLine();

        boolean found = aliceSentence.toLowerCase().contains(searchTerm.toLowerCase());

        if (found) {
            int index = aliceSentence.toLowerCase().indexOf(searchTerm.toLowerCase());
            int length = searchTerm.length();
            System.out.println("Index of the search term: " + index);
            System.out.println("Length of the search term: " + length);

            String updatedSentence = aliceSentence.replaceAll("(?i)" + searchTerm, "");

            System.out.println("Updated sentence: ");
            System.out.println(updatedSentence);
        } else {
            System.out.println("Search term \"" + searchTerm + "\" was found: " + found);
        }

        scanner.close();
    }
}
