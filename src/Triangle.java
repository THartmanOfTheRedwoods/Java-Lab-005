import java.util.Scanner;

public class Triangle {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lengths of three sticks:");
        int a = getInput(scanner, "First stick length: ");
        int b = getInput(scanner, "Second stick length: ");
        int c = getInput(scanner, "Third stick length: ");

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Error: Stick lengths must be positive non-zero integers.");
        } else {
            boolean canFormTriangle = isValidTriangle(a, b, c);
            if (canFormTriangle) {
                System.out.println("You can form a triangle with the given lengths.");
            } else {
                System.out.println("You cannot form a triangle with the given lengths.");
            }
        }
    }

    public static int getInput(Scanner scanner, String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Invalid input. Please enter an integer.");
            System.out.print(message);
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static boolean isValidTriangle(int a, int b, int c) {
        return (a + b > c) && (b + c > a) && (a + c > b);
    }
}
