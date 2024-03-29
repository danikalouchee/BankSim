package edu.temple.cis.c3238.banksim;
import java.util.concurrent.Semaphore;
/**
 * @author Cay Horstmann
 * @author Modified by Paul Wolfgang
 * @author Modified by Charles Wang
 */
class TransferThread extends Thread {

    private final Bank bank;
    private final int fromAccount;
    private final int maxAmount;

    public TransferThread(Bank b, int from, int max) {
        
        bank = b;
        fromAccount = from;
        maxAmount = max;
    }

    @Override
    public void run() {
        
        for (int i = 0; i < 1000; i++) {
            //System.out.println("TRANSFER THREAD ACQUIRE: " + semaphore.toString());
            int toAccount = (int) (bank.size() * Math.random());
            int amount = (int) (maxAmount * Math.random());
            bank.transfer(fromAccount, toAccount, amount);

            //System.out.println("TRANSFER THREAD RELEASE: " + semaphore.toString());
        
        }
        bank.closeBank();
    }
}