//public class CompoundInterest {
   // public staticvoid main(String[] arg)
    // long principalamount = 1000;
     //double rateofinterest = 5.0;
     //int timeinyears = 2;
     //double interest = principalamount * (1+ rateofinterest/100,timeinyears);
     //System.out.println("The compound interest is:" + interest);

//}

public class CompoundInterest {
    public static void main(String[] args) {
        long principalAmount = 1000; // Principal amount
        double rateOfInterest = 5.0; // Rate of interest (in %)
        int timeInYears = 2; // Time in years
        double interest = principalAmount * Math.pow( 1+ rateOfInterest/100,timeInYears);

        // Print the compound interest
        System.out.println("The compound interest is: " + interest);
    }
}
