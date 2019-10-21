# BankSim
Kalouche
Goroshko


Max Goroshko and Kamelya Kalouche

We get a race condition during a transfer and summing up the account balances. 
One thread is responsible fot adding up the sum of all the account balances. All the other threads keep transferring money between accounts.
So issue happens during all the transfers when one thread calculates the total, it doesn't include all the money, because of other threads that are transferring money. 
https://trello.com/b/3uW4FWpi/banksim-board

Requirements:

The goal of this lab was to find and fix race conditions in a multi-threaded program. The code given to us did not have any protection for the critical part of the code so there was a race condition when it ran. We had to complete five tasks for this program. The first was to observe the race condition and make a uML sequence diagram that supports our observation of the race condition. The second task was to implement protection code that would resolve the race condition issue with transferring. The way we did this task was by creating a lock in the transfer method that locks before it tries to withdraw and deposit the amount and then unlocks after. We also made the withdraw and deposit functions synchronized functions. For the third task we had to refactor the method of testing summing the accounts and had to implement protection code to fix the other race condition error. To do this we used the same lock in the transfer method for the test method and we locked it before it adds the new sum of all the accounts and then we unlocked it right after. Task four asks us to implement a wait/notify solutions to postpone a transfer until the account has an amount greater than the transferring amount. To do this we added a waitForAvaliableFunds method that makes a thread wait if the amount wanting to be withdrawn is greater than the account balance. This method is called first thing in the transfer method. For task five we had to create a way to close and open the bank to make a thread stop fund transferring whenever one thread completes its fun transfer to fix the deadlock issue. To do this we created a synchronized boolean isOpen method that returns if the bank is open or not. We also added a closeBank method that sets open to false and also has a for loop that goes through the accounts and notifyAll accounts which wakes up all the threads that called wait() on the same object. We also added a for loop in the main that goes through each thread and joins them together. This allows one thread to wait until another thread completes its execution.

Team work:

We split up the work evenly on this lab. Max did task one (including updated UML), three, and five. I (Kamelya) did task two and four along with this write up. We worked together through out the tasks and had to change and add things other than our own tasks in order to make the program run correctly.

Testing:

We decided manual testing was the best method of testing for this project. We noticed after completing task two that the program ran for longer than it did when it had a race condition. The sum would display 10000 continuously for about a minute or so which was a lot longer than the previous build. We continued to check on how the project ran after each task was implemented. We ran into problems where only one thread will executed or the program would run into a deadlock and all threads were waiting for each other to continue. The print statements in the code helped us find and solve these errors when we came across them because we could see when what thread is running when. We knew the program was running correctly when the output had exactly 10 lines of account balance (account[0] to account[9]) and had a line where the sum equals 100000 along with the bank is in balance statement. 

<img src="https://github.com/3296f19temple/05-kalouche_gorosko-K_M/blob/master/UMLrace.png" alt="alt text" width="650" height="620" style="max-width:100%;">

<img src="https://github.com/3296f19temple/05-kalouche_gorosko-K_M/blob/master/Final%20UML.png" alt="master branch pic" width="650" height="800" style="max-width:100%;">

