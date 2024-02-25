import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lengths of three sticks:");
        int a = getPositiveInteger(scanner, "The length of the first stick is:");
        int b = getPositiveInteger(scanner, "The length of the second stick is:");
        int c = getPositiveInteger(scanner, "The length of the third stick is:");
        boolean isValidTriangle = isValidTriangle(a, b, c);
        if (isValidTriangle) {
            System.out.println("You can form a triangle with these sticks.");
        } else {
            System.out.println("You cannot form a triangle with these sticks.");
        }
    }

    private static int getPositiveInteger(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if (input > 0) {
                    return input;
                } else {
                    System.out.println("Error: Length must be a positive integer.");
                }
            } else {
                System.out.println("Error: Please enter a valid integer.");
                scanner.next(); // consume the invalid input
            }
        }
    }

    private static boolean isValidTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}