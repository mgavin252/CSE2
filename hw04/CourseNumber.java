//Matt Gavin
//9/22/14

import java.util.Scanner;

public class CourseNumber{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner( System.in );                                   //introduce myscanner
        
                                                                                //request for user to enter integer for CRN
        System.out.print("Enter the six digit integer (of form xxxxy0 where y is an integer from 1-4): ");
            int crn = myScanner.nextInt();
            int year = crn/100;                                                 //define integer for year of course
            int x1 = (int)(crn/10)%10;
            int x2 = (int)(crn)%10;

            if (crn < 100000 || crn > 999999) {                                 //Require integer that's six digits
                System.out.println("Enter a six digit integer");                //Require user to enter six digit integer if it was not already
            }

            else if (x1 == 1 || x1 == 2 || x1 == 3 || x1 == 4 && x2 == 0) {     //Requires that y is between 1 and 4 and that the last digit is 0

                if (crn >= 201440) {                                            //begin series of if statements for future classes
                    if (x1 == 1){
                        System.out.println("The class will be taught in the Spring of "+ year +".");
                    }
                    else if (x1 == 2) {
                        System.out.println("The class will be taught in the first Summer session of "+ year +".");
                    }
                    else if (x1 == 3) {
                        System.out.println("The class will be taught in the second Summer session of "+ year +".");
                    }
                    else if (x1 == 4) {
                        System.out.println("The class will be taught in the Fall of "+ year +".");
                    }
                }
                else if (crn <= 201440) {                                       //begin series of if statements for previous classes
                    if (x1 == 1) {
                        System.out.println("The class was taught in the Spring of "+ year +".");
                    }
                    else if (x1 == 2) {
                        System.out.println("The class was taught in the first Summer session of "+ year +".");
                    }
                    else if (x1 == 3) {
                        System.out.println("The class was taught in the second Summer session of "+ year +".");
                    }
                    else if (x1 == 4) {
                        System.out.println("The class was taught in the Fall of "+ year +".");
                    }
                }
            }
            else {                                                              //no answer if requirements aren't met
                System.out.println("There is no such course number (y is not an integer from 1-4 or last digit isn't 0)");
            }
    }
}