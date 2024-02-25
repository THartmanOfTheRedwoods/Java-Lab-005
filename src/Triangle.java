

    import java.util.Scanner;

    public class Triangle {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter three lengths: ");
            double side1 = scanner.nextDouble();
            double side2 = scanner.nextDouble();
            double side3 = scanner.nextDouble();

            if(side1 <=0 || side2 <=0 || side3 <=0){
                System.out.println("One of them is not a valid measurement");
                System. exit(0);
            }


            if (side1 > side2 + side3 || side2 > side1 + side3 || side3 > side1 + side2) {
                System.out.println("These lengths cannot form a triangle.");
            } else {
                System.out.println("These lengths can form a triangle.");
            }
}}
