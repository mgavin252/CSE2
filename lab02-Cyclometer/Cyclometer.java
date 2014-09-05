//Matt Gavin
//9/5/14

public class Cyclometer{
    public static void main(String[] args) {
        int secsTrip1=480; //seconds for first trip
        int secsTrip2=3220; //seconds for first trip
        int countsTrip1=1561; // rotations for first trip
        int countsTrip2=9037; //rotations for second trip
        
        //useful constants/conversions
        
        double wheelDiameter=27.0; //Diameter of wheel
        double PI=3.14159;
        double feetPerMile=5280;
        double inchesPerFoot=12;
        double secondsPerMinute=60;
        double distanceTrip1; //total distance for trip 1
        double distanceTrip2; //total distance for trip 2
        double totalDistance; //total distance of trip 1 and 2
        
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
        
        distanceTrip1=countsTrip1*wheelDiameter*PI;

        distanceTrip1/=inchesPerFoot*feetPerMile; 
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; 
        totalDistance=distanceTrip1+distanceTrip2;


        System.out.println("Trip 1 was "+distanceTrip1+" miles"); 
        System.out.println("Trip 2 was "+distanceTrip2+" miles"); 
        System.out.println("The total distance was "+totalDistance+" miles");
        
    } 
    
}