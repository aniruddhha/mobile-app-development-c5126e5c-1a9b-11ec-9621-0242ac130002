package loops;

public class Loops {

    public static void forDemo() { // function defination

        int[] nums = { 13, 89, 12, 96, 36 };

        // init ; condition ; steps
        for (int i = 0; i < nums.length; i = i + 1) {
            System.out.println(" Position " + i + " Element " + nums[i]);
        }
    }

    public static void forColDemo() {
        int[] nums = { 13, 89, 12, 96, 36 };

        // element of array
        for (int el : nums) {
            System.out.println(" Element = " + el);
        }
    }

    public static void whileDemo() {
        int[] nums = { 13, 89, 12, 96, 36 };

        int i = 0;
        while (i < nums.length) { // conditional
            System.out.println("Element = " + nums[i]);
            i++;
        }
    }

    public static void doWhileDemo() {
        int[] nums = { 13, 89, 12, 96, 36 };

        int i = 0;
        do {
            System.out.println("Element = " + nums[i]);
            i++;
        } while (i < nums.length); // conditional
    }

    public static void main(String[] args) {

        System.out.println("---- Loops ----");

        // forDemo(); // function call

        // forColDemo();

        whileDemo();

        doWhileDemo();
    }
}
