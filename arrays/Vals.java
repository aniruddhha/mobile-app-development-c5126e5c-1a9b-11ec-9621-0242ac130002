package arrays;

public class Vals {
    public static void main(String[] args) {

        System.out.println("---- Arrays ----");
        int[] nums = { 10, 89, 63, 7, 23, 5, 1 }; // static declaration of array

        System.out.println("Length = " + nums.length);
        System.out.println("Element At 2nd Pos = " + nums[1]);
        nums[1] = 56;
        System.out.println("Element At 2nd Pos = " + nums[1]);

        int[] mobs = new int[3]; // dynamic array
        mobs[0] = 1;
        mobs[1] = 2;
        mobs[2] = 3;

        System.out.println("Length = " + mobs.length);
        System.out.println("0th Element = " + mobs[0]);
    }
}
