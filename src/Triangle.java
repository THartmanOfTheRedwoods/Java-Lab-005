import java.util.Scanner;
/**
 *
 * @author Trevor Hartman
 * @author Eliot Rodriguez
 *
 * @since version 1.0
 * February 20, 2024
 *
 */
public class Triangle {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Can you form a triangle with three different lengths?");
        System.out.println("Input an integer length for x: "); //inputs for the triangle formula
        int x = scanner.nextInt();
        System.out.println("Input an integer length for y: ");
        int y = scanner.nextInt();
        System.out.println("Input an integer length for z: ");
        int z = scanner.nextInt();
        boolean triangle = (!(y + z < x || x + z < y || x + y < z)); //boolean variable assuring that no one variable is greater than the sum of the other two
        if (x>0 && y>0 && z>0) { //This is to ensure that the values of teh variables are not 0 or negative
            System.out.println("The three provided lengths are valid");}
        else {
            System.err.println("invalid inputs!");
            return;
        }
        if (triangle){
            System.out.println("The three given lengths can form a triangle!");}
        else {
            System.out.println("The three given lengths cannot form a triangle!");}
    }
}