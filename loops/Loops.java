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

    public static void main(String[] args) {

        System.out.println("---- Loops ----");

        // forDemo(); // function call

        forColDemo();
    }
}
