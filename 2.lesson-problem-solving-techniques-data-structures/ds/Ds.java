package ds;

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

    public static void main(String[] args) {
        stack();
    }
}
