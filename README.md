# BankSim

We get a race condition during a transfer and summing up the account balances. 
One thread is responsible fot adding up the sum of all the account balances. All the other threads keep transferring money between accounts.
So issue happens during all the transfers when one thread calculates the total, it doesn't include all the money, because of other threads that are transferring money. 
https://trello.com/b/3uW4FWpi/banksim-board
<img src="https://github.com/3296f19temple/05-kalouche_gorosko-K_M/blob/master/UMLrace.png" alt="alt text" width="860" height="620" style="max-width:100%;">

<img src="https://github.com/3296f19temple/05-kalouche_gorosko-K_M/blob/maxDevelop/Final%20UML.png" alt="master branch pic" width="860" height="620" style="max-width:100%;">

