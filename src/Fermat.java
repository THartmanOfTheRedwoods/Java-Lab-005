import java.util.Scanner;

public class Fermat { //Using fermat's theorem ( a^n + b^n = c^n )
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Here is our theorem ( a^n + b^n = c^n )");
    System.out.println("Define 'a'");
      var a = Integer.parseInt(s.nextLine());
      System.out.println("Define 'b'");
      var b = Integer.parseInt(s.nextLine());
      System.out.println("Define 'c'");
      var c = Integer.parseInt(s.nextLine());
      System.out.println("Now define 'n'");
      var n = Integer.parseInt(s.nextLine());
        if (n > 2 && Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)){
            System.out.println("Holy smokes, Fermat was wrong!");
        }
        else{
            System.out.println("No, that's not right");
        }



    }}
