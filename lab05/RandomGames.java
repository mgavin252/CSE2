/*Matt Gavin
10/1/14
LAB 5 - Random Games
*/

import java.util.Scanner;
public class RandomGames{
    public static void main (String [] args){
        System.out.println("Enter R for roulette, C for craps, and P to pick up a card");
        Scanner myScanner = new Scanner (System.in);
        String input = myScanner.next();
        int outcome;
        int outcome2;
        /*Beginning of switch statement to 
        determine the case to follow, 
        given the input*/
        switch (input.toLowerCase()){
            //Roulette
            case "R":
                outcome = (int)(Math.random()*37);
                if (outcome == 0){
                    System.out.println("The Roulette spin was 0.");
                }
                else if(outcome == 1){
                    System.out.println("The Roulette spin was 00.");
                }
                else{
                    System.out.println("The Roulette spin was "+(outcome-1)+".");
                }
                return;
            case "r":
                outcome = (int)(Math.random()*37);
                if (outcome == 0){
                    System.out.println("The Roulette spin was 0.");
                }
                else if(outcome == 1){
                    System.out.println("The Roulette spin was 00.");
                }
                else{
                    System.out.println("The Roulette spin was "+(outcome-1)+".");
                }
                return;
            //Craps
            case "C":
                outcome = (int)(Math.random()*6)+1;
                outcome2 = (int)(Math.random()*6)+1;
                System.out.println("The sum of the dice rolls was "+outcome+" + "+outcome2+" = "+(outcome + outcome2)+".");
                return;
            case "c":
                outcome = (int)(Math.random()*6)+1;
                outcome2 = (int)(Math.random()*6)+1;
                System.out.println("The sum of the dice rolls was "+outcome+" + "+outcome2+" = "+(outcome + outcome2)+".");
                return;
            //Pull a card
            case "p":
                outcome = (int)(Math.random()*4)+1;                             //determines card value
                outcome2 = (int)(Math.random()*13)+1;                           //determines suit
                if (outcome2 == 8){
                    if (outcome == 1){
                        System.out.println("You pulled an "+outcome2+" of spades.");
                        return;
                    }
                    else if (outcome == 2){
                        System.out.println("You pulled an "+outcome2+" of hearts.");
                        return;
                    }
                    else if (outcome == 3){
                        System.out.println("You pulled an "+outcome2+" of diamonds.");
                        return;
                    }
                    else{
                        System.out.println("You pulled an "+outcome2+" of clubs.");
                        return;
                    }
                }
                else if(outcome2 == 11){
                    if (outcome == 1){
                        System.out.println("You pulled a Jack of spades.");
                        return;
                    }
                    else if (outcome == 2){
                        System.out.println("You pulled a Jack of hearts.");
                        return;
                    }
                    else if (outcome == 3){
                        System.out.println("You pulled a Jack of diamonds.");
                        return;
                    }
                    else{
                        System.out.println("You pulled a Jack of clubs.");
                        return;
                    }
                    
                }
                else if(outcome2 == 12){
                    if (outcome == 1){
                        System.out.println("You pulled a Queen of spades.");
                        return;
                    }
                    else if (outcome == 2){
                        System.out.println("You pulled a Queen of hearts.");
                        return;
                    }
                    else if (outcome == 3){
                        System.out.println("You pulled a Queen of diamonds.");
                        return;
                    }
                    else{
                        System.out.println("You pulled a Queen of clubs.");
                        return;
                    }
                    
                }
                else if(outcome2 == 13){
                    if (outcome == 1){
                        System.out.println("You pulled a King of spades.");
                        return;
                    }
                    else if (outcome == 2){
                        System.out.println("You pulled a King of hearts.");
                        return;
                    }
                    else if (outcome == 3){
                        System.out.println("You pulled a King of diamonds.");
                        return;
                    }
                    else{
                        System.out.println("You pulled a King of clubs.");
                        return;
                    }
                    
                }
                else if(outcome2 == 1){
                    if (outcome == 1){
                        System.out.println("You pulled an Ace of spades.");
                        return;
                    }
                    else if (outcome == 2){
                        System.out.println("You pulled an Ace of hearts.");
                        return;
                    }
                    else if (outcome == 3){
                        System.out.println("You pulled an Ace of diamonds.");
                        return;
                    }
                    else{
                        System.out.println("You pulled an Ace of clubs.");
                        return;
                    }
                    
                }
                else {
                    if (outcome == 1){
                        System.out.println("You pulled a "+outcome2+" of spades.");
                        return;
                    }
                    else if (outcome == 2){
                        System.out.println("You pulled a "+outcome2+" of hearts.");
                        return;
                    }
                    else if (outcome == 3){
                        System.out.println("You pulled a "+outcome2+" of diamonds.");
                        return;
                    }
                    else{
                        System.out.println("You pulled a "+outcome2+" of clubs.");
                        return;
                    }
                    
                }
                    
            default :
                System.out.println("Please enter either an R, C, or P");
                return;
        }
    }
                
}
