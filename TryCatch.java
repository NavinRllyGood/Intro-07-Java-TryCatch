
import java.util.Scanner;

/**
* Java program to demonstrate working try catch in Java.
*
*
* @author  Navin
* @version 1.0
* @since   2023-02-14
*/

public final class TryCatch {
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

        final String someString = scanner.nextLine();

        System.out.println(" " + someString);

        // Closing Scanner

        scanner.close();
        try {
            // Convert the string to a double
            final double radDouble = Double.parseDouble(someString);

            if (radDouble < 0) {
                System.out.println("This is a negative number");
            }

            final double volume = (4.0 / 3.0)
                * Math.PI * Math.pow(radDouble, 3);

            System.out.format("The volume of your sphere is %.2f m^3.", volume);
            System.out.println("");
        } catch (NumberFormatException error) {
            System.out.println("Please enter a valid radius. "
                + error.getMessage());
        }

        // Closing Scanner
    }

}
