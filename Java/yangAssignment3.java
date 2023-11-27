/*Alexis Yang
CSD 320 Assignment 3
5 November 2023 */

import java.util.*;

public class yangAssignment3 {
    public static void main(String[] args) {

        int userInput;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("This is a game where 1 beats 3, 2 beats 1, and 3 beats 2.\n");
            System.out.print("Choose a number between 1-3: ");
            userInput = input.nextInt();
        }

        // run the game
        switch (userInput) {

            // user chooses 1
            case 1:
                System.out.print("You chose 1. ");
                if ((int) (Math.random() * 2 + 1) == 1) {
                    System.out.println("PC chose 1. You tied!");
                } else if ((int) (Math.random() * 2 + 1) == 2) {
                    System.out.println("PC chose 2. You lose!");
                } else {
                    System.out.println("PC chose 3. You win!");
                }
                break;

            // user chooses 2
            case 2:
                System.out.print("You chose 2. ");
                if ((int) (Math.random() * 2 + 1) == 1) {
                    System.out.println("PC chose 1. You win!");
                } else if ((int) (Math.random() * 2 + 1) == 2) {
                    System.out.println("PC chose 2. You tied!");
                } else {
                    System.out.println("PC chose 3. You lose!");
                }
                break;

            // user chooses 3
            case 3:
                System.out.print("You chose 3. ");
                if ((int) (Math.random() * 2 + 1) == 1) {
                    System.out.println("PC chose 1. You lose!");
                } else if ((int) (Math.random() * 2 + 1) == 2) {
                    System.out.println("PC chose 2. You win!");
                } else {
                    System.out.println("PC chose 3. You tied!");
                }
                break;
        }
    }
}
