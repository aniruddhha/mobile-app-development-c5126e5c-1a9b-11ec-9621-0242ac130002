package ds;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ds {

    public static void stack() {

        Stack<String> stk = new Stack<>();
        stk.push("ios");
        stk.push("android");
        stk.push("windows");
        stk.push("linux");
        stk.push("linux");
        stk.push(null);

        System.out.println(stk.toString());
        System.out.println("Pop - " + stk.pop());
        System.out.println(stk.toString());

        for (int i = 0; i < stk.size(); i++) {
            String el = stk.get(i);

            if (el.equals("android")) {
                System.out.println("Found element at position - " + i);
                break;
            }
        }
    }

    public static void queue() {

        Queue<Integer> que = new LinkedList<>();
        que.add(10);
        que.add(23);
        que.add(2);
        que.add(2);
        que.add(2);
        que.add(45);
        que.add(4);

        System.out.println(que.toString()); // print the que
        System.out.println(" Removed " + que.remove());
        System.out.println(" Removed " + que.remove());
        System.out.println(que.toString()); // print the que
        que.add(566);
        que.add(null);
        System.out.println(que.toString()); // print the que
    }

    public static void linkedList() {

        LinkedList<String> lst = new LinkedList<>();
        lst.add("android");
        lst.add("ios");
        lst.add("linux");
        lst.add("linux");
        lst.add(null);
        lst.add("linux");
        lst.add("windows");

        System.out.println(lst.toString());
        System.out.println(" Element At 2nd Pos " + lst.get(2));
        System.out.println(" Check Availabilty " + lst.contains("ios"));
        System.out.println(" Check Availabilty " + lst.contains("linux"));
        System.out.println(" Remove " + lst.remove("ios"));
        System.out.println(lst.toString());
        lst.add(4, "data");
        System.out.println(lst.toString());
        lst.set(4, "helios");
        System.out.println(lst.toString());
    }

    public static void treeDemo() {
        TreeMap<Integer, String> mp = new TreeMap<>();
        mp.put(1, "android");
        mp.put(56, "ios");
        mp.put(9, "linux");
        mp.put(12, "windows");

        System.out.println(mp.toString());
        System.out.println("Element At 1 " + mp.get(1));
    }

    public static void sortedSet() {

        int[] arr = { 32, 99, 91, 15, 66, 38, 21, 63, 34, 48, 5, 51, 32, 43, 41, 49, 98, 75, 78, 93, 67, 81, 84, 0, 33,
                79, 54, 79, 18, 14, 87, 51, 36, 17, 71, 9, 28, 51, 13, 86, 27, 37 };

        TreeSet<Integer> set = new TreeSet<>();

        for (int i : arr) {
            set.add(i);
        }
        System.out.println(set.toString());
    }

    public static void main(String[] args) {
        sortedSet();
    }
}
