import java.util.Scanner;

public class Root{
        public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner( System.in ); //introduce myscanner
        
        //system asks for and stores number
        System.out.print("Enter a number(a double): ");
            double number = myScanner.nextInt();
        
        //divide number by 3 for guess
        double guess1 = number / 3;
        
        //improve guesses loop
        double guess2 = ((2 * guess1 * guess1 * guess1) + number)/(3 * guess1 * guess1);
        double guess3 = ((2 * guess2 * guess2 * guess2) + number)/(3 * guess2 * guess2);
        double guess4 = ((2 * guess3 * guess3 * guess3) + number)/(3 * guess3 * guess3);
        double guess5 = ((2 * guess4 * guess4 * guess4) + number)/(3 * guess4 * guess4);
        double guess6 = ((2 * guess5 * guess5 * guess5) + number)/(3 * guess5 * guess5);
        
        //check to see if guess6 cubed equals initial number
        double anumber = guess6 * guess6 * guess6;

        System.out.println("The cube root is :" + guess6 + ".");
        System.out.println(" "+ guess6 + "*" + guess6 + "*" + guess6 + "=");
        System.out.println(anumber);
    }
}