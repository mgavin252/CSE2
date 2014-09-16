
import java.util.Scanner;

public class Bycicle{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner( System.in ); //introduce myscanner
        
        //system asks for and stores number of seconds
        System.out.print("Enter the number of Seconds(an integer > 0): ");
            int Seconds = myScanner.nextInt();
            
        //system asks for and stores number of counts
        System.out.print("Enter the number of counts(an integer > 0): ");
            int counts = myScanner.nextInt();
            
        //define variables
        double aDistance;
            aDistance = counts * 0.000426136 * Math.PI; //distance in miles
        double aTime;
            aTime = Seconds / 60; //time in minutes
        double rpm;
            rpm = counts / aTime; //rpm in minutes
        double amph;
            amph = aDistance * 60 / aTime; //mph in hours
            
        //round variables
        double Distance;
            Distance = (aDistance * 100) / 100;
        double mph;
            mph = (amph * 100) / 100;
            
            
    
        
            
       
        
        System.out.println("The distance was " + Distance + " miles and took " + aTime + " minutes.");
        System.out.println("The average mph was " + mph + " mph.");

     
    }
}