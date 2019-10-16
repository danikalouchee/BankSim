package edu.temple.cis.c3238.banksim;

import java.util.concurrent.Semaphore;
/**
 * @author Cay Horstmann
 * @author Modified by Paul Wolfgang
 * @author Modified by Charles Wang
 */
public class BankSimMain {

    public static final int NACCOUNTS = 10;
    public static final int INITIAL_BALANCE = 10000;

    public static void main(String[] args) {
        Bank b = new Bank(NACCOUNTS, INITIAL_BALANCE);
        Semaphore semaphore = new Semaphore(NACCOUNTS);
        Thread[] threads = new Thread[NACCOUNTS];
        // Start a thread for each account
        for (int i = 0; i < NACCOUNTS; i++) {
            threads[i] = new TransferThread(b, i, INITIAL_BALANCE,semaphore);
            threads[i].start();
        }

        b.test();
          System.out.printf("Bank transfer is in the process.\n");
    }
}


