/**
 * @author Trevor Hartman
 * @author Alexei Iachkov
 * @date 2-24-24
 * @version 1.0
 */

public class FlowOfExecution {
    public static boolean isHoopy(int x) { //3
        boolean hoopyFlag; //4
        if(x % 2 == 0) { //5
            hoopyFlag = true; //6
        } else {
            hoopyFlag = false;
        }
        return hoopyFlag; //7
    }
    public static boolean isFrabjuous(int x) { //9
        boolean frabjuousFlag; //10
        if(x > 0) { //11
            frabjuousFlag = true; //12
        } else {
            frabjuousFlag = false;
        }
        return frabjuousFlag; //13
    }
    public static void main(String[] args) { //1
        boolean flag1 = isHoopy(202); //2
        boolean flag2 = isFrabjuous(202); //8
        System.out.println(flag1); //14
        System.out.println(flag2); //15
        if (flag1 && flag2) { //16
            System.out.println("ping!"); //17 ping!
        }
        if (flag1 || flag2) {
            System.out.println("pong!"); //18 pong!
        }
    }
}
