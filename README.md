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
10) Output.txt/error.txt will get generated in the same project folder.


## Problem Statement
The objective of the project is to develop a JAVA application for a user to purchase products online.The application should maintain an internal, static database. This means once we re-run the program, the changes to the data would not persist. The user is only allowed to buy a certain number of products from each category available. The order should satisfy the given requirements, and if it does, a bill amount should be generated. If the order does not satisfy the requirements, an output.txt file should be generated, stating the limitation should be generated.Output file type for a successfully processed order will be a .csv and for all other cases a .txt file.

## Class Diagram

![Class Diagram0](https://user-images.githubusercontent.com/45312477/167541578-063ceae9-d66d-4689-be01-b59fcf5f90c7.jpg)


## Design Patterns


### (1) Strategy Pattern:

Strategy pattern is one of the behavioral design patterns. This is mainly used when we have multiple strategies to consider. The input file is processed as an List<List>. The static dataset is stored as a HashMap. The program checks the first strategy which is to check if the given order quantity is permissible or not. If this fails, an Error.txt is generated and the program terminates. If it passes, then it executes another strategy to check the capacity of each item category. If both the strategies are successful, these items are added to the cart and the price of the cart is calculated.
 

  
### (2) Singleton Pattern:
  
It is a creational design pattern.It ensures the creation of a single instance of the class. In this assignment, this pattern is used to validate the credit card. An instance of the class gets created only if the cart is valid. if the card number in the input file does not exist in the static database of cards (which is maintained as an arraylist), this cardnumber gets added to the database.
 
   ![Singleton_Pattern](https://user-images.githubusercontent.com/45312477/167532863-d4d10ec5-0ae8-41b8-b2c5-26bc649dfb25.jpg)
  
### (3) Factory Pattern:
  
A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate. In other words, subclasses are responsible to create the instance of the class. 
  <img width="578" alt="Screen Shot 2022-05-09 at 9 17 56 PM" src="https://user-images.githubusercontent.com/45312477/167541714-762475cb-f863-4852-9ea8-e215fbfaddcd.png">

## Test cases and Screenshots

# Test Case 1: 
  <img width="1440" alt="Screen Shot 2022-05-09 at 7 40 57 PM" src="https://user-images.githubusercontent.com/45312477/167532201-827918da-9f10-43eb-8f17-10806097de5c.png">
  
# Test Case 2:
  <img width="1440" alt="Screen Shot 2022-05-09 at 7 41 36 PM" src="https://user-images.githubusercontent.com/45312477/167532235-8d316759-e571-473c-89da-f33e2aa57127.png">
  
 # Test Case 3:
  <img width="1440" alt="Screen Shot 2022-05-09 at 7 42 03 PM" src="https://user-images.githubusercontent.com/45312477/167532322-7ff6c699-9cbf-4879-9867-acc76ded5bdd.png">
  



