/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Logan
 */
import java.util.Scanner;

public class ComputingTaxes{

   public static void main (String [] args) {

   	Scanner input = new Scanner(System.in);
        
        int status = 0;
        System.out.print("Enter a '0' for single filers, a '1' for married filing jointly or qualified widow(er), a '2' for married filing seperately, or a '3' for head of household:  ");
        status = input.nextInt();
        
        System.out.println("");
        
        double TaxIncome = 0.0;
        System.out.print("Enter the taxable income amount: ");
        TaxIncome = input.nextInt();
        
        double TotalTax = 0.0;
        
        
        if (status == 0) {
            if(TaxIncome > 0 && TaxIncome <= 8350 ) {
                    TotalTax = TaxIncome * .10;
            }
            if(TaxIncome >= 8351 && TaxIncome <= 33950) {
                    TotalTax = (8350 * .10) + ((TaxIncome - 8350) * .15);
            }
            if(TaxIncome >= 33951 && TaxIncome <= 82250) {
                    TotalTax = (8350 * .10) + (33950 * .15) + ((TaxIncome - 33950) * .25);
            }
            if(TaxIncome >= 82251 && TaxIncome <= 171550) {
                    TotalTax = (8350 * .10) + (33950 * .15) + (82250 * .25) + ((TaxIncome - 82250) * .28);
            }
            if(TaxIncome >= 171551 && TaxIncome <= 372950) {
                    TotalTax = (8350 * .10) + (33950 * .15) + (82250 * .25) + (171550 * .28) + ((TaxIncome - 171550) * .33);
            }
            if(TaxIncome >= 372951) {
                    TotalTax = (8350 * .10) + (33950 * .15) + (82250 * .25) + (171550 * .28) + (372950 * .33) + ((TaxIncome - 372950) * .35);
            }
            
        }
        
        else if (status == 1) {
            if(TaxIncome > 0 && TaxIncome <= 16700 ) {
                    TotalTax = TaxIncome * .10;
            }
            if(TaxIncome >= 16701 && TaxIncome <= 67900) {
                    TotalTax = (16700 * .10) + ((TaxIncome - 16700) * .15);
            }
            if(TaxIncome >= 67901 && TaxIncome <= 137050) {
                    TotalTax = (16700 * .10) + (67900 * .15) + ((TaxIncome - 67900) * .25);
            }
            if(TaxIncome >= 137051 && TaxIncome <= 208850) {
                    TotalTax = (16700 * .10) + (67900 * .15) + (137050 * .25) + ((TaxIncome - 137050) * .28);
            }
            if(TaxIncome >= 208851 && TaxIncome <= 372950) {
                    TotalTax = (16700 * .10) + (67900 * .15) + (137050 * .25) + (208850 * .28) + ((TaxIncome - 208850) * .33);
            }
            if(TaxIncome >= 372951) {
                    TotalTax = (16700 * .10) + (67900 * .15) + (137050 * .25) + (208850 * .28) + (372950 * .33) + ((TaxIncome - 372950) * .35);
            }
            
        }
        
        else if (status == 2) {
            if(TaxIncome > 0 && TaxIncome <= 8350 ) {
                    TotalTax = TaxIncome * .10;
            }
            if(TaxIncome >= 8351 && TaxIncome <= 33950) {
                    TotalTax = (8350 * .10) + ((TaxIncome - 8350) * .15);
            }
            if(TaxIncome >= 33951 && TaxIncome <= 68525) {
                    TotalTax = (8350 * .10) + (33950 * .15) + ((TaxIncome - 33950) * .25);
            }
            if(TaxIncome >= 68526 && TaxIncome <= 104425) {
                    TotalTax = (8350 * .10) + (33950 * .15) + (68525 * .25) + ((TaxIncome - 68525) * .28);
            }
            if(TaxIncome >= 104426 && TaxIncome <= 186475) {
                    TotalTax = (8350 * .10) + (33950 * .15) + (68525 * .25) + (104425 * .28) + ((TaxIncome - 104425) * .33);
            }
            if(TaxIncome >= 186476) {
                    TotalTax = (8350 * .10) + (33950 * .15) + (68525 * .25) + (104425 * .28) + (186475 * .33) + ((TaxIncome - 186475) * .35);
            }
            
        }
        
        else if (status == 3) {
            if(TaxIncome > 0 && TaxIncome <= 11950 ) {
                    TotalTax = TaxIncome * .10;
            }
            if(TaxIncome >= 11951 && TaxIncome <= 45500) {
                    TotalTax = (11950 * .10) + ((TaxIncome - 11950) * .15);
            }
            if(TaxIncome >= 45501 && TaxIncome <= 117450) {
                    TotalTax = (11950 * .10) + (45500 * .15) + ((TaxIncome - 45500) * .25);
            }
            if(TaxIncome >= 117451 && TaxIncome <= 190200) {
                    TotalTax = (11950 * .10) + (45500 * .15) + (117450 * .25) + ((TaxIncome - 117450) * .28);
            }
            if(TaxIncome >= 190201 && TaxIncome <= 372950) {
                    TotalTax = (11950 * .10) + (45500 * .15) + (117450 * .25) + (190200 * .28) + ((TaxIncome - 190200) * .33);
            }
            if(TaxIncome >= 372951) {
                    TotalTax = (11950 * .10) + (45500 * .15) + (117450 * .25) + (190200 * .28) + (372950 * .33) + ((TaxIncome - 372950) * .35);
            }
            
        }
        
        else {
            System.out.println("Wrong status");
        }
        
        
        System.out.println("The total tax is: " + TotalTax);
       
   }
}

   

