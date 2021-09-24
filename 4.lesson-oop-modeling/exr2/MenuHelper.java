package exr2;

import java.util.Scanner;

public class MenuHelper {

    private Scanner sc = new Scanner(System.in);

    public void showMenu() {

        String menu = "\n 1. Check Balance " + "\n 2. Top Up " + "\n 3. Send Money" + "\n 4. Exit";

        while (true) {
            System.out.println(menu);
            System.out.print("\n Enter your choice : ");
            int choice = sc.nextInt();
            performOperation(choice);
        }
    }

    private void performOperation(int choice) {
        System.out.println("\n *** Performing Operation *** \n");

        if (choice == 1)
            checkBalance();
        else if (choice == 2)
            topUp();
        else if (choice == 3)
            sendMoney();
        else
            System.exit(0);
    }

    private void checkBalance() {
        System.out.println("\n *** Checking Balance *** \n");
    }

    private void topUp() {
        System.out.println("\n *** Top Up Wallet *** \n");
    }

    private void sendMoney() {
        System.out.println("\n *** Sending Money *** \n");
    }
}
