package com.inventory;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Billing
{
    public static void main(String []args) throws ParserConfigurationException, SAXException, IOException {
       boolean isPermissibleQuantity = false;
        List<String> isPermissibleQuantityList = new ArrayList<>();
        List<String> capacityList = new ArrayList<>();
        boolean capChecked = false;
        String cardNumber = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("Paste a file name from ./target: ");

        System.out.flush();

        String fileName = scan.nextLine();
        File file = new File(fileName);
        String absolute = file.getAbsolutePath();
        System.out.println("-----------------------------------");


        FileOperations fileOperations =new CsvFileOperations();
     List<List<String>> records = fileOperations.readFile(file);
        System.out.println(" ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+++ Records obtained from input file: +++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
       System.out.println(records);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");



      for(List<String> list1 : records){
           for(int i=0 ; i< list1.size() ; i++){
               if( i == 2 ){
                    cardNumber = list1.get(i);
               }
           }
       }


        // validate qty stgy pattern
        ValidateQuantity validate = new ValidateQuantity();
        isPermissibleQuantityList = validate.validations(records);  // invokation for strategy pattern
        if(isPermissibleQuantityList.size() > 0){ // quantity check failed
            fileOperations.writeFile("Error.txt",isPermissibleQuantityList);
        } else {
            isPermissibleQuantity = true;
            System.out.println("+++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Permissible Quantity Checked "+isPermissibleQuantity);

            System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        }

        // validate capacity stgy pattern
       ValidateCap validateCap = new ValidateCap();
        capacityList = validateCap.validations(records);
        if(capacityList.size() > 0){ // if cap check failed
            fileOperations.writeFile("output.txt",capacityList);
        } else {
            capChecked = true;
            System.out.println("+++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Cap  Checked "+capChecked);
            System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        }



        //price calculation
        if(isPermissibleQuantity && capChecked){
            System.out.println("+++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Card Number from the input file is: "+ cardNumber);
            System.out.println("+++++++++++++++++++++++++++++++++++++++++");

            //validate card singleton
            SingletonCart.getInstance();
            SingletonCart.validatingCard(cardNumber);

            List<String> total = calculateTotalCost(records);

            fileOperations.writeFile("Output.csv",total);
        }


    }
    public static List<String> calculateTotalCost( List<List<String>> record){
       Cart cart = new CartImpl();
       List<String> priceList = new ArrayList<>();
       float price = 0;
       price = cart.totalCost(record);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        priceList.add("Total Price of your cart is: ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        priceList.add(String.valueOf(price));
        return priceList;
    }
}
