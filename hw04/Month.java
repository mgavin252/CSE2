//Matt Gavin
//9/22/14

import java.util.Scanner;

public class Month{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner( System.in ); //introduce myscanner
        
        //request for user to enter integer for income
        System.out.print("Enter the integer assoicated with the desired month(an integer 1-12): ");
            int month = myScanner.nextInt();
            
            if (month < 1) {                                                            //Require integer between 1 and 12
                System.out.println("Enter an integer between 1-12.");
            }
            else if (month == 1) {                                                      //January
                System.out.println("The month has 31 days.");
            }
            else if (month == 2) {                                                      //February
                System.out.println("Enter the year as an integer with 4 digits");
                    int year = myScanner.nextInt(); //Leap year calculator
                    if (year % 4 == 0) {
                        System.out.println("The month has 29 days.");
                    }
                    else if (year % 4 != 0) {
                        System.out.println("The month has 28 days.");
                    }
            }
            else if (month == 3) {                                                      //March
                System.out.println("The month has 31 days.");
            }
            else if (month == 4) {                                                      //April
                System.out.println("The month has 30 days.");
            }
            else if (month == 5) {                                                      //May
                System.out.println("The month has 31 days.");
            }
            else if (month == 6) {                                                      //June
                System.out.println("The month has 30 days.");
            }
            else if (month == 7) {                                                      //July
                System.out.println("The month has 31 days.");
            }
            else if (month == 8) {                                                      //August
                System.out.println("The month has 31 days.");
            }
            else if (month == 9) {                                                      //September
                System.out.println("The month has 30 days.");
            }
            else if (month == 10) {                                                     //October
                System.out.println("The month has 31 days.");
            }
            else if (month == 11) {                                                     //November
                System.out.println("The month has 30 days.");
            }
            else if (month == 12) {                                                     //December
                System.out.println("The month has 31 days.");
            }
    }
}
       