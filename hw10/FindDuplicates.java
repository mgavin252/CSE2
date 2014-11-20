import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{                                                                         //enter 10 integers, and store each value in array
      System.out.print("Enter 10 ints- ");                                      
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num);                                      //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  /*
  Method takes array given by num[] and checks each of the array members to see if any equal each other.
  If they do, returns true. If not, returns false.
  */
  public static boolean hasDups(int num[]){                                     
      boolean dups = false;
      for(int x=0;x<num.length;x++){
          for(int y=x+1;y<num.length;y++){
              if (num[x]==num[y]){
                  dups = true;
              }
              else{
              }
          }
      }
      return dups;
  }
  /*
  Method takes array and initializes dup count at 0. For every array member that
  also equals another member, count is incrememnted. If count = 1, returns true.
  If it equals anything but 1, returns false.*/
  public static boolean exactlyOneDup(int num[]){
      boolean onedup = false;
      int count=0;
      for (int x=0;x<num.length;x++){
          for(int y=x+1;y<num.length;y++){
              if (num[x]==num[y]){
                  count++;
              }
              else{
              }
            }
        }
          if(count==1){
              onedup=true;
          }
          else{
              onedup=false;
          }
          return onedup;
      }
  }


