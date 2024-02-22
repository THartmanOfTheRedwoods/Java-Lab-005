import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three lengths of sticks: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Error: Please enter a valid integer.");
            return;
        }
        int a = scanner.nextInt();
        if (a <= 0) {
            System.out.println("Error: Lengths must be positive.");
            return;
        }

        if (!scanner.hasNextInt()) {
            System.out.println("Error: Please enter a valid integer.");
            return;
        }
        int b = scanner.nextInt();
        if (b <= 0) {
            System.out.println("Error: Lengths must be positive.");
            return;
        }

        if (!scanner.hasNextInt()) {
            System.out.println("Error: Please enter a valid integer.");
            return;
        }
        int c = scanner.nextInt();
        if (c <= 0) {
            System.out.println("Error: Lengths must be positive.");
            return;
        }

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("These lengths can form a triangle.");
        } else {
            System.out.println("These lengths cannot form a triangle.");
        }
    }
}
