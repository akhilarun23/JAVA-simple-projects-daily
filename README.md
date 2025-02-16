#1.EXPLANATION OF [deposit tracking software](https://github.com/akhilarun23/JAVA-simple-projects-daily/commit/4d0fb96fbf2c3d3c64daa1cc3ef90f88dfbac0fc):
  The BankAccount class has a constructor that takes account number and balance as arguments. It also has methods to deposit and withdraw money, and to check the account balance.

  The SavingsAccount class is a subclass of BankAccount and overrides the withdraw() method. It checks if the account balance falls below one hundred before allowing a withdrawal. The method prints an error message if the balance is below one hundred. If the balance is greater than or equal to one hundred, the method calls the withdraw() method of the superclass to withdraw.

  In Main() method -

  The main method begins by creating an instance of the BankAccount class with an account number of "BA1234" and an initial balance of $500. It then deposits $1000 into the account and displays the new balance. It then withdraws $600 from the account and displays the new balance.

  Next, the method creates an instance of the SavingsAccount class with an account number of "SA1234" and an initial balance of $450. It then attempts to withdraw $300 from the account and displays the new balance. Since the balance remains above the minimum $150 balance required for the account, the withdrawal is successful.


  Finally, the method creates another instance of the SavingsAccount class with an account number of "SA1000" and an initial balance of $300. It then attempts to withdraw $250 from the account, which would bring the balance below the minimum balance required for the account. The method displays the new balance after the attempted withdrawal, which should still be $300 since the withdrawal was unsuccessful.

![image](https://github.com/user-attachments/assets/c6f0c29a-4d3a-4e76-b365-2dd21be92c60)

![image](https://github.com/user-attachments/assets/3350561f-71ba-4a64-8c96-074a8096127a)
![image](https://github.com/user-attachments/assets/0cd9b3b3-b53d-4878-b401-5cfd711c9fed)

