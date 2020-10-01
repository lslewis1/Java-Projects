/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan.lewis2
 */
import java.util.Scanner;

public class TransactionCalculatorST1 {

public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    double userNum = 0.0;
    System.out.print("Enter the first number to be added: ");
    userNum = input.nextDouble();
    double uSum = userNum;
    
    while(userNum != 0.0) {
        System.out.print("Enter the next number to be added, or enter a zero to end the addition process: ");
        userNum = input.nextDouble();
        uSum = uSum + userNum;
        
        
    }
    System.out.println("The sum of the entered numbers is: " + uSum);
    
    
    
    
    
    
    
    
    
    
    
    
    

    }

}
