//Matt Gavin
//10/14/14
//Roulette

public class Roulette{
    public static void main (String [] args){
        int nround = 1;                                         //initialize variable for round number
        int loseall = 0;                                        //initialize variable for amount of rounds you don't win at all
        int roundwins = 0;                                      //initialize variable for amount of rounds you win at least 3 times
        int tcashflow = 0;                                      //initialize variable for amount of money earned total
        int rcashflow = 0;                                      //initialize variable for amount of money earned for each round
        
        while (nround<=1000){                                   //while loop for round number from 1-1000
            nround++;                                           //increment round number after each trial
            int bet = 1;                                        //resets initial bet to 1 after each trial
            int number = (int) (Math.random()*38);              //resets number choice to random int between 1 and 38 after each trial
            rcashflow = 0;                                      //resets cash flow per round to 0 after each trial
           
            while (bet<=100){                                   //while loop for bets (spin) from 1-100
                int roll = (int) (Math.random()*38);            //reset roll outcome to random int between 1 and 38 after each spin
                bet++;                                          //increment bet after each spin
                
                if (roll == number){                            //if you guessed right...
                    rcashflow+=36;                              //increase the rounds cashflow by 36
                    tcashflow+=36;                              //increase total cashflow by 36
                }
            }
            if (rcashflow > 100){                               //if you win more than 100 in a round...
                roundwins ++;                                   //increment number of rounds walking away with profit
            }
            else if (rcashflow == 0){                           //if the rounds cashflow equals 0 (you won 0 times)...
                loseall ++;                                     //increment number of rounds you lost everything
            }
        }
        System.out.println("You lost everything "+loseall+ " times :(" );                   
        System.out.println("You won a total of $"+ tcashflow +" over the span of 1000 rounds!");
        System.out.println("You made at least $100 on "+roundwins+ " rounds!");
        
    }
}