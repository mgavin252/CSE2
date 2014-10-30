//Matt Gavin
//10/29/14
//hw8

import java.util.Scanner;
public class hw8{
    //main method
    public static void main(String []arg){
        char input;
    	Scanner scan=new Scanner(System.in);//initialize scanner
    	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");                 
    	input=getInput(scan,"Cc");                                                                  
    	System.out.println("You entered '"+input+"'");                                             
        System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");                                          
     	input=getInput(scan,"yYnN",5);                                                              
     	if(input!=' '){
       	System.out.println("You entered '"+input+"'"); 
     	}
     	input=getInput(scan,"Choose a digit.","0123456789");                                        
     	System.out.println("You entered '"+input+"'");                                              
    }
    //Cc method
    public static char getInput (Scanner scan, String input1){                                      
        String userInput = scan.next();
        int goodAnswer = 1;                                                     //initialize counter variable
        
        while (goodAnswer == 1){                                                //while condition for loop 
            if (userInput.length()>1){                                          //checks if length is more than 1                     
                System.out.print("You should enter exactly one character- " );
                userInput = scan.next();
                
            }
            else if ( (userInput.charAt(0)!=input1.charAt(0)) && (userInput.charAt(0)!=input1.charAt(1))){
                System.out.print("You did not enter a character from the list 'Cc'; try again-");                               
                userInput=scan.next();                          
                      
            }
            else {
                goodAnswer = 0;
                return userInput.charAt(0);
                
            }
        }
        return userInput.charAt(0);                                             //returns the input
    }
    
    public static char getInput(Scanner scan, String input1, int attempt){                          
        String userInput = scan.next();                                                             
        while (attempt>1){                                                      //attempt variable condition                
            while (userInput.length()>1){                                                               
                System.out.print("You did not enter a character from the list 'yYnN'; try again- ");        
                userInput = scan.next();                                                        
            }
            for (int counter=0;(counter<(input1.length()));counter++){                              //checks input length
                if ((input1.charAt(counter))==(userInput.charAt(0))){                               //chekcs if input is one of the characters in string
                    return userInput.charAt(0);                                                     
                }
            }
            System.out.print("You did not enter a character from the list 'yYnN'; try again- ");    //rejects input
            userInput=scan.next();                                                                  //gets new input
            attempt--;                                                                              //increment attempts down
        }
        System.out.println("You failed after 5 tries");                                          
        return ' ';                                                             //returns blank space after 5 failed attempts
    }
    
    public static char getInput(Scanner scan, String prompt, String options){                       
        System.out.println("Choose a digit");                                   //prompt user to enter digit                   
        System.out.print("Enter either ");                                                        
        for (int x=1;x<=9;x++){                                                 //for loop to print numbers 1-9
            System.out.print(" "+x+" ");                                                            
        }
        System.out.println();                                                   //next line
        String userInput = scan.next();                                                            
        for (int counter=0;(counter<(options.length()));counter++){                               
            if ((options.charAt(counter))==(userInput.charAt(0))){                                
                return userInput.charAt(0);
            }
        }
        System.out.println("You did not enter a digit from 1 to 9");                                           
        return ' ';                                                                                
    }
}
