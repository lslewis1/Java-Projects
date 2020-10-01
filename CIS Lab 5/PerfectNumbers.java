/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan.lewis2
 */
public class PerfectNumbers{

   public static void main (String [] args) {
       
       int i = 0;
       int sum = 0;
       int div = 1;

        for(i = 6; i <= 10000; i++) {
            sum = 0;
            for(div = 1; div <= (i / 2); div++) {
                if (i % div == 0) {
                    sum += div;
                }
            }
            if (sum == i) {
                System.out.println(i + " is a perfect number.");
            }
        }
          
    }
}
