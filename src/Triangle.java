import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the desired lengths of three sticks:");

        System.out.print("Stick 1 length: ");
        int length1 = scanner.nextInt();

        System.out.print("Stick 2 length: ");
        int length2 = scanner.nextInt();

        System.out.print("Stick 3 length: ");
        int length3 = scanner.nextInt();

        if(validInput(length1) && validInput(length2) && validInput(length3)) {
            if (testTriangle(length1, length2, length3)) {
                System.out.println("You can form a triangle with these given lengths.");
            } else {
                System.out.println("You cannot form a triangle with these given lengths.");
            }
        } else {
            System.out.println("Error: Chosen lengths cannot be negative or zero.");
            }

        scanner.close();
        }

        private static boolean testTriangle(int a, int b, int c) {
            return a + b > c && b + c > a && a + c > b;
        }
        private static boolean validInput(int length) {
            return length > 0;

            }
}