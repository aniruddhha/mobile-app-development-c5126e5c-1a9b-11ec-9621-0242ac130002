package exr1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MenuHelper helper = new MenuHelper();
        helper.showStartMenu();
        helper.performOperation(2);

        Random rn = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Your Id is - " + rn.nextLong()); // it will generate random long
        System.out.println("Enter Your Name - " + sc.next()); // it will read string from user
        System.out.println("Enter Your Age - " + sc.nextInt()); // it will read integer from user

    }
}
