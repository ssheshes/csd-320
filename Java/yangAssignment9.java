
/*Alexis Yang
CSD 320 Assignment 9
4 December 2023
Write a program that reads and fills an array with 20 integers. Then, using the array elements, 
calculate the data to find and display:
The highest value entered.
The lowest value entered.
The average of the numbers entered.
The sum of the numbers entered.
Display this information in a readable display making the data easy to understand. */
import java.util.*;

public class yangAssignment9 {

        public static void main(String[] args) {

                // declare array variable

                final int ARRAY_SIZE = 20;

                int iArray[] = null;

                iArray = new int[ARRAY_SIZE];

                // assign 20 integers into array

                for (int i = 0; i < iArray.length; i++) {

                        iArray[i] = i * 2;

                }

                // prints values of the array

                for (int i = 0; i < iArray.length; i++)

                        System.out.println("iArray[" + i + "] = " + iArray[i]);

                // prints largest value in array

                int n = iArray.length;

                System.out.println("The largest value in the array is " + largest(iArray, n) + ".");

                // prints lowest value in array

                System.out.println("The lowest value in the array is " + lowest(iArray, n) + ".");

                // prints the average of the values of the array

                System.out.println("The average of the values within the array is " +

                                yangAssignment9.average(iArray) + ".");

                // prints the sum of the values of the array

                System.out.println("The sum of the values within the array is " +

                                yangAssignment9.arraySum(iArray) + ".");

        }

        // https://www.geeksforgeeks.org/java-program-for-program-to-find-largest-element-in-an-array/

        // finds highest value in array by sorting

        public static int largest(int[] iArray, int n) {

                Arrays.sort(iArray);

                return iArray[n - 1];

        }

        // finds lowest value in array by sorting

        public static int lowest(int[] iArray, int n) {

                Arrays.sort(iArray);

                return iArray[0];

        }

        // https://stackoverflow.com/questions/15628101/creating-a-method-to-return-the-average-of-values-of-an-array

        // finds average of values in array

        public static int average(int[] iArray) {

                int sum = 0;

                for (int i = 0; i < iArray.length; i++) {

                        sum = sum + iArray[i];

                }

                int result = sum / iArray.length;

                return result;

        }

        // finds sum of values in array

        public static int arraySum(int[] iArray) {

                int sum = 0;

                for (int i = 0; i < iArray.length; i++) {

                        sum = sum + iArray[i];

                }

                int result = sum;

                return result;

        }
}
