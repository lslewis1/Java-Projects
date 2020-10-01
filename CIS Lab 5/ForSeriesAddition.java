/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan.lewis2
 */

public class ForSeriesAddition{

   public static void main (String [] args) {

        
        int iNum = 1;
        int i = 1;
        int iDenom = 1;
        int iSign = 1;
        double sum = 0.0;
        
        for(i = 1; i <= 10; i++) {
            sum += (iSign * ((double)iNum / (iDenom * iDenom)));
            System.out.print(iSign + "[" + iNum + "/(" + iDenom + "*" + iDenom + ")] + ");
            iNum += 2;
            iDenom +=3;
            iSign *= -1;

        }
        
        System.out.printf("= %5.5f\n", + sum);
    }
}

