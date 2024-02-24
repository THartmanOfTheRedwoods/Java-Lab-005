import java.util.Scanner;
public class Triangle {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter three integers representing the lengths of sticks: ");

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a <= 0 || b <= 0 || c <= 0) {
                System.out.println("Error: Lengths must be positive.");
            } else if (a >= b + c || b >= a + c || c >= a + b) {
                System.out.println("No, these lengths cannot form a triangle. ");
            } else {
                System.out.println("Yes, these lengths can form a triangle.");
            }
        }
    }