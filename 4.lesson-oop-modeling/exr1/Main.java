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

        System.out.println("Your Id is - " + rn.nextLong());
        System.out.println("Enter Your Name - " + sc.next());
        System.out.println("Enter Your Age - " + sc.nextInt());

    }
}
