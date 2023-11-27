/*Alexis Yang
 * CSD320 Module 5 Assignment
 * 12 November 2023 */
public class yangAssignment5 {
    public static void main(String[] args) {

        int numerator = 1;
        double denominator = 3;
        double resultSum = 0;
        double result = (numerator / denominator);

        // original loop
        while (denominator < 99) {
            resultSum += result;
            System.out.print(numerator + "/" + denominator + " + ");
            ++denominator;
        }

        denominator = 99.0;
        System.out.print(numerator + "/" + denominator + " = " + resultSum);
        System.out.println();
        System.out.println();

        // result the values
        numerator = 1;
        resultSum = 0;

        // backward loop
        while (denominator > 3) {
            resultSum += result;
            System.out.print(numerator + "/" + denominator + " + ");
            --denominator;
        }

        denominator = 3.0;
        System.out.print(numerator + "/" + denominator + " = " + resultSum);
        System.out.println();
        System.out.println();
    }
}