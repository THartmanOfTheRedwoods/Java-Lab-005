import java.util.Scanner;


public class Triangle {

    public static void main(String [] args) {

        int a;
        int b;
        int c;

        System.out.println("Let's see if we can for a triangle!");
        System.out.println("The main rule is If any of the three lengths is greater than the sum of the other two, you cannot form a triangle.");
        System.out.println();

        Scanner side1 = new Scanner(System.in);
        System.out.print("Enter number for first side: ");
        a = side1.nextInt();
        System.out.println();

        Scanner side2 = new Scanner(System.in);
        System.out.print("Enter number for second side: ");
        b = side2.nextInt();
        System.out.println();

        Scanner side3 = new Scanner(System.in);
        System.out.print("Enter number for the third side: ");
        c = side3.nextInt();
        System.out.println();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Error- at least one of the sides provided is less than or equal to 0.");
            System.out.println();
        }else if (a > 0 || b > 0 || c > 0) {
            System.out.println("Numbers provided are valid integers");
            System.out.println();
        }if (a+b < c){
            System.out.println("This does not work as the 3rd side is greater than 1st side + 2nd side.");
        } if (a+c < b){
            System.out.println("This does not work as the 2nd side is greater than 1st side + 2nd side.");
        } if (b+c < a){
            System.out.println("This does not work as the 1st side is greater than 2nd side + 3rd side.");
        } else if (a+b >= c && a+c >= b && b+c >= a){
            System.out.println("The values provided can form a triangle as any of the three lengths are not greater than the sum of the other two.");
        }






    }
}
