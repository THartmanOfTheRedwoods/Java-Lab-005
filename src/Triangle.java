/**
 * @author Diego Carrera
 * Date: 2/25/24
 */

import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Input 3 lengths for each side of a triangle:");
        int sideOne = scanner.nextInt();
        int sideTwo = scanner.nextInt();
        int sideThree = scanner.nextInt();
        if(sideOne <= 0 && sideTwo <= 0 && sideThree <= 0){
            System.out.println("Error: only positive numbers");
            // Error doesn't allow 0's or negative numbers
        }
        else if (sideOne + sideTwo > sideThree && sideTwo + sideThree > sideOne && sideOne + sideThree > sideTwo) {
            System.out.println("You can form a triangle with the given lengths!");
        }
        else {
            System.out.println("You can not form a triangle with the given lengths!");

        }
    }

}
