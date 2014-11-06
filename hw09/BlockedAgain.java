/*
Matt Gavin
11/4/14
HW 09 - Blocked Again
*/

import java.util.Scanner;                                   
public class BlockedAgain{
    public static void main(String []s){
      int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt();   //defines m as method getInt
        allBlocks(m);   //calls method allBlocks with argument m
    }
    
    /*getInt method: method will initialize boolean equal to false 
    so that the while loop runs at least once. The while loop will set an integer
    variable to call checkInt() method. Then, it calls the checkRange() method 
    to check the range. The while loop will continue to run as long as the 
    input is outside of range [1,9]. Once input is between 1-9, tf is true and
    getInt returns the userinput*/
    public static int getInt (){
        boolean tf = false;
        int userinput=0;
        while(tf == false){
        userinput = checkInt();
        tf = checkRange(userinput);
        }
        return userinput;
    }
    /*checkInt() method: method will prompt user to enter an integer between 1-9
    and will use Scanner to accept system input. While loop will ensure that as
    long as the user does not input an integer, user will be prompted to enter 
    an integer between 1-9. Once myScanner is an integer, checkInt() will return
    the integer that was entered back to the previous method, which sets
    "userinput" equal to checkInt. At this point in the getInt() while loop,
    the user has entered an integer and "userinput" is set equal to that integer.
    */
    public static int checkInt(){
        System.out.println("Please enter an integer between 1-9.");
        Scanner myScanner = new Scanner(System.in);
        while (myScanner.hasNextInt()==false){
            System.out.println("You did not enter an integer.");
            System.out.println("Please enter an integer between 1-9.");
            myScanner.next();
        }
        return myScanner.nextInt();
    }
    /*checkRange() method: method will accept integer entered by user and will 
    return a boolean to the getInt() method. In getInt() method, loop continues
    to run while checkRange() returns false. In this method, if the input is
    not between 1-9, it returns false; therefore, the while loop continues to
    run. If it is between 1 and 9, it returns true, exiting the while loop.*/
    public static boolean checkRange(int input){
        if (input <= 0 || input > 9){
            return false;
        }
        return true;
    }
    public static void allBlocks(int answer){
        int counter = 1;
        while (counter <= answer){
            block(counter, answer);
            counter++;
            for(int x = answer-1; x>0; x--){
                System.out.print(" ");
            }
            System.out.println("-");
        }
    }
    
    public static void block(int number, int m){
        for(int x = 1; x <= number;x++){
            line(number,m);
        }
    }
    
    public static void line(int number, int m){
        for(int x=number; x < m ;x++){
            System.out.print(" ");
        }
        for (int x=2;x<number*2;x++){
            System.out.print(+number);
        }
        System.out.println(+number);
        
    }
}