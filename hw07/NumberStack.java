//Matt Gavin

import java.util.Scanner;
public class NumberStack{
    public static void main (String[] args) {
        System.out.print("Enter a number between 1 and 9");
        Scanner scan = new Scanner (System.in);
        while (!scan.hasNextInt()){                                             //checks for integer
            System.out.println("Enter a number between and 1 and 9");
            scan = new Scanner (System.in);
        }
        int i = scan.nextInt();                                                 //introduce variable for user input
        for (int j = 1; j < i+1; j++){                                          //for loop
            for(int rows = 0; rows<j; rows++){
                for(int columns = 0; columns < (j+(j-1)); columns++){
                    System.out.print(j);                                        //print out incrementing number
                }
                System.out.println();
            }
        System.out.println("-");
        }
        System.out.println("Using while loops");
        int j =1;
        int rows = 0;
        int columns = 0;
        while(j < i +1){
            rows = 0;
            while(rows<j){
                columns = 0;
                while(columns<(j+(j-1))){
                    System.out.print(j);
                    columns++;
                }
            System.out.println();
            rows++;
            }
        System.out.println("-");
        j++;
        }
        
        System.out.println("Using while do-loops");
        j =1;
        rows = 0;
        columns = 0;
        do{
            rows = 0;
            do{
                columns = 0;
                do{
                    System.out.print(j);
                    columns++;
                }while(columns<(j+(j-1)));
            System.out.println();
            rows++;
            }while(rows<j);
        System.out.println("-");
        j++;    
        }while(j < i +1);
    }
}
    
        