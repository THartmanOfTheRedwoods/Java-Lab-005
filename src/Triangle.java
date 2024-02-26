import java.util.Scanner;

public class Triangle {
    public static void triangleTest(){
        System.out.println("======================================================");
        Scanner s = new Scanner(System.in);

        System.out.println("Please input a number for side a: ");
        int a = s.nextInt();
        if (a<=0 ){
            System.out.println("Sides cannot be negative or 0.");
            triangleTest();
        }

        System.out.println("Please input a number for side b: ");
        int b = s.nextInt();
        if (b<=0 ){
            System.out.println("Sides cannot be negative or 0.");
            triangleTest();
        }


        System.out.println("Please input a number for side c: ");
        int c = s.nextInt();
        if (c<=0 ){
            System.out.println("Sides cannot be negative or 0.");
            triangleTest();
        }


        if (a+b>c && a+c> b && b+c>a){
            System.out.println("These lengths can form a triangle.");
        }
        else {
            System.out.println("These sides cannot form a triangle.");
        }
    }
    public static void main(String[] args) {
        triangleTest();
    }
}
//Objective: Create a file named src/Triangle.java and write a program in it that determines if three give
// n lengths can form a triangle. The test for triangle formation is as follows:
//
//If any of the three lengths is greater than the sum of the other two, you cannot form a triangle.
//Requirements:
//
//Input three integers representing the lengths of sticks.
//Output whether you can (or cannot) form a triangle with the given lengths.
//Create code to validate inputs are valid integers.
//Display an error if any of the lengths are negative or zero.