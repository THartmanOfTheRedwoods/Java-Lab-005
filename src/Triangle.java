import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of input 1:");
        int input1 = validateInput(scanner.nextLine());
        System.out.print("Enter the length of input 2:");
        int input2 = validateInput(scanner.nextLine());
        System.out.print("Enter the length of input 3:");
        int input3 = validateInput(scanner.nextLine());
        if (isValidTriangle(input1,input2,input3)) {
            System.out.println("The given lengths can form a triangle.");
        } else {
            System.out.println("The given lengths cannot form a triangle.");
        }

        scanner.close();
    }
    public static boolean isValidTriangle(int input1, int input2, int input3) {
        if (input1 <= 0 || input2 <= 0 || input3 <= 0) {
            System.out.println("error: All lengths must be positive.");
            return false;
        }

        if (input1 + input2 <= input3 || input1 + input3 <= input2 || input2 + input3 <= input1) {
            return false;
        }

        return true;
    }
    public static int validateInput(String input) {
        try {
            int value = Integer.parseInt(input);
            if (value <= 0) {
                System.out.println("error: Length must be positive.");
                System.exit(1);
            }
            return value;
        } catch (NumberFormatException e) {
            System.out.println("error: Invalid input. Please enter a valid integer.");
            System.exit(1);
            return 0;
        }
    }

    }

