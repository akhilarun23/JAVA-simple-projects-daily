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

#2.EXPLANATION OF [MADLIBS](https://github.com/akhilarun23/JAVA-simple-projects-daily/blob/main/MadLibs.java)
# Java Mad Libs

## Description
Mad Libs is a fun word game where players fill in the blanks of a short story with different types of words (nouns, verbs, adjectives, etc.), leading to hilarious or unexpected results. In this project, we'll use Java to create an interactive Mad Libs game.

## Features
- Prompts users to enter words for blank spaces in a story
- Generates a funny or unexpected story using user input
- Runs in the console
- Demonstrates the use of Java variables and user input

## Technologies Used
- Java
- Scanner class for user input

## How to Run
1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/mad-libs-java.git
   cd mad-libs-java
   ```
2. Compile the Java file:
   ```bash
   javac MadLibs.java
   ```
3. Run the program:
   ```bash
   java MadLibs
   ```

## Example Output
```
Enter a noun: dog
Enter a verb: runs
Enter an adjective: happy
Enter an adverb: quickly

Here is your Mad Libs story:
The happy dog runs quickly through the park!
```
“Roses are Red” poem example:
![image](https://github.com/user-attachments/assets/a41a3f9d-5d4b-4ee4-b116-950728e86f5e)

# 3.[PLANTING A TREE IN JAVA]()

# 🌲 Tree Planting Program in Java

## 📌 Description
This is a simple Java program that prints a tree pattern to the console. It demonstrates the use of `System.out.println()`, loops, and basic formatting techniques to display a visually appealing tree structure. Additionally, the program introduces a short animation effect using `Thread.sleep()`.

## 🚀 Features
- Prints a tree pattern in the console.
- Uses a method to structure the code better.
- Implements a delay effect for a simple animation.
- Beginner-friendly Java program.

## 🛠️ Technologies Used
- Java






