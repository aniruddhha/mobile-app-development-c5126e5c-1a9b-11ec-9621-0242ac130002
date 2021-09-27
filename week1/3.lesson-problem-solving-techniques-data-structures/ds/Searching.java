package ds;

import java.util.Arrays;

public class Searching {

    public static int linearSearch(int sv) {
        int[] arr = { 32, 99, 91, 15, 66, 38, 21, 63, 34, 48, 5, 51, 32, 43, 41, 49, 98, 75, 78, 93, 67, 81, 84, 0, 33,
                79, 54, 79, 18, 14, 87, 51, 36, 17, 71, 9, 28, 51, 13, 86, 27, 37, 18, 98, 98, 67, 64, 36, 11, 61 };

        for (int i : arr) {
            if (sv == i)
                return i;
        }

        return -1;
    }

    public static void binarySearch(int sv) {
        int[] arr = { 32, 99, 91, 15, 66, 38, 21, 63, 34, 48, 5, 51, 32, 43, 41, 49, 98, 75, 78, 93, 67, 81, 84, 0, 33,
                79, 54, 79, 18, 14, 87, 51, 36, 17, 71, 9, 28, 51, 13, 86, 27, 37, 18, 98, 98, 67, 64, 36, 11, 61 };

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr); // nlogn
        System.out.println(Arrays.toString(arr));

        int pos = Arrays.binarySearch(arr, sv); // logn

        System.out.println("Position is " + pos);
    }

    public static void main(String[] args) {
        System.out.println(" Search Element  " + linearSearch(32));
        if (linearSearch(929) != -1) {
            System.out.println("Found The Element");
        } else {
            System.out.println("Element Not Found");
        }

        binarySearch(36);
    }

}
