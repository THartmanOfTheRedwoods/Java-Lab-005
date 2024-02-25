import java.util.Scanner;

public class Fermat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Prompt user for values a,b,c, and n
        System.out.println("Enter a value for 'n': ");
        int n = in.nextInt();
        System.out.println("Enter a value for 'a': ");
        int a = in.nextInt();
        System.out.println("Enter a value for 'b': ");
        int b = in.nextInt();
        System.out.println("Enter a value for 'c': ");
        int c = in.nextInt();

        //Test Fermat's Last Theorem with user's values
        if ( (n > 2) && ((Math.pow(a, n) + Math.pow(b, n)) == Math.pow(c, n)) ) {
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn’t work.");
        }

    }
}