/*Alexis Yang
CSD 320 Assignment 4
5 November 2023 */

import java.util.*;

public class yangAssignment4 {

    public static void main(String[] args) {

        // initialize values
        String userInput1;
        String userInput2;

        try (Scanner input = new Scanner(System.in)) {
            // user input
            System.out.print("Enter your first string: ");
            userInput1 = input.nextLine();
            System.out.print("Enter your second string: ");
            userInput2 = input.nextLine();
        }

        // try except from W3Schools
        try {
            if (userInput1.indexOf(userInput2) > 0) {
                System.out.println("The second string is a substring of the first string.");
            } else if (userInput2.indexOf(userInput1) > 0) {
                System.out.println("The first string is a substring of the second string.");
            } else {
                System.out.println("Neither strings are substrings of the other.");
            }
        } catch (Exception e) {
            System.out.println("Error. Try again.");
        }
    }
}
