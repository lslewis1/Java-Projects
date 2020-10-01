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

public class TransactionCalculatorST2 {

public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    double userNum = 0.0;
    System.out.print("Enter the first number to be categorized: ");
    userNum = input.nextDouble();
    
      
    int Ecount = 0;
    int Gcount = 0;
    int Acount = 0;
    int Bcount = 0;
    int Pcount = 0;
    
     if (userNum >= 90) {
            Ecount += 1;
        }
        else if (userNum >= 80) {
            Gcount += 1;
        }
        else if (userNum >= 70) {
            Acount += 1;
        }
        else if (userNum >= 60) {
            Bcount += 1;
        }
        else {
            Pcount += 1;
        }
  
    
    
    while(userNum != 0.0) {
        System.out.print("Enter the next number to be categorized, or enter a zero to end the counting process: ");;
        userNum = input.nextDouble();
        if (userNum >= 90) {
            Ecount += 1;
        }
        else if (userNum >= 80) {
            Gcount += 1;
        }
        else if (userNum >= 70) {
            Acount += 1;
        }
        else if (userNum >= 60) {
            Bcount += 1;
        }
        else {
            Pcount += 1;
        }
        
        
    }
    System.out.println("Excellent: " + Ecount + "\nGood: " + Gcount + "\nAverage: " + Acount + "\nBelow Average: " + Bcount + "\nPoor: " + Pcount);
    
    
    
    
    
    
    
    
    
    
    
    
    

    }

}
