package exr1;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

// this ugly class - why ? because it is taking care of lot of things
public class MenuHelper {

    private Random rn = new Random();
    private Scanner sc = new Scanner(System.in);

    private LinkedList<User> database = new LinkedList<>(); // store the data

    private int choice;

    private void showStartMenu() {

        // add choices also

        String dispStr = "\n \n ----- Welcome To User Management ----- \n \n 1. Register " + "\n 2. Login "
                + "\n 3. Show Users" + " \n \n ";
        System.out.println(dispStr);
    }

    public void askChoice() {

        while (true) {
            showStartMenu();

            System.out.println("--- \n \n Enter Your Choice --- \n \n");
            choice = sc.nextInt(); // you actually get interger from user
            performOperation();
        }
    }

    private void performOperation() {

        if (choice == 1) {
            register();
        } else if (choice == 2) {
            login();
        } else if (choice == 3) {
            showRegisteredUsers();
        } else {
            System.out.println("\n \n --- Bad Choice --- \n \n");
            System.exit(0);
        }
    }

    private void register() {
        System.out.println("--- \n \n For Registering Enter Following Deatils --- \n \n");

        // at time of registration ask for password

        System.out.println("Enter Your Name : ");
        String name = sc.next(); // give text from name input box

        System.out.println("Enter Your Age : ");
        Integer age = sc.nextInt(); // give text from age input box

        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setId(rn.nextLong()); // random long number

        database.add(user); // adding user to linkedlist i.e. our database
    }

    private void login() {
        System.out.println("--- \n \n Login --- \n \n");

        System.out.println("Enter Your Name : ");
        String name = sc.next();

        for (User us : database) { // foreach
            if (name.equals(us.getName())) { // and at the time of login check user name and password
                System.out.println("\n \n ---  Found The User  --- \n \n");
                System.out
                        .println("Id : " + us.getId() + " Name : " + us.getName() + " Age : " + us.getAge() + " \n \n");
                return;
            }
        }
        System.out.println("\n \n ---  User Not Found  --- \n \n");
    }

    private void showRegisteredUsers() {
        System.out.println("\n \n --- Registered Users Are --- \n \n");

        for (int i = 0; i < database.size(); i++) {
            User us = database.get(i);
            System.out.println("Id : " + us.getId() + " Name : " + us.getName() + " Age : " + us.getAge() + " \n \n");
        }
    }

    private void findUsersWithAgeGreterThanFifty() {
        // write your code here
    }

    private void findTheUserWhoNameStartWithA() {
        // write your code here
    }

    private void findTheUsersWhoAgeBetween35To60() {
    }

    private void deleteUser(Long id) {
        // write your code here
    }
}
