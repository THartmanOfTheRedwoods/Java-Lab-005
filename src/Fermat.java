import java.util.Scanner;

public class Fermat {
    public static void main(String[] args) {
        double n, a, b, c, calc;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number to test out Fermat's Last Theorem");
        a=in.nextDouble();
        System.out.println("Enter another number");
        b=in.nextDouble();
        System.out.println("Enter another number");
        c=in.nextDouble();
        System.out.println("Enter another number");
        n=in.nextDouble();
        calc=Math.pow(a,n) +Math.pow(b,n);
        if ((n>2.0) && (calc==Math.pow(c,n))){
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn't work.");
        }
    }
}
