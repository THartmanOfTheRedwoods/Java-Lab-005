import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inputs 3 numbers to form a triangle
        System.out.println("Enter the lengths of three sticks:");
        int a = getInput(scanner, "First stick length: ");
        int b = getInput(scanner, "Second stick length: ");
        int c = getInput(scanner, "Third stick length: ");

        // Checks if the given lengths can form a triangle
        boolean canFormTriangle = isTriangle(a, b, c);

        // Gives a output on if they can form triangles for not
        if (canFormTriangle) {
            System.out.println("You can form a triangle with the given lengths.");
        } else {
            System.out.println("You cannot form a triangle with the given lengths.");
        }
    }

    // Validates the inputs
    private static int getInput(Scanner scanner, String prompt) {
        int input;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Please enter a valid integer.");
                System.out.print(prompt);
                scanner.next();
            }
            input = scanner.nextInt();
            if (input <= 0) {
                System.out.println("Error: Lengths must be positive integers.");
            }
        } while (input <= 0);
        return input;
    }

    // Checks if the output can form a triangle
    private static boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }
}