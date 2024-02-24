import java.util.Scanner;

public class Triangle {

    public static void main(String[] args){
        int a, b, c;
        Scanner in = new Scanner(System.in);

        // get side a
        System.out.println("Please enter the length of side a: ");
        if (!in.hasNextInt()){
            System.err.println("That is not a valid input.");
            return;
        } else {
            a = in.nextInt();
        }

        // get side b
        System.out.println("Please enter the length of side b: ");
        if (!in.hasNextInt()){
            System.err.println("That is not a valid input.");
            return;
        } else {
            b = in.nextInt();
        }

        // get side c
        System.out.println("Please enter the length of side c: ");
        if (!in.hasNextInt()){
            System.err.println("That is not a valid input.");
            return;
        } else {
            c = in.nextInt();
        }

        // check input
        if (a <= 0 || b <= 0 || c <= 0){
            System.err.println("Side lengths must be positive integers.");
            return;
        }

        boolean triangle = isTriangle(a,b,c);
        if (triangle){
            System.out.println("It's a triangle!");
        } else {
            System.out.println("That is not a triangle.");
        }
    }

    public static boolean isTriangle(int s1, int s2, int s3){
        return !((s1 > s2 + s3) || (s2 > s1 + s3) || (s3 > s1 + s2));
    }
}

