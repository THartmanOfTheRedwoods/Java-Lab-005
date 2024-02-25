import java.util.Scanner;
public class Triangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the first side: ");
        int s = in.nextInt();

        System.out.print("Input second side: ");
        int s2 = in.nextInt();

        System.out.print("Input third side: ");
        int s3 = in.nextInt();

        if ((s + s2 > s3 || s + s3 > s2 || s2 + s3 > s)) {
            System.out.println("Triangle is valid");
        }
        else {
            System.out.println("Triangle is not valid");
        }
    if (s <= 0 || s2 <= 0 || s3 <= 0) {
        System.out.println("Error the lengths are neg or zero");
    }


    }
}
