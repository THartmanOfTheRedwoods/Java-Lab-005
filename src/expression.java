public class expression {
    public static void main(String[] args) {
        boolean yes = true;
        boolean no = false;
        int loVal = -999;
        int hiVal = 999;
        double grade = 87.5;
        double amount = 50.0;
        String hello = "world";

        boolean results = no && !no || yes && !yes;
        System.out.println(results);
    }
    }
