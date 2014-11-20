import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
  }
  public static int showHands(){
      /*initialize array members of deck to be 0-51, and array members
      of hand to each be -1.*/
      int deck[]=new int[52];
      int hand[]=new int[5];
      int diamond[] = new int [13];
      int club[] = new int [13];
      int spade[] = new int [13];
      int heart[] = new int[13];
      String diamonds = "Diamonds: ";
      String clubs = "Clubs: ";
      String spades = "Spades: ";
      String hearts = "Hearts: ";
      for (int x=0;x<deck.length;x++){
          deck[x]= x+1;
      }
      for (int y=0;y<hand.length;y++){
        hand[y]= 0;
      }
          int d=0;
          int c=0;
          int s=0;
          int h=0;
      for (int a=0;a<hand.length;a++){
          int number = (int) (Math.random()*52);
          hand[a]= deck[number-1];
          if (number <= 13){
            if(d != 0){
              diamonds+=", ";
            }
            if(number==1){
              diamonds+="Ace";
            }
            else if(number==11){
              diamonds+="Jack";
            }
            else if(number==12){
              diamonds+="Queen";
            }
            else if (number==13){
              diamonds+="King";
            }
            else{
            diamonds+=number;
            }
            d++;
          }
          else if(number >13 && number<=26){
              if(c != 0){
              clubs+=", ";
            }
            if(number==14){
              clubs+="Ace";
            }
            else if(number==24){
              clubs+="Jack";
            }
            else if(number==25){
              clubs+="Queen";
            }
            else if (number==26){
              clubs+="King";
            }
            else{
            clubs+=number-13;
            }
            c++;
          }
          else if(number > 26 && number <=39){
             if(s != 0){
              spades+=", ";
            }
            if(number==27){
              spades+="Ace";
            }
            else if(number==37){
              spades+="Jack";
            }
            else if(number==38){
              spades+="Queen";
            }
            else if (number==3){
              spades+="King";
            }
            else{
            spades+=number-26;
            }
            s++;
          }
          else{
              if(h != 0){
              hearts+=", ";
            }
            if(number==40){
              hearts+="Ace";
            }
            else if(number==50){
              hearts+="Jack";
            }
            else if(number==51){
              hearts+="Queen";
            }
            else if (number==52){
              hearts+="King";
            }
            else{
            hearts+=number-39;
            }
            h++;
          }
      }
      
      /*simulates dealing 5 cards, and replacing the corresponding values in the deck
      with -1's*/
      
      String out = "Your hand:";
      out+= listHand(hand);
      System.out.println(out);
      System.out.println(clubs);
      System.out.println(spades);
      System.out.println(hearts);
      System.out.println(diamonds);
      return 0;
  }
    public static String listHand(int hand[]){
    String out="{";
    for(int j=0;j<hand.length;j++){
      if(j>0){
        out+=", ";
      }
      
      int n = (hand[j])%13;
      if(n==0){
        out+="Ace of ";
      }
      else if (n==11){
        out+="Jack of ";
      }
      else if (n==12){
        out+="Queen of ";
      }
      else if (n==13){
        out+="King of ";
      }
      else {
        out+=n;
        out+=" of ";
      }
      
      int suit = (hand[j])/13;
      if (suit==1){
        out+="Hearts";
      }
      else if(suit==2){
        out+="Spades";
      }
      else if(suit==3){
        out+="Clubs";
      }
      else{
        out+="Diamonds";
      }
    }
    
    out+="} ";
    return out;
  }
}

