/*
* This program calculates the maximum amount of logs a truck can hold
* with given lengths of the logs
*
* @author  Jenoe Balote
* @version 1.0
* @since   2020-11-18
*/

import java.util.Scanner;

/**
* This is the "Logs" program.
*/
final class Logs {
    /**
     * Density of logs, in kg/m.
     */
    public static final double DENSITY = 20.0;
    /**
     * Max truck load weight in kg.
     */
    public static final double MAX_WEIGHT = 1100;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Logs() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Variables
        final double numberOfLogs;

        final Scanner myObj = new Scanner(System.in);
        // Input
        System.out.print("Enter the log length (0.25,0.5,1 meters): ");

        // Stores float in length
        final float logLength = myObj.nextFloat();

        // Calculates log capacity of the truck
        numberOfLogs = (MAX_WEIGHT / logLength) / DENSITY;

        // Output
        System.out.println("The truck will be able to take "
                             + numberOfLogs + " logs that are " + logLength
                             + " meter(s) in length.");

        System.out.println("\nDone.");
    }
}
