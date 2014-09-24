//Matt Gavin
//9/22/14

import java.util.Scanner;

public class TimePadding{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner( System.in );                                   //introduce myscanner
        
                                                                                //request for user to enter integer for seconds
        System.out.print("Enter the number of seconds (as an integer > 0): ");
            int seconds = myScanner.nextInt();
            
            int hours = (seconds/3600);
            int minutes = seconds/60 - hours*60;
            int seconds1 = seconds - minutes*60 - hours*3600;
            
            if (seconds > 0) {
                System.out.println("The time is " + hours+":"+minutes+":"+seconds1+".");
            }
            else {
                System.out.println("The integer you entered is not positive");
            }
            
            
    }
}
            