/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan.lewis2
 */
public class FeetMeterConversion {
    
    public static double footToMeter(double foot) {
        double meter = .305 * foot;
        return meter;
    }
    
    public static double meterToFoot(double meter) {
        double foot = 3.279 * meter;
        return foot;
    }  
    
    public static void main(String [] args) {
        
        System.out.println("Feet\tMeters\t | \tMeters\t\tFeet");
        System.out.println("---------------------------------------------------------");
        
        double feet = 1;
        double meter = 20;
        
        while ((feet <= 10.0) && (meter <= 65)) {
            System.out.printf(feet + "\t" );
            System.out.printf("%5.3f", + footToMeter(feet));
            System.out.printf("\t |\t" + meter + "\t\t");
            System.out.printf("%5.3f", + meterToFoot(meter));
            System.out.println();
            feet++;
            meter += 5;
        }
    }
}

