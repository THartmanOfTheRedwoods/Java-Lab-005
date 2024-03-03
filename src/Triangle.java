import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // System.out.println();
        // System.out.print();
        System.out.println("Give the lengths for the triangle sides a, b, and c.");
        System.out.print("a: ");
        int a = scan.nextInt();
        System.out.print("b: ");
        int b = scan.nextInt();
        System.out.print("c: ");
        int c = scan.nextInt();

        if (a <= 0 || b <= 0 || c <= 0){
            System.out.println("A length you have entered is either zero or negative.");
        } else if (a < b + c && b < a + c && c < a + b) {
            System.out.println("The lengths can form a triangle.");
        } else {
            System.out.println("You can not form a triangle with the given lengths.");
        }

    }
}
