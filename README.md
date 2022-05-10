# Individual-project-achalrajyaguru

**Name** : Achal Rajyaguru <br />
**ID** : 015958670

## Instructions to run the project:
1) Open terminal window in your system (Mac/Windows/Linux).
2) Type "git clone https://github.com/gopinathsjsu/individual-project-achalrajyaguru.git" in the terminal window.
3) Select open a project in the intelliJ window and select the pom.xml file.
4) You will be asked if you want to open it as a file or as a project; slect open as a project.
5) The main() method for this app is located in Billing.java
6) Click the play button on the right side of the screen.
7) Once the program is running you will be prompted to Enter an Input file name, here you will have to write the name of the input csv file.
8) I have added 3 CSV files for 3 use cases
9) Upon successful execution of the project, either output.txt or error.txt will get generated based on the processing of the inputs.
10)Output.txt/error.txt will get generated in the same project folder.


## Problem Statement
This is an application where the user has power to purchase items from the store. The application is terminal based and it also maintains a static database.

## Class Diagram

## Design Patterns

### (1) Strategy Pattern:

Strategy pattern is one of the behavioral design patterns. This is mainly used when we have multiple strategies to consider. The input file is processed as an List<List>. The static dataset is stored as a HashMap. The program checks the first strategy which is to check if the given order quantity is permissible or not. If this fails, an Error.txt is generated and the program terminates. If it passes, then it executes another strategy to check the capacity of each item category. If both the strategies are successful, these items are added to the cart and the price of the cart is calculated.
  
### (2) Singleton Pattern:
  
It is a creational design pattern.It ensures the creation of a single instance of the class. In this assignment, this pattern is used to validate the credit card. An instance of the class gets created only if the cart is valid. if the card number in the input file does not exist in the static database of cards (which is maintained as an arraylist), this cardnumber gets added to the database.
  
### (3) Factory Pattern:
  
A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate. In other words, subclasses are responsible to create the instance of the class. 
  
## Test cases and Screenshots



