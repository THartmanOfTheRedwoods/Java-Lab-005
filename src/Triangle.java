import java.util.Scanner;

public class Triangle {

    public static boolean isTriangle (int a, int b, int c){
        if( a > (b + c) || b > (a + c) || c > (a + b) ) return false;
        else return true;
    }
    public static boolean isPositiveInteger (int x) {
        return x > 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a length for side 'a': ");
        int a = in.nextInt();
        if (!isPositiveInteger(a)) {
            System.err.println("value cannot be negative or 0");
            return;
        }


        System.out.println("Enter a length for side 'b': ");
        int b = in.nextInt();
        if (!isPositiveInteger(b)) {
            System.err.println("value cannot be negative or 0");
            return;
        }


        System.out.println("Enter a length for side 'c': ");
        int c = in.nextInt();
        if (!isPositiveInteger(c)) {
            System.err.println("value cannot be negative or 0");
            return;
        }


        if (isTriangle(a, b, c)) {
            System.out.println("These lengths can create a triangle!");
        } else {
            System.out.println("These lengths cannot form a triangle!");
        }

    }
}
