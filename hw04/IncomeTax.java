//Matt Gavin
//9/22/14

import java.util.Scanner;

public class IncomeTax{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner( System.in ); //introduce myscanner
        
        //request for user to enter integer for income
        System.out.print("Enter the income in thousands of dollars(an integer > 0): ");
            int income = myScanner.nextInt();
            
        //define different tax bracket percentages
        double tax1 = .05;
        double tax2 = .07;
        double tax3 = .12;
        double tax4 = .14;
        //define associated Income Taxes in dollars 
        double it1 = tax1*income*1000;
        double it2 = tax2*income*1000;
        double it3 = tax3*income*1000;
        double it4 = tax4*income*1000;
        
        double income2 = income*1000;
        
        //check to see if user entered positive integer
        if (income < 0) { //requires that user enters a positive integer
            System.out.println("You need to enter an integer greater than 0");
            System.out.println("Enter the income in thousands of dollars(an integer >0): ");
        }
            //assign income to its matching tax bracket
            else if (income < 20) {
                System.out.println("The tax rate on $"+ income2 +" is 5%, and the tax is $"+ it1 +".");
            }
            else if (income >= 20 && income<40) {
                System.out.println("The tax rate on $"+ income2 +" is 7%, and the tax is $"+ it2 +".");
                
            }
            else if (income >= 40 && income< 78) {
                System.out.println("The tax rate on $"+ income2 +" is 12%, and the tax is $"+ it3 +".");
            }
            else if (income >= 78) {
                System.out.println("The tax rate on $"+ income2 +" is 14%, and the tax is $"+ it4 +".");
            }

    }
}
