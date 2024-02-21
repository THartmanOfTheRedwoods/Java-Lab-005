import java.util.Scanner;
public class Fermat {

    public static void main(String[] args){

        int a;
        int b;
        int c;
        int n;

        System.out.println("Fermat's Last Theorem states that if n > 2, then there there are no integers a, b, c, and n where $$ a^n + b^n = c^n $$.");
        System.out.println("Let's put this to the test!");
        System.out.println();

        Scanner int_a = new Scanner(System.in);
        System.out.print("First enter in a value for integer a: ");
        a = int_a.nextInt();
        System.out.println();

        Scanner int_b = new Scanner(System.in);
        System.out.print("Now enter in a value for integer b: ");
        b = int_b.nextInt();
        System.out.println();

        Scanner int_c = new Scanner(System.in);
        System.out.print("Now enter in a value for integer c: ");
        c = int_c.nextInt();
        System.out.println();

        Scanner int_n = new Scanner(System.in);
        System.out.print("Lastly, enter in a value for n that is GREATER than 2: ");
        n = int_n.nextInt();
        System.out.println();

        int a_n = (int) Math.pow(a, n);
        int b_n = (int) Math.pow(b, n);
        int c_n = (int) Math.pow(c, n);

        int an_and_bn = a_n + b_n;

        System.out.println("So we have " + a + "^" + n + " + " + b + "^" + n + " = " + c + "^" + n);
        System.out.println("What we end up with is " + an_and_bn + " = " + c_n);
        System.out.println();

        if (an_and_bn == c_n){
            System.out.println("Holy smokes, Fermat was wrong!");
        } else if (an_and_bn != c_n){
            System.out.println("No, that doesn't work.");
        }







    }
}
