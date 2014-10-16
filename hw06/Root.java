//Matt Gavin
//10/15/14
//Root

import java.util.Scanner;                                                       //import Scanner utility
public class Root{                                                              //define class
    public static void main (String [] args){                                   //define method
        System.out.println("Enter a double that is greater than 0");            //prompt user for double
        Scanner myScanner = new Scanner (System.in);                            //declaring new scanner object
        double x = myScanner.nextDouble();                                      //declare entered number 
        double low = 0;                                                         
        double high = x + 1;
        double medium = ((high+low)/2);                                         //define medium as average
        double tolerance = high - low;
        if (x>0){
            while (tolerance>.0000001*x){      
                tolerance = high - low;
                medium = ((high+low)/2);
                if ((medium*medium)>x){
                    high = medium;                                              //set high equal to medium
                }
                else{
                    low = medium;
                }
            }
        System.out.println("The square root of "+x+" is " +medium);
        }
        else {
            System.out.println("Your number is not greater than 0");
            return;
        }
    }
}