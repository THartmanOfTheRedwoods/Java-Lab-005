package src;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Lengths of three sides of a triangle: ");

        System.out.println("Enter Length 1: ");
        int Length1 = scanner.nextInt();
        System.out.println("Enter Length 2: ");
        int Length2 = scanner.nextInt();
        System.out.println("Enter Length 3: ");
        int Length3 = scanner.nextInt();

        boolean canFormTriangle = Triangle(Length1, Length2, Length3);

        if (canFormTriangle) {
            System.out.println("Yes, you can form a triangle with these lengths.");
        }else {
            System.out.println("No, you cannot form a triangle with these lengths.");
        }
    }
        private static boolean Triangle(int A, int B, int C){
        return A + B > C && B + C > A;

    }
}
