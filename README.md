# 1. [deposit tracking software](https://github.com/akhilarun23/JAVA-simple-projects-daily/commit/4d0fb96fbf2c3d3c64daa1cc3ef90f88dfbac0fc):
  The BankAccount class has a constructor that takes account number and balance as arguments. It also has methods to deposit and withdraw money, and to check the account balance.

  The SavingsAccount class is a subclass of BankAccount and overrides the withdraw() method. It checks if the account balance falls below one hundred before allowing a withdrawal. The method prints an error message if the balance is below one hundred. If the balance is greater than or equal to one hundred, the method calls the withdraw() method of the superclass to withdraw.

  In Main() method -

  The main method begins by creating an instance of the BankAccount class with an account number of "BA1234" and an initial balance of $500. It then deposits $1000 into the account and displays the new balance. It then withdraws $600 from the account and displays the new balance.

  Next, the method creates an instance of the SavingsAccount class with an account number of "SA1234" and an initial balance of $450. It then attempts to withdraw $300 from the account and displays the new balance. Since the balance remains above the minimum $150 balance required for the account, the withdrawal is successful.


  Finally, the method creates another instance of the SavingsAccount class with an account number of "SA1000" and an initial balance of $300. It then attempts to withdraw $250 from the account, which would bring the balance below the minimum balance required for the account. The method displays the new balance after the attempted withdrawal, which should still be $300 since the withdrawal was unsuccessful.

![image](https://github.com/user-attachments/assets/c6f0c29a-4d3a-4e76-b365-2dd21be92c60)

![image](https://github.com/user-attachments/assets/3350561f-71ba-4a64-8c96-074a8096127a)
![image](https://github.com/user-attachments/assets/0cd9b3b3-b53d-4878-b401-5cfd711c9fed)

# 2.[MADLIBS](https://github.com/akhilarun23/JAVA-simple-projects-daily/blob/main/MadLibs.java)
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

# 3.[PLANTING A TREE IN JAVA](https://github.com/akhilarun23/JAVA-simple-projects-daily/blob/main/plantingATree.java)

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

# 4.[Math Magic](https://github.com/akhilarun23/JAVA-simple-projects-daily/blob/main/MathMagic.java)
# 🧮 Magic Number Calculation

This Java program demonstrates arithmetic operations using integer variables.

## 📌 Overview
The program initializes a number, performs a series of mathematical operations, and prints the final result.

## 🖥️ Code
```java
public class Magic {
    public static void main(String[] args) {
        int myNumber = 3;  // Initialize the original number
        int m = 0;         // Initialize a variable to store results

        // Applying a series of arithmetic operations
        m *= myNumber;  // m = 0 * 3 = 0
        m += myNumber;  // m = 0 + 3 = 3
        m /= myNumber;  // m = 3 / 3 = 1
        m += 17;        // m = 1 + 17 = 18
        m -= myNumber;  // m = 18 - 3 = 15
        m /= 6;         // m = 15 / 6 = 2 (integer division)

        System.out.println(m);  // Output: 2
    }
}
📖 Explanation
Step-by-step Execution
int myNumber = 3;

This initializes myNumber with the value 3.
int m = 0;

The variable m is set to 0.
m *= myNumber;

m = 0 * 3 = 0 (Multiplying by zero keeps m as 0.)
m += myNumber;

m = 0 + 3 = 3 (Adding myNumber to m.)
m /= myNumber;

m = 3 / 3 = 1 (Integer division results in 1.)
m += 17;

m = 1 + 17 = 18 (Adding 17 to m.)
m -= myNumber;

m = 18 - 3 = 15 (Subtracting myNumber.)
m /= 6;

m = 15 / 6 = 2 (Integer division discards decimals.)
System.out.println(m);

Prints 2 as the final output.
🚀 How to Run
Install Java JDK if not already installed.

Save the code in a file named Magic.java.

Open a terminal and navigate to the file location.

Compile and run the program using:

sh
Copy
Edit
javac Magic.java
java Magic
🎯 Expected Output
Copy
Edit
2
🛠️ Modifications
You can change myNumber to test different cases.
Modify the operations to observe different results.
```

# 5.[BASIC CALCULATOR](https://github.com/akhilarun23/JAVA-simple-projects-daily/blob/main/BasicCalculator.java)
# Calculator

## Description
A simple Java program that implements a basic calculator. The `Calculator` class provides methods for performing arithmetic operations such as addition, subtraction, multiplication, division, and modulo.

## Features
- **Addition (`add`)**: Returns the sum of two integers.
- **Subtraction (`subtract`)**: Returns the difference between two integers.
- **Multiplication (`multiply`)**: Returns the product of two integers.
- **Division (`divide`)**: Returns the quotient of two integers.
- **Modulo (`modulo`)**: Returns the remainder when one integer is divided by another.

## Installation
### Prerequisites
- Java Development Kit (JDK) installed.
- A Java-supported IDE or command-line terminal.

### Compilation & Execution
1. Save the code as `Calculator.java`.
2. Open a terminal or command prompt.
3. Navigate to the directory containing `Calculator.java`.
4. Compile the program using:
   ```sh
   javac Calculator.java
   ```
5. Run the program using:
   ```sh
   java Calculator
   ```

## Usage
The program demonstrates the functionality of the `Calculator` class by creating an instance and performing calculations:

```java
public static void main(String[] args) {
    Calculator myCalculator = new Calculator();
    System.out.println("Addition: " + myCalculator.add(5, 7)); // Output: 12
    System.out.println("Subtraction: " + myCalculator.subtract(45, 11)); // Output: 34
}
```

## Notes
- The `divide` method does not handle division by zero. Implementing a `try-catch` block is recommended.
- The program currently returns integer results. To support floating-point calculations, modify the method parameters to `double`.



# 6.[Build A Droid](https://github.com/akhilarun23/JAVA-simple-projects-daily/blob/main/BuildADroid.java)
# Droid Java Program

This is a simple Java program that simulates the behavior of droid instances, including task execution, battery management, and energy transfer between droids.

## Features
- **Create a Droid:** Instantiate a droid with a name and a default battery level of 100.
- **Perform Tasks:** Droids can perform tasks, which reduce their battery level by 10 units.
- **Check Battery Level:** Check the current battery level of a droid.
- **Energy Transfer:** When a droid's battery level is 20 or below, it can receive energy, increasing its battery level by 10.
- **String Representation:** Get a friendly string description of the droid.

## Class Breakdown

### `Droid`

- **Attributes:**
  - `name`: The name of the droid.
  - `batteryLevel`: The current battery level (initially set to 100).

- **Constructor:**
  - `Droid(String droidName)`: Creates a new droid with a given name.

- **Methods:**
  - `performTask(String task)`: Reduces battery by 10 and prints the task being performed.
  - `checkBattery()`: Prints the current battery level.
  - `energyTransfer()`: If battery is 20 or less, adds 10 to the battery level.
  - `toString()`: Returns a string with the droid's name.

## Main Program
In the `main` method:
- Two droid instances are created (`Codey` and `Rodey`).
- `Codey` performs multiple tasks until the battery is drained.
- Battery levels are checked.
- Energy transfer is triggered when needed.
- `Rodey` loses some energy to demonstrate battery consumption.

## Example Output
```
Hello, I'm the droid: Codey
Codey is performing task: Dancing
Codey is performing task: Running
...
The battery level of Codey is 10
The battery level of Rodey is 100
Codey gets energy from other instance and battery level is 20
The battery level of Rodey is 90
```

## How to Run
1. Save the code in a file named `Droid.java`.
2. Compile the program:
   ```sh
   javac Droid.java
   ```
3. Run the program:
   ```sh
   java Droid
   ```

## Possible Improvements
- Allow energy transfer between two droids.
- Add more complex energy drain or recharge behaviors.
- Introduce droid-specific abilities.

Feel free to contribute or extend the functionality! 🚀

---

Let me know if you want me to refine anything or add more explanations! ✨












