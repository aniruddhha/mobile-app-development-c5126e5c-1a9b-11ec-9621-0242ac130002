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

    public static void switchCaseDemo() {
        int day = 2;

        switch (day) {
            case 1: {
                System.out.println("Its monday");
                break;
            }
            case 2: {
                System.out.println("Its tuesday");
                break;
            }
            default: {
                System.out.println("Invalid Day");
            }
        }
    }

    public static void switchCaseCondition() {
        Days day = Days.FRIDAY;

        switch (day) {
            case MONDAY: {
                System.out.println("Its Monday");
                break;
            }
            case FRIDAY: {
                System.out.println("Its Friday");
                break;
            }
            default: {
                System.out.println("Invalid Days");
            }
        }
    }

    public static void main(String[] args) {
        ifElseDemo();

        switchCaseDemo();

        switchCaseCondition();
    }
}
