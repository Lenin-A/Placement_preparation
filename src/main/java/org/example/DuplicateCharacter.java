package org.example;



public class DuplicateCharacter {
    public static void main(String[] args) {
        String input = "programming";
        printDuplicateCharacters(input);
    }

        static void printDuplicateCharacters(String str) {
            System.out.println("Duplicate characters in the string are:");

            // Convert string to char array for iteration
            char[] chars = str.toCharArray();

            // Outer loop to pick a character
            for (int i = 0; i < chars.length; i++) {
                // Skip already checked characters
                if (chars[i] == '0') continue;

                int count = 1; // Start count for current character

                // Inner loop to compare with other characters
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        count++;
                        chars[j] = '0'; // Mark as visited
                    }
                }

                // Print the character if it appears more than once
                if (count > 1) {
                    System.out.println("'" + chars[i] + "' appears " + count + " times");
                }
            }
        }


    }
