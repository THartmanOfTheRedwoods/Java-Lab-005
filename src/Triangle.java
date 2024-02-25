import java.util.Scanner;
public class Triangle {

    public static void isItaTriangle(int a, int b, int c){
        if ((a>(b+c)) || (b>(c+a)) || (c>(a+b))){
            System.out.println("One of the lengths are greater than the sum of the other two lengths, therefore this CANNOT form a triangle.");
        }
        else {
            System.out.println("This is a triangle!");
    }
    }
    public static void isItanInteger(int a, int b, int c) {
        if ((a>0) && (b>0) && (c>0)){
            isItaTriangle(a, b, c);
        }
        else {
            System.out.println("The three lengths input are not valid integers.");
        }
    }
    public static void main(String[] args) {
        int stick1, stick2, stick3;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter three lengths of a possible triangle");
        stick1=in.nextInt();
        stick2=in.nextInt();
        stick3=in.nextInt();
        isItanInteger(stick1,stick2,stick3);

    }
}
