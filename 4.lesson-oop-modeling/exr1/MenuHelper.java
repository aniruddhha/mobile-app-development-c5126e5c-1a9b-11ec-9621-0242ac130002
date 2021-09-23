package exr1;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class MenuHelper {

    private Random rn = new Random();
    private Scanner sc = new Scanner(System.in);

    private LinkedList<User> database = new LinkedList<>();

    private int choice;

    public void showStartMenu() {
        String dispStr = "\n ----- Welcome To User Management ----- \n \n 1. Register " + "\n 2. Login "
                + "\n 3. Show Users" + " \n \n ";
        System.out.println(dispStr);
    }

    public void performOperation(int ch) {
        choice = ch;

        if (ch == 1) {
            register();
        } else if (ch == 2) {
            login();
        } else if (ch == 3) {
            showRegisteredUsers();
        } else {
            System.out.print("Bad Choice");
        }
    }

    private void register() {
        System.out.println("--- \n \n For Registering Enter Following Deatils --- \n \n");

        System.out.println("Enter Your Name : ");
        String name = sc.next();

        System.out.println("Enter Your Age : ");
        Integer age = sc.nextInt();

        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setId(rn.nextLong());

        database.add(user);
    }

    private void login() {
        System.out.println(" you selected login ");
    }

    private void showRegisteredUsers() {
        System.out.println("\n \n --- Registered Users Are --- \n \n");

        for (User us : database) {
            System.out.println("Id : " + us.getId() + " Name : " + us.getName() + " Age : " + us.getAge() + " \n \n");
        }
    }
}
