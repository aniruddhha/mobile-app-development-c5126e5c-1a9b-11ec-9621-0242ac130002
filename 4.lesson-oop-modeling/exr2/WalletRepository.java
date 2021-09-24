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
        return 0.0;
    }

    public double topUp(Long id, Double amt) {
        return 0.0;
    }

    public int sendMoney(Long fromId, Long toId, double amt) {
        return 0;
    }
}