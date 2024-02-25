/**
 * @author Alexei Iachkov
 * @date 2-24-24
 * @version 1.0
 */

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        System.out.println("You will need to input 3 numbers for sides to see whether they will form a triangle.");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value for side a: ");
        int a = scan.nextInt();

        System.out.print("Enter value for side b: ");
        int b = scan.nextInt();

        System.out.print("Enter value for side c: ");
        int c = scan.nextInt();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Error: All sides of the triangle must be positive.");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("These side lengths cannot form a triangle.");
        } else {
            System.out.println("These side lengths can form a triangle.");
        }
    }
}
