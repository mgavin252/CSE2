
import java.util.Scanner;

public class FourDigits{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner( System.in ); //introduce myscanner
        
        //system asks for and stores number of seconds
        System.out.print("Enter the number (any number with four decimal places): ");
            double x = myScanner.nextDouble();

            //declare each of the four decimal places as integers
            int x1;
            int x2;
            int x3;
            int x4;
            
            //redeclare as integers and assign positions
            x1=(int)(x*10)%10;
            x2=(int)(x*100)%10;
            x3=(int)(x*1000)%10;
            x4=(int)(x*10000)%10;
    
        
        System.out.println("The four digits are " + x1 + x2 + x3 + x4 + ".");

     
    }
}