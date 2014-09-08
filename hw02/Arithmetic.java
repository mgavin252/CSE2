//Matt Gavin
//9.6.14

public class Arithmetic {
    
    public static void main(String[] args) {
        
        //variable declaration
        int nSocks;
        double sockCost;
        int nGlasses;
        double GlassesCost;
        int nEnvelopes;
        double EnvelopeCost;
        double taxPercent;
        
        //variable assignments
        nSocks=3;
        sockCost=2.58;
        nGlasses=6;
        GlassesCost=2.29;
        nEnvelopes=1;
        EnvelopeCost=3.25;
        taxPercent=.06;
        
            //convert sock cost into decimal with only 2 decimal places
            double a = nSocks*sockCost*100; //cost of socks times 100 without tax
            double b = (a*(1+taxPercent)); //cost of socks times 100 with tax
                int bb = (int)b; //convert b to integer
                double bbb= (double)bb; //convert back to floating
            double c = a*taxPercent; 
                int cc = (int)c;
                double ccc = (double)cc;
            
        //print info for socks
        System.out.println("SOCKS");
        System.out.println("Cost of Socks with out tax is: " + a/100 ); //print cost of socks divided by 100 to offset the times 100 in variable declaration
        System.out.println("Cost of Socks with tax is: " + bbb/100 ); 
        System.out.println("Cost of sales tax for Socks is: " + ccc/100 );
        
            //convert glasses cost into decimal with only 2 decimal places
            double d = nGlasses*GlassesCost*100; //cost of glass times 100 without tax
            double e = (d*(1+taxPercent)); //cost of glass times 100 with tax
                int ee = (int)e; //convert e to integer
                double eee= (double)ee; //convert back to floating
            double f = d*taxPercent; 
                int ff = (int)f;
                double fff = (double)ff;
        
        //print info for glasses
        System.out.println(" "); //break
        System.out.println("GLASSES");    
        System.out.println("Cost of Glasses with out tax is: " + d/100 );
        System.out.println("Cost of Glasses with tax is: " + eee/100 );
        System.out.println("Cost of sales tax for Glasses is: " + fff/100 );
        
            //convert envelopes cost into decimal with only 2 decimal places
            double g = nSocks*sockCost*100; //cost of envelopes times 100 without tax
            double h = (g*(1+taxPercent)); //cost of envelopes times 100 with tax
                int hh = (int)h; //convert h to integer
                double hhh= (double)hh; //convert back to floating
            double i = g*taxPercent; 
                int ii = (int)i;
                double iii = (double)ii;
        
        //print info for envelopes    
        System.out.println(" "); //break
        System.out.println("ENVELOPES");   
        System.out.println("Cost of Envelopes with out tax is: " + g/100 );
        System.out.println("Cost of Envelopes with tax is: " + hhh/100 );
        System.out.println("Cost of sales tax for Envelopes is: " + iii/100 );
        
    }
}