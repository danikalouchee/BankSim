# BankSim

We get a race condition during a transfer and summing up the account balances. 
One thread is responsible fot adding up the sum of all the account balances. All the other threads keep transferring money between accounts.
So issue happens during all the transfers when one thread calculates the total, it doesn't include all the money, because of other threads that are transferring money. 
<img src="https://github.com/3296f19temple/05-kalouche_gorosko-K_M/blob/maxDevelop/UMLrace.png" alt="alt text" width="240" height="410" style="max-width:100%;">

<img src="https://github.com/3296f19temple/05-kalouche_gorosko-K_M/blob/master/UMLrace.png" alt="alt text" width="240" height="410" style="max-width:100%;">
