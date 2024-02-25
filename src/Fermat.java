/**
 *
 * @author James Ward
 *
 * @since 2/22/2024
 *
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Fermat {


    public static void main(String[] args) {

        System.out.println("We are going to be testing Fermat's Last Theorem. According to the theorem, no three positive integers a, b, and c satisfy the equation a^n + b^n = c^n for any integer value of n greater than 2.");

        theoremChecker();

    }

    public static void theoremChecker() {

        /* I wanted to use a for-loop and an array to dynamically construct these variables, but it isn't possible in Java.
         * I tried using Hash Maps to dynamically set values to the variable objects in an array, and I could .set the value inside the loop
         * However, I had to .get outside the loop for each variable, which made the dynamic variable construction pointless. So I reverted to KISS. */

        BigInteger a = userInput("a");
        BigInteger b = userInput("b");
        BigInteger c = userInput("c");
        BigInteger n = userInput("n");

        // upgraded from ints to doubles to longs to BigInts, and now I've settled to accept that some numbers are too big.
        // the following block checks to see if any of the results are >= the max value of a BigInt.
        if (a.pow(n.intValue()).compareTo(BigInteger.valueOf(Long.MAX_VALUE)) >= 0 || b.pow(n.intValue()).compareTo(BigInteger.valueOf(Long.MAX_VALUE)) >= 0 || c.pow(n.intValue()).compareTo(BigInteger.valueOf(Long.MAX_VALUE)) >= 0) {
            System.out.println("The number size is beyond the measly capabilities of this program.");
            theoremChecker();
            return;
        }

        // userInput method ensures n > 2
        if (a.pow(n.intValue()).add(b.pow(n.intValue())).equals(c.pow(n.intValue()))) {
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn't work.");
        }
    }

    public static BigInteger userInput(String variableName) {
        // this method uses recursion to allow for input mistakes without restarting/crashing the program.

        // prompt for input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter for " + variableName + ": ");

        // check the format
        if (!in.hasNextBigInteger()) {
            String word = in.next();
            System.err.println(word + " is not an integer.");
            return userInput(variableName);
        }

        // make sure int is positive, and greater than 2 if n
        // .compareTo compares BigInteger to argument as a BigInteger, resulting in -1, 0, or 1 depending on <, =, >. i.e if BigInt is 5 and arg is 0, result is 1.
        BigInteger x = in.nextBigInteger();
        if (x.compareTo(BigInteger.valueOf(0)) > 0 && !(variableName.equals("n"))) {
            return x;
        } else if (variableName.equals("n") && x.compareTo(BigInteger.valueOf(2)) > 0) {
            return x;
        } else {
            System.out.println("Not a positive number, or greater than 2 in the case of n.");
            return userInput(variableName);
        }
    }
}
