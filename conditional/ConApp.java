package conditional;

public class ConApp {

    public static void ifElseDemo() {
        int day = 2;

        if (day == Days.MONDAY.ordinal()) {
            System.out.println("Its Monday");
        } else if (day == Days.TUESDAY.ordinal()) {
            System.out.println("Its Tuesday");
        } else if (day == Days.WEDENSDAY.ordinal()) {
            System.out.println("Its Wedensday");
        } else {
            System.out.println("Invalid Day");
        }
    }

    public static void main(String[] args) {
        ifElseDemo();
    }
}
