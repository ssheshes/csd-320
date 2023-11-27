/*Alexis Yang
 * CSD 320 Assignment 7
 * 27 November 2023
 */

import java.util.*; // Import the Scanner class

public class yangAssignment7 {

    public static void main(String[] args) {
        String userPassword;
        boolean charCount;
        boolean checkInt;
        boolean checkChar;
        boolean checkUpper;
        boolean checkLower;

        try (Scanner password = new Scanner(System.in)) {
            System.out.print("Please create your password: ");
            userPassword = password.nextLine();

            // refers to countCheck to validate character count
            charCount = userPassword.length() > 8;
            yangAssignment7.countCheck(charCount);

            // validates if password contains int
            // https://stackoverflow.com/questions/29761008/java-character-input-validation
            checkInt = userPassword.matches(".*[0-9].*");
            yangAssignment7.intCheck(checkInt);

            // validates if password contains char
            checkChar = userPassword.matches(".*[a-zA-Z].*");
            yangAssignment7.charCheck(checkChar);

            // validates if password contains upper char
            checkUpper = userPassword.matches(".*[A-Z].*");
            yangAssignment7.upperCheck(checkUpper);

            // validates if password contains lower char
            checkLower = userPassword.matches(".*[a-z].*");
            yangAssignment7.lowerCheck(checkLower);

            // not sure how to loop user input until conditions are met;;

        }
    }

    // create eight characters parameters
    public static void countCheck(boolean charCount) {
        // if charCount is less than 8, print "Password must contain at least 8
        // characters"
        if (charCount == false)
            System.out.println("Password must contain at least 8 characters.");
        // If password contains 8 or more characters, user can continue
    }

    // create conditions that password must contain int
    public static void intCheck(boolean checkInt) {
        // if password doesn't contain int, print "Password must contain at least
        // 1 number"
        if (checkInt == false)
            System.out.println("Password must contain at least 1 number.");
        // If password contains 1 or more number, user can continue
    }

    // create conditions that password must contain char
    public static void charCheck(boolean checkChar) {
        // if password doesn't contain char, print "Password must contain at least
        // 1 letter"
        if (checkChar == false)
            System.out.println("Password must contain at least 1 letter.");
    }

    // must have one uppercase letter
    public static void upperCheck(boolean checkUpper) {
        // if password doesn't contain char, print "Password must contain at least
        // 1 uppercase letter"
        if (checkUpper == false)
            System.out.println("Password must contain at least 1 uppercase letter.");
    }

    // must have one lowercase letter
    public static void lowerCheck(boolean checkLower) {
        // if password doesn't contain char, print "Password must contain at least
        // 1 lowercase letter"
        if (checkLower == false)
            System.out.println("Password must contain at least 1 lowercase letter.");
    }

}