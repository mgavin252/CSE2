
import java.util.Scanner;

public class BigMac{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner( System.in ); //introduce myscanner
        
        System.out.print("Enter the number of Big Macs(an integer > 0): ");
            int nBigMacs = myScanner.nextInt();
        System.out.print("Enter the cost per Big Mac as"+"a double (in the form xx.xx): " );
            double bigMac$ = myScanner.nextDouble();
	    System.out.print("Enter the percent tax as a whole number (xx): ");
            double taxRate = myScanner.nextDouble();
        
        taxRate/=100; 
        
        double cost$;
        int dimes; //for storing decimal places (cents)
        int pennies;
        int dollars;   //whole dollar amount of cost   
        
        cost$ = nBigMacs*bigMac$*(1+taxRate); 

        dimes=(int)(cost$*10)%10; //gives us tens spot of decimal
        pennies=(int)(cost$*100)%10; //gives us hundreds spot of decimal
        System.out.println("The total cost of " +nBigMacs+" BigMacs, at $"+bigMac$ +" per bigMac, with a" + " sales tax of "+ (int)(taxRate*100) + "%, is$" +dollars+ "." +dimes+pennies);


      
    }
}