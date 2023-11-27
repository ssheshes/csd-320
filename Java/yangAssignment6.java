
/*Alexis Yang
 * CSD320 Module 5 Assignment
 * 19 November 2023

 The code should produce the following result:

               1               @
             1 2 1             @
           1 2 4 2 1           @
         1 2 4 8 4 2 1         @
      1 2 4 8 16 8 4 2 1       @
   1 2 4 8 16 32 16 8 4 2 1    @
1 2 4 8 16 32 64 32 16 8 4 2 1 @

Reference
https://stackoverflow.com/questions/33204775/java-pyramid-with-multiple-of-2-not-working
https://stackoverflow.com/questions/12265849/pyramid-of-numbers-in-java*/

public class yangAssignment6 {

    public static void main(String[] args) {

        // initialize variables where x = maximum number of rows and rowCount is the
        // current row
        int x = 7;
        int rowCount = 1;

        /*
         * Implementing the logic where i = spaces, when i is greater than 0,
         * perform the following actions
         */
        for (int i = x; i > 0; i--) {

            // Printing i*2 spaces at the beginning of each row, decreasing the spaces after
            // each loop as i decreases
            for (int j = 1; j <= i * 2; j++) {
                System.out.print("  ");
            }

            /*
             * Printing j value increases using math method that doubles its value,
             * where j value will be from 1 to rowCount
             */

            for (int j = 0; j <= rowCount - 1; j++) {
                System.out.printf("%4d", (int) Math.pow(2, j));
            }

            // Printing j value decreasing, where j value will be from rowCount-1 to 1

            for (int j = rowCount - 1; j >= 1; j--) {
                System.out.printf("%4d", (int) Math.pow(2, j - 1));
            }

            /*
             * print @ after each loop, can't figure out how to space it.
             * Will figure it out on my own time after this week.
             */
            for (int j = rowCount; j >= 1;) {
                System.out.print("@");
                break;
            }
            // print a new line after each loop
            System.out.println();

            // Incrementing the rowCount after each loop

            rowCount++;

        }
    }
}