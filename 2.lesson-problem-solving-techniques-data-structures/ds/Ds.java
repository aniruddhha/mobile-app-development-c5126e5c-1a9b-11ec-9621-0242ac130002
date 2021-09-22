package ds;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
    }

    public static void main(String[] args) {
        linkedList();
    }
}
