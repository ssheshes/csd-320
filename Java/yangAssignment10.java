/*
 * Alexis Yang
 * CSD 320 Assignment 10
 * 11 December 2023
 * 
 * Write four overloaded methods that return the average of an array with the
 * following headers:
 * public static short average(short [] array)
 * public static int average(int [] array)
 * public static long average(long [] array)
 * public static double average(double [] array)
 * Write a test program that invokes each of these methods
 * and then displays the average value returned along with a display of the
 * original array elements. Ensure the display is easy to read and
 * understandable. Lastly, each array sent into the methods must be of different
 * sizes to ensure the method code is correctly written.
 */

public class yangAssignment10 {

    public static void main(String[] args) {

        // initialize arrays and their types
        short iArray1[] = new short[10];
        int iArray2[] = new int[7];
        long iArray3[] = new long[15];
        double iArray4[] = new double[5];

        // fill all arrays
        yangAssignment10.fillMyArray(iArray1);
        yangAssignment10.fillMyArray(iArray2);
        yangAssignment10.fillMyArray(iArray3);
        yangAssignment10.fillMyArray(iArray4);

        // print SHORT array
        yangAssignment10.printMyArray(iArray1);
        System.out.printf("%n");

        // print SHORT average
        System.out.println("The average of this SHORT array is: " + yangAssignment10.average(iArray1));
        System.out.printf("%n");

        // print INT array
        yangAssignment10.printMyArray(iArray2);
        System.out.printf("%n");

        // print INT average
        System.out.println("The average of this INT array is: " + yangAssignment10.average(iArray2));
        System.out.printf("%n");

        // print LONG array
        yangAssignment10.printMyArray(iArray3);
        System.out.printf("%n");

        // print LONG average
        System.out.println("The average of this LONG array is: " + yangAssignment10.average(iArray3));
        System.out.printf("%n");

        // print DOUBLE array
        yangAssignment10.printMyArray(iArray4);
        System.out.printf("%n");

        // print DOUBLE average
        System.out.println("The average of this DOUBLE array is: " + yangAssignment10.average(iArray4));
        System.out.printf("%n");

    }

    // method to print SHORT array
    public static void printMyArray(short[] arrayParam) {

        for (int i = 0; i < arrayParam.length; i++) {

            System.out.print("[" + i + "] = " + arrayParam[i] + ", ");

        }
    }

    // method to print INT array
    public static void printMyArray(int[] arrayParam) {

        for (int i = 0; i < arrayParam.length; i++) {

            System.out.print("[" + i + "] = " + arrayParam[i] + ", ");

        }
    }

    // method to print LONG array
    public static void printMyArray(long[] arrayParam) {

        for (int i = 0; i < arrayParam.length; i++) {

            System.out.print("[" + i + "] = " + arrayParam[i] + ", ");

        }
    }

    // method to print DOUBLE array
    public static void printMyArray(double[] arrayParam) {

        for (int i = 0; i < arrayParam.length; i++) {

            System.out.print("[" + i + "] = " + arrayParam[i] + ", ");

        }
    }

    // SHORT fill array with random numbers from 1 through 10
    public static void fillMyArray(short[] arrayParam) {

        for (short i = 0; i < arrayParam.length; ++i) {
            arrayParam[i] = (short) (Math.random() * 10);
        }
    }

    // INT fill array with random numbers from 1 through 10
    public static void fillMyArray(int[] arrayParam) {

        for (int i = 0; i < arrayParam.length; ++i) {
            arrayParam[i] = (int) (Math.random() * 10);
        }
    }

    // LONG fill array with random numbers from 1 through 10
    public static void fillMyArray(long[] arrayParam) {

        for (long i = 0; i < arrayParam.length; ++i) {
            arrayParam[(int) i] = (long) (Math.random() * 10);
        }
    }

    // DOUBLE fill array with random numbers from 1 through 10
    public static void fillMyArray(double[] arrayParam) {

        for (double i = 0; i < arrayParam.length; ++i) {
            arrayParam[(int) i] = (double) (Math.random() * 10);
        }
    }

    // SHORT return average value
    public static short average(short[] array) {

        short sum = 0;
        short i;
        // short average = (short) (sum / array.length);

        for (i = 0; i < array.length; i++)
            sum += array[i];

        return (short) (sum / array.length);

    }

    // INT return average value
    public static int average(int[] array) {

        int sum = 0;
        int i;
        // int average = sum / array.length;

        for (i = 0; i < array.length; i++)
            sum += array[i];

        return sum / array.length;

    }

    // LONG return average value
    public static long average(long[] array) {

        long sum = 0;
        long i;
        // long average = sum / array.length;

        for (i = 0; i < array.length; i++)
            sum += array[(int) i];

        return sum / array.length;

    }

    // DOUBLE return average value
    public static double average(double[] array) {

        double sum = 0;
        double i;
        // double average = sum / array.length;

        for (i = 0; i < array.length; i++)
            sum += array[(int) i];

        return sum / array.length;

    }
}