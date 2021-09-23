package exr1;

import java.util.LinkedList;

public class MenuHelper {

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
        System.out.println(" you selected registration ");
    }

    private void login() {
        System.out.println(" you selected login ");
    }

    private void showRegisteredUsers() {
        System.out.println(" you selected show user ");
    }
}
