import java.util.Scanner;

public class Fermat {
    public static void fermatTheorem(){
        Scanner s = new Scanner(System.in);

        System.out.println("Please input a number for a: ");
        int a = s.nextInt();

        System.out.println("Please input a number for b: ");
        int b = s.nextInt();

        System.out.println("Please input a number for c: ");
        int c = s.nextInt();

        System.out.println("Please input a number for n: ");
        int n = s.nextInt();

        double aValue = Math.pow(a,n);
        double bValue = Math.pow(b,n);
        double cValue = Math.pow(c,n);
        if (aValue + bValue == cValue && n > 2){
            System.out.println("Holy smokes, Fermat was wrong!");
        }
        else
            System.out.println("No, that doesn’t work.");

    }
    public static void main(String[] args) {
        fermatTheorem();
    }
}

