public class FlowOfExecution {
    public static boolean isHoopy(int x) {
        boolean hoopyFlag;
        if(x % 2 == 0) {
            hoopyFlag = true;
        } else {
            hoopyFlag = false;
        }
        return hoopyFlag;
    }
    public static boolean isFrabjuous(int x) {
        boolean frabjuousFlag;
        if(x > 0) {
            frabjuousFlag = true;
        } else {
            frabjuousFlag = false;
        }
        return frabjuousFlag;
    }
    public static void main(String[] args) {
        boolean flag1 = isHoopy(202); //#1: true
        boolean flag2 = isFrabjuous(202); //#2: true
        System.out.println(flag1); //outputs: true
        System.out.println(flag2); //outputs: true
        if (flag1 && flag2) { //true && true
            System.out.println("ping!"); //outputs: ping!
        }
        if (flag1 || flag2) { // true || true
            System.out.println("pong!");//outputs: pong!
        }

        /*
        outputs:
        true
        true
        ping!
        pong!
         */
    }
}
