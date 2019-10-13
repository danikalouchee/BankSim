# BankSim

We get a race condition during a transfer and summing up the account balances. 
One thread is responsible fot adding up the sum of all the account balances. All the other threads keep transferring money between accounts.
So issue happens during all the transfers when one thread calculates the total, it doesn't include all the money, because of other threads that are transferring money. 
