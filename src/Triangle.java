import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        int side1;
        int side2;
        int side3;

        // prompt for input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number for side 1: ");
        // check the format
        if (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not a number");
        } else if (in.nextInt() == 0 || in.nextInt() < 0){
            System.out.println("error, not a valid input");
            return;
        }

        side1 = in.nextInt();
        System.out.print("Enter a number for side 2: ");
        // check the format
        if (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not a number");
        } else if (in.nextInt() == 0 || in.nextInt() < 0){
            System.out.println("error, not a valid input");
            return;
        }

        side2 = in.nextInt();
        System.out.print("Enter a number for side 2: ");
        // check the format
        if (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not a number");
        } else if (in.nextInt() == 0 || in.nextInt() < 0){
            System.out.println("error, not a valid input");
            return;
        }

        side3 = in.nextInt();

        if (side3 > (side1 + side2)) {
            System.out.println("Impossible to build this!");
        } else {
            System.out.println("Somebody broke maths!");
        }

    }

}
