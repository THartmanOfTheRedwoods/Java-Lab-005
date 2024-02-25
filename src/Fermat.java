/**
 * @author Alexei Iachkov
 * @date 2-24-24
 * @version 1.0
 */
//I get this "problem" often, I import scanner class and after moving around the readme file, I come back to this window and the imported scanner turns red and doesn't resolve scanner symbols.
//The program still runs, but I'm confused what causing it to not recognize the scanner class.
//And sometimes it resolves itself like just now.... Good news I guess haha

import java.util.Scanner;
public class Fermat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        int a = scan.nextInt();

        System.out.print("Enter value for b: ");
        int b = scan.nextInt();

        System.out.print("Enter value for c: ");
        int c = scan.nextInt();

        System.out.print("Enter value for n: ");
        int n = scan.nextInt();

        if (n > 2 && Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn’t work.");
        }
    }
}
