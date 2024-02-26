import java.util.Scanner;

public class Fermat {
    public static void main(String[] args) {
        System.out.println("Input variable for 'a, b, c, n:'; in that order:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int n = scan.nextInt();
if (n > 2 && Math.pow(a , n) + Math.pow(b, n) == Math.pow(c, n)) {
    // Fermat's Last Theorem conditions
   System.out.println("Holy smokes, Fermat was wrong!");
}
else{
    System.out.println("No, that does not work.");

}
    }
}
