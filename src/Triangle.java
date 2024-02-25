import java.util.Scanner;

/**
 *
 * @author James Ward
 *
 * @since 2/22/2024
 *
 */

public class Triangle {

    public static void main(String[] args) {

        triangulator();
        tryAgain();

    }

    public static void triangulator() {

        System.out.println("We need three sides to a triangle. Input the lengths of each side as positive integers and we will confirm if the sides form a valid triangle.");
        int side1 = userInput("side 1");
        int side2 = userInput("side 2");
        int side3 = userInput("side 3");

        if ((side1 > side2 + side3) || (side2 > side1 + side3) || (side3 > side1 + side2)) {
            System.out.println("The length of one side is greater than the sum of the other sides, this won't create a triangle.");
        } else if ((side1 == side2 + side3) || (side2 == side1 + side3) || (side3 == side1 + side2)) {
            System.out.println("The lengths given create a straight line.");
        } else {
            System.out.println("The lengths given create a triangle.");
        }
    }

    public static int userInput(String variableName) {
        // this method uses recursion to allow for input mistakes without restarting/crashing the program.

        // prompt for input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter for " + variableName + ": ");

        // check the format
        if (!in.hasNextInt()) {
            String word = in.next();
            System.err.println(word + " is not an integer.");
            // recurse through input method until they input a positive integer.
            return userInput(variableName);
        }

        int sideLength = in.nextInt();
        if (sideLength <=0) {
            System.out.println(variableName + " must be a positive integer! Your input was: " + sideLength);
            // recurse through input method until they input a positive integer.
            sideLength = userInput(variableName);
        } else {
            System.out.println("Your input was: " + sideLength);
        }
        return sideLength;
    }

    public static void tryAgain() {
        // prompting user input
        Scanner in = new Scanner(System.in);
        System.out.print("If you want to try again, enter 1: ");

        // accepting any data type, if input is 1, replay game. Any other input will do nothing and naturally end the program.
        String input = in.next();

        if (input.equals("1")) {
            triangulator();
        } else {
            System.out.println("Goodbye!");
        }
    }

}
