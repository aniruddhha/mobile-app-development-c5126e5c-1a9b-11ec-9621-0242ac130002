package exr2;

import java.util.LinkedList;

// just to clear your doubt, I am using both wrapper and primtives; 
// but you uses decide on the basis of requirement
public class WalletRepository {

    private LinkedList<Wallet> database;

    public WalletRepository() {
        database = new LinkedList<>();
    }

    public Double checkBalance(Long id) {
        int pos = findWalletPositionById(id);
        Wallet wl = database.get(pos);
        return wl.getBalance();
    }

    public double topUp(Long id, Double amt) {
        // 1. check wallet with given id is available in list
        // 2. if available just update the balance
        // 3. add new node to list

        int pos = findWalletPositionById(id);
        if (pos != -1) { // id available in list
            Wallet wl = database.get(pos); // got wallet for perticular postion
            wl.setId(id);
            wl.setBalance(wl.getBalance() + amt); // add the balance in existing balance
            database.set(pos, wl); // update the same in linkedlist
            return wl.getBalance();
        }
        // id not available in list
        Wallet wl = new Wallet();
        wl.setBalance(amt);
        wl.setId(id);
        database.add(wl); // add node to linkedlist

        return wl.getBalance();
    }

    public int sendMoney(Long fromId, Long toId, double amt) {

        int posFrm = findWalletPositionById(fromId);
        int posTo = findWalletPositionById(toId);

        if (posFrm == -1) {
            return -1;
        }

        if (posTo == -1) {
            return -2;
        }

        Wallet wlFrm = database.get(posFrm);
        if (wlFrm.getBalance() <= 0) {
            return -3;
        }

        if (wlFrm.getBalance() < amt) {
            return -4;
        }

        wlFrm.setBalance(wlFrm.getBalance() - amt);
        database.set(posFrm, wlFrm);

        Wallet wlTo = database.get(posTo);
        wlTo.setBalance(wlTo.getBalance() + amt);
        database.set(posTo, wlTo);

        return 1;
    }

    private int findWalletPositionById(Long id) {
        for (int i = 0; i < database.size(); i++) {
            Wallet wl = database.get(i);
            if (wl.getId().equals(id)) // if id is available, it will return id
                return i;
        }
        return -1; // if not available it will return -1
    }
}