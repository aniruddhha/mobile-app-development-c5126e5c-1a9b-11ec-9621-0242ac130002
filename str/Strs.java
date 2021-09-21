package str;

import java.util.Arrays;
// if one class wants to use another class
// from different package, first you need to
// import it. 
import java.util.Date;

// java says do worry about the classes inside lang package
// i will auto import them
// import java.lang.String;

public class Strs {
    public static void main(String[] args) {

        String nm = "android"; // i will give it to you from shared pool

        String os = new String("iOS"); // i will give you fresh instance

        System.out.println("Name is - " + nm);
        System.out.println("Upper - " + nm.toUpperCase());
        System.out.println("Lower - " + nm.toLowerCase());

        char[] arr = os.toCharArray();
        System.out.println("Array Representation");
        System.out.println(Arrays.toString(arr));

        Date dt = new Date();

        // convert object to string format
        System.out.println("To String - " + dt.toString());
    }
}
