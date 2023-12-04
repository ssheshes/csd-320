/*Alexis Yang
 * CSD320 Module 8 Assignment
 * 4 December 2023 */

public class yangAssignment8 {
    public static void main(String[] args) {

        // prints standard charge
        yangAssignment8.yearlyService();

        // prints charge + oil change
        System.out.printf("The standard service charge with an additional oil change fee of totals $"
                + "%.2f", yangAssignment8.yearlyService(10.00));

        // prints charge + oil change + tire rotation
        System.out.printf(
                "\nThe standard service charge with an additional oil change fee and a tire rotation charge totals $"
                        + "%.2f",
                yangAssignment8.yearlyService(10.00, 25.00));

        // prints charge + oil change + tire rotation - coupon
        System.out.printf(
                "\nThe standard service charge with an additional oil change fee and a tire rotation charge,"
                        + "\nalong with the deduction of an additional coupon totals $"
                        + "%.2f",
                yangAssignment8.yearlyService(10.00, 25.00, 5.00));

        System.out.println("\n");

        yangAssignment8.yearlyService();

        // prints charge + oil change
        System.out.printf("The standard service charge with an additional oil change fee of totals $"
                + "%.2f", yangAssignment8.yearlyService(20.00));

        // prints charge + oil change + tire rotation
        System.out.printf(
                "\nThe standard service charge with an additional oil change fee and a tire rotation charge totals $"
                        + "%.2f",
                yangAssignment8.yearlyService(20.00, 50.00));

        // prints charge + oil change + tire rotation - coupon
        System.out.printf(
                "\nThe standard service charge with an additional oil change fee and a tire rotation charge,"
                        + "\nalong with the deduction of an additional coupon totals $"
                        + "%.2f",
                yangAssignment8.yearlyService(20.00, 50.00, 15.00));
    }

    // yearlyService(no parameters) - Will return the standard service charge.
    public static void yearlyService() {
        System.out.println("The standard service charge is $50.00.");
    }

    // yearlyService(one parameter) - Will return the standard service charge with
    // an added oil change fee.
    public static double yearlyService(double fee) {

        return 50.00 + fee;

    }

    // yearlyService(two parameters) - Will return the standard service charge with
    // an added oil change fee and a tire rotation charge
    public static double yearlyService(double fee, double charge) {

        return 50 + fee + charge;

    }

    // yearlyService(three parameters) - Will return the standard service charge
    // with an added oil change fee, a tire rotation charge,
    // along with a coupon amount that will be deducted from the total cost.
    public static double yearlyService(double fee, double charge, double coupon) {

        return (50 + fee + charge) - coupon;

}
