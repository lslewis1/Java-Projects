/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan.lewis2
 */
import java.util.Scanner;

public class SumDigits {
    
    public static int sumDigits(long n,  Scanner input) {
        
        int sum = 0;
        while(n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
    
    public static void main(String [] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = input.nextInt();
        System.out.println("The sum of " + n + "'s digits is " + sumDigits(n, input));
        
    }
}
