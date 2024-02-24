import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter lengths of three sides of a triangle: ");
        System.out.println("Length 1: ");
        double length1 = scanner.nextDouble();
        System.out.println("Length 2: ");
        double length2 = scanner.nextDouble();
        System.out.println("Length 3: ");
        double length3 = scanner.nextDouble();

        //use boolean to check if they form a triangle
        boolean canFormTriangle = isTriangle(length1, length2, length3);

        if (canFormTriangle) {
            System.out.println("They can form a triangle.");
        } else {
            System.out.println("they do not form a triangle.");

        }
    }
    public static boolean isTriangle(double length1, double length2, double length3) {
        return (length1 < length2 + length3) && (length2 < length1 + length3)
                && (length3 < length1 +length2);

    }

}
