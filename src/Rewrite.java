// Edited by: Austin Barnett
// Date: 2/22/24
// Version 1.0

import java.util.Scanner;

public class Rewrite {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please input a number for x: ");
        int x = s.nextInt();

        if (x > 0 && x < 10) {
            System.out.println("positive single digit number.");
        } else {
            System.out.println("something else.");
        }
    }
}
