public class Fermat {

    public static void main(String[] args) {

        int a, b, c, n;
        n = 3;
        a = 2;
        b = 4;
        c = 6;

        double lhs = Math.pow(a, n) + Math.pow(b, n);
        double rhs = Math.pow(c, n);

        if (lhs == rhs) {
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn't work.");
        }

    }
}
