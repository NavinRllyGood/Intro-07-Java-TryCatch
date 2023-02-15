import java.util.Scanner;

/**
* Java program to demonstrate working try catch in Java.
*
* @author Navin
* @version 1.0
* @since 2023-02-14
*/

public final class TryCatch {
    /**
    * Main lines of code.
    *
    *
    * @exception IllegalStateException Utility Class
    * @see IllegalStateException
    */
    private TryCatch() {
        throw new IllegalStateException("Utility Class");
    }

    /**
    * Main lines of code.
    *
    *
    * @param args placeholder
    */
    public static void main(String[] args) {

        // Using Scanner for Getting Input from User
        System.out.println("Enter the radius of your sphere: ");

        final Scanner scanner = new Scanner(System.in);

        // get the radius as a string
        final String radiusString = scanner.nextLine();

        try {
            // Convert the string to a double
            final double radDouble = Double.parseDouble(radiusString);

            // check if negative
            if (radDouble < 0) {
                System.out.println("This is a negative number");
            } else {
                // calculate the volume
                final double volume = (4.0 / 3.0)
                    * Math.PI * Math.pow(radDouble, 3);

                system.out.print("The volume of your sphere");
                System.out.format(" is %.2f m^3.", volume);
                System.out.println("");
            }
        } catch (NumberFormatException error) {
            System.out.println("Please enter a valid radius. "
                + error.getMessage());
        }

        // Closing Scanner
        scanner.close();
    }
}
