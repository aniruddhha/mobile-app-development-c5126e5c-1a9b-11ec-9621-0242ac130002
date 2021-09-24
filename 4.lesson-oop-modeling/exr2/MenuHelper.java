package exr2;

import java.util.Scanner;

// just to clear your doubt, I am using both wrapper and primtives; 
// but you uses decide on the basis of requirement
public class MenuHelper {

    private Scanner sc; // state
    private WalletRepository repository;

    public MenuHelper() { // initilize the state at the time of object creation
        sc = new Scanner(System.in);
        repository = new WalletRepository();
    }

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

        System.out.print("\n Enter Wallet ID : ");
        Long walledId = sc.nextLong();

        double balance = repository.checkBalance(walledId);

        System.out.println("\n *** Balance For " + walledId + " is : " + balance + "  *** \n");
    }

    private void topUp() {
        System.out.println("\n *** Top Up Wallet *** \n");

        System.out.print("\n Enter Wallet ID : ");
        Long walledId = sc.nextLong();

        System.out.print("\n Enter Amount : ");
        Double amount = sc.nextDouble();

        double balance = repository.topUp(walledId, amount);

        System.out.println("\n *** Wallet " + walledId + " Updated : " + balance + "  *** \n");
    }

    private void sendMoney() {
        System.out.println("\n *** Sending Money *** \n");

        System.out.print("\n Enter Your Wallet ID : ");
        Long fromWalledId = sc.nextLong();

        System.out.print("\n Enter Friends ID : ");
        Long toWalledId = sc.nextLong();

        System.out.print("\n Enter Amount : ");
        Double amount = sc.nextDouble();

        Integer status = repository.sendMoney(fromWalledId, toWalledId, amount);

        if (status == -1) {
            System.out.println("\n *** Sender Wallet Does Not Present *** \n");
        } else if (status == -2) {
            System.out.println("\n *** Receiver Wallet Does Not Present *** \n");
        } else if (status == -3) {
            System.out.println("\n *** You have Zero/Negative Balance *** \n");
        } else if (status == -4) {
            System.out.println("\n *** Insufficient Balance *** \n");
        } else {
            System.out.println("\n *** Amount Transferred Successfully *** \n");
        }
    }

}
