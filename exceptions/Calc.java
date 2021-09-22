package exceptions;

public class Calc {

    public static int division(int num1, int num2) {

        int res = 0; // Syntax Error = if you remove ; compiler will complain
        try {
            // res = num2 / num1; // logical error - bug
            res = num1 / num2;// i think this line can break executioin
        } catch (Exception e) {
            res = -1;
        }

        return res;
    }

    public static String div(int num1, int num2) {

        String sts = "";
        try {
            // res = num2 / num1; // logical error - bug
            sts = "" + (num1 / num2);// i think this line can break executioin
        } catch (ArithmeticException e) {
            sts = "you are dividing by zero";
        } catch (Exception e) {
            sts = "Unknown Error";
        }

        return sts;
    }

    public static void main(String[] args) {

        System.out.println("10, 20 = " + division(10, 20));
        System.out.println("100, 10 = " + division(100, 10));
        System.out.println("1, 1 = " + division(1, 1));
        System.out.println("78, 0 = " + (division(78, 0) == -1 ? "You are Dividing by Zero" : division(78, 0)));
        System.out.println("100, 0 = " + div(100, 0));
        System.out.println("3, 2 = " + division(3, 2));
    }
}
