import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("The length of a = ");
        int a = in.nextInt();
        System.out.print("The length of b = ");
        int b = in.nextInt();
        System.out.print("The length of c = ");
        int c = in.nextInt();
        boolean check = (!(a > b + c || b > a + c || c > a + b));

        if (a > 0 && b > 0 && c > 0) {
            if (check) {
                System.out.println("You CAN form a triangle with these given lengths.");
            }
            if (!check) {
                System.out.println("You CANNOT form a triangle with these given lengths.");
            }
        }
        else {
            System.err.print("These inputs are not valid.");
        }
    }
}
