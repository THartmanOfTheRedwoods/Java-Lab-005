import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three integers to represent the lengths of sticks.");

        System.out.print("A = ");
        int A = scanner.nextInt();
        System.out.print("B = ");
        int B = scanner.nextInt();
        System.out.print("C = ");
        int C = scanner.nextInt();

        if (A <= 0 || B <= 0 || C <= 0) {
            System.out.println("Lengths must be positive.");
        } else if (A >= B + C || B >= A + C || C >= A + B) {
            System.out.println("Sorry, these lengths cannot form a triangle.");
        } else {
            System.out.println("Yes, these lengths can form a triangle.");
        }
    }
}
