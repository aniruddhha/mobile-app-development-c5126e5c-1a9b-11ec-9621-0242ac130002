package wranum;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class WraNum {

    public static void main(String[] args) {
        System.out.println(" Addition = " + 20 + 30);
        System.out.println(" Addition = " + (20 + 30));

        String num1 = "10";
        String num2 = "20";

        int nm1 = Integer.parseInt(num1);
        int nm2 = Integer.parseInt(num2);

        // wrapper classes
        int a = 10;
        Integer ph = 50; // boxing

        int dt = ph; // unboxing

        Float ft = 20.3f;

        Boolean bl = true;

        Date d = new Date();

        List<MyInt> nums = new ArrayList<MyInt>();

        System.out.println("Multiplication is " + (nm1 * nm2));
    }
}
