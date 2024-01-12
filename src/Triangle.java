import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lengths of the three sticks:");

        int a = validateInput(scanner, "Stick 1");
        int b = validateInput(scanner, "Stick 2");
        int c = validateInput(scanner, "Stick 3");

        if (isValidTriangle(a, b, c)) {
            System.out.println("You can form a triangle with the given lengths.");
        } else {
            System.out.println("You cannot form a triangle with the given lengths.");
        }

        scanner.close();
    }

    private static int validateInput(Scanner scanner, String stick) {
        int length;
        do {
            System.out.print(stick + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid positive integer.");
                scanner.next();
            }
            length = scanner.nextInt();
            if (length <= 0) {
                System.out.println("Length must be a positive integer.");
            }
        } while (length <= 0);
        return length;
    }

    private static boolean isValidTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }
}
