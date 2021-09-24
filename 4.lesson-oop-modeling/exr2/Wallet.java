package exr2;

import java.util.LinkedList;

public class Wallet {

    private Long id;
    private double balance;
    private LinkedList<Wallet> friends;

    public Long getId() {
        return id;
    }

    public void setId(Long a) {
        id = a;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double b) {
        balance = b;
    }

    public LinkedList<Wallet> getFriends() {
        return friends;
    }

    public void setFriends(LinkedList<Wallet> fr) {
        friends = fr;
    }
}
