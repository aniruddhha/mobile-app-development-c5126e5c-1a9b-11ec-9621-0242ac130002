package loops;

public class Loops {

    public static void forDemo() {

        int[] nums = { 13, 89, 12, 96, 36 };

        // init ; condition ; steps
        for (int i = 0; i < nums.length; i = i + 1) {
            System.out.println(" Position " + i + " Element " + nums[i]);
        }
    }

    public static void main(String[] args) {
        forDemo();
    }
}
