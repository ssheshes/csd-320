
/*Alexis Yang
CSD 320 Assignment 2
30 October 2023 */
import java.util.*;

public class yangAssignment2 {
    public static void main(String[] args) {

        double waterMass;
        double finalTemperature;
        double initialTemperature;
        double Q;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        waterMass = input.nextDouble();
        System.out.print("Enter the initial temperature of the water in Celcius: ");
        initialTemperature = input.nextDouble();
        System.out.print("Enter the final temperature of the water in Celcius: ");
        finalTemperature = input.nextDouble();

        Q = waterMass * (finalTemperature - initialTemperature) * 4184;

        System.out.println("\nThe energy needed to heat " + waterMass +
                " kilograms of water from " + initialTemperature +
                " degrees Celcius to " + finalTemperature +
                " degrees Celcius is " + Q + " joules.");

    }
}
