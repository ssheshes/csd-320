
/*Alexis Yang
* CSD 320 Assignment 11 
* 11 December 2023
* 
* Write methods using the following headers that returns the location of 
* the largest element in the array passed to the method returning 
* a one-dimensional array that contains two location elements.
public static int [] locateLargest (double [][] arrayParam) <-- <-- Not sure how and why to use this one
public static int [] locateLargest (int [][] arrayParam)
Then, write methods using the following headers that returns the location of 
the smallest element in the array passed to the method returning 
a one-dimensional array that contains two location elements.
public static int [] locateSmallest (double [][] arrayParam) <-- Not sure how and why to use this one
public static int [] locateSmallest (int [][] arrayParam)
*/

public class yangAssignment11 {

    public static void main(String[] args) {

        int[][] intTable = new int[5][4];

        yangAssignment11.fillMyArray(intTable);
        yangAssignment11.printMyArray(intTable);

        System.out.println("The largest element is: " + yangAssignment11.locateLargest(intTable));
        System.out.printf("%n");
        // yangAssignment11.printMyLocation(intTable);

        System.out.println("The smallest element is: " + yangAssignment11.locateSmallest(intTable));
        System.out.printf("%n");

    }

    public static void printMyArray(int[][] arrayParam) {

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; ++j) {

                System.out.print("[" + i + "][" + j + "] = " + arrayParam[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void fillMyArray(int[][] arrayParam) {
        for (int i = 0; i < arrayParam.length; ++i) {
            for (int j = 0; j < arrayParam[i].length; ++j) {
                arrayParam[i][j] = (int) (Math.random() * 90 + 10);
            }
        }
    }

    public static int locateLargest(int[][] arrayParam) {

        int i, j;

        // initialize max element
        int max = arrayParam[0][0];

        // traverse array elements
        // from second and compare
        // every element with current max
        for (i = 0; i < arrayParam.length; i++) {
            for (j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                }
            }
        }
        for (i = 0; i < arrayParam.length; i++) {
            for (j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] == max) {
                    System.out.println("The maximum element is in [" + i + "]" + "[" + j + "].");
                }
            }
        }
        return max;

    }

    public static int locateSmallest(int[][] arrayParam) {

        int i, j;

        // initialize max element
        int min = arrayParam[0][0];

        // traverse array elements
        // from second and compare
        // every element with current max
        for (i = 0; i < arrayParam.length; i++) {
            for (j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                }
            }
        }
        for (i = 0; i < arrayParam.length; i++) {
            for (j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] == min) {
                    System.out.println("The minimum element is in [" + i + "]" + "[" + j + "].");
                }
            }
        }
        return min;
    }
}
