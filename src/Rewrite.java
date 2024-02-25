/**
 * @author Trevor Hartman
 * @author Alexei Iachkov
 * @date 2-24-24
 * @version 1.0
 */
import java.util.Scanner;
public class Rewrite {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please input a number for x: ");
        int x = Integer.valueOf(s.nextLine());

        if (x > 0 && x < 10) {
            System.out.println("positive single digit number.");
        } else {
            System.out.println("something else.");
        }
    }
}



