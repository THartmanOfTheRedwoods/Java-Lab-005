import java.util.Scanner;
import static java.lang.Math.pow;
public class fermat {
    public static void main(String[] args) {
        // four input integers (a, b, c, and n)
        Scanner scanner = new Scanner(System.in);
        System.out.print("a input: ");
        String number = scanner.nextLine();
        int intput1 = Integer.parseInt(number);
        System.out.print("b input: ");
        number =scanner.nextLine();
        int input2 = Integer.parseInt(number);
        System.out.print("c input:");
        number=scanner.nextLine();
        int input3 = Integer.parseInt(number);
        System.out.print("n input:");
        number=scanner.nextLine();
        int input4 = Integer.parseInt(number);
        //checks Fermat’s Last Theorem for four input integers (a, b, c, and n). If \( n > 2 \) and \( a^n + b^n = c^n \),
        if (input4>2 && pow(intput1,input4) + pow(input2,input4) == pow(input3,input4)){

            System.out.println("Holy smokes, Fermat was wrong!");

        }else {
            System.out.println("No, that doesn’t work");
        }



    }
}
