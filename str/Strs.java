package str;

// if one class wants to use another class
// from different package, first you need to
// import it. 
import java.util.Date;

// java says do worry about the classes inside lang package
// i will auto import them
// import java.lang.String;

public class Strs {
    public static void main(String[] args) {

        String nm = "android";

        System.out.println("Name is - " + nm);

        Date dt = new Date();

        // convert object to string format
        System.out.println("To String - " + dt.toString());
    }
}
