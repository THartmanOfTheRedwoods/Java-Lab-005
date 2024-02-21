public class FlowOfExecution {
    public static boolean isHoopy(int x) {//now x=202
        boolean hoopyFlag;
        if(x % 2 == 0) {//x=202 so 202%2= 0 and 0==0 it is True
            hoopyFlag = true;
        } else {
            hoopyFlag = false;
        }
        return hoopyFlag;
    }
    public static boolean isFrabjuous(int x) {//x=202
        boolean frabjuousFlag;
        if(x > 0) {//x=202 so 202>2 it is True
            frabjuousFlag = true;
        } else {
            frabjuousFlag = false;
        }
        return frabjuousFlag;
    }
    public static void main(String[] args) {
        boolean flag1 = isHoopy(202); // assign argument to isHoopy(int x=202) and declar boolean flag1 to receied output from isHoopy(output is = Truse due to (x=202%2=0)==0)
        boolean flag2 = isFrabjuous(202);//assign argument to isFrabjuous(int x=202) and declar boolean flag2 to receied output from isHoopy(output is = Truse due to (x=202)>2)
        System.out.println(flag1);//print output from flag1 =True
        System.out.println(flag2);//print ourput from flag2 =True
        if (flag1 && flag2) { //if (True && Truse = True)
            System.out.println("ping!"); //if correct please print message
        }
        if (flag1 || flag2) { //if(True || True = True)
            System.out.println("pong!");//if correct please print message
        }
    }
}
