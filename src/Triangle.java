import java.util.Scanner;

public class Triangle {

    private int a = 0;
    private int b = 0;
    private int c = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lengths of the three sides of a triangle (positive integers):");

        // Get and validate side lengths
        while (!isValidSideLengths(scanner)) {
            System.out.println("Invalid input. Please enter positive integers for all sides.");
        }

        // Check triangle inequality
        if (a > b + c || b > a + c || c > a + b) {
            System.out.println("No, the given lengths cannot form a triangle.");
        } else {
            System.out.println("Yes, the given lengths can form a triangle.");
        }

        scanner.close(); // Close the scanner to avoid resource leaks
    }

    private static boolean isValidSideLength(Scanner scanner, String sideName) {
        System.out.printf("Enter the length of %s (positive integer): ", sideName);
        if (scanner.hasNextInt()) {
            int length = scanner.nextInt();
            if (length > 0) {
                return true;
            } else {
                System.out.println("Invalid side length. Please enter a positive integer.");
                return false;
            }
        } else {
            System.out.println("Invalid input. Please enter a positive integer.");
            scanner.next(); // Clear invalid input
            return false;
        }
    }

    private static boolean isValidSideLengths(Scanner scanner) {
        a = 0;
        b = 0;
        c = 0;

        // Get and validate side lengths
        a = isValidSideLength(scanner, "a") ? scanner.nextInt() : 0;
        if (a == 0) {
            return false;
        }
        b = isValidSideLength(scanner, "b") ? scanner.nextInt() : 0;
        if (b == 0) {
            return false;
        }
        c = isValidSideLength(scanner, "c") ? scanner.nextInt() : 0;
        if (c == 0) {
            return false;
        }

        return true;
    }
}