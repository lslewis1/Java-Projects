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

public class IsPrimeMethod {
    
    public static int NumPrimes() {
        Scanner input = new Scanner(System.in);
        
        int count = 0;
        int number = 2;
        boolean isPrime = true;
        
        while (number < 10000) {
            isPrime = true;
            for (int divisor = 2; divisor <= (number / 2); divisor ++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count += 1;
            }
            number += 1;
        }
        return count;
    }
    
    public static void main(String [] args) {
        System.out.print("There are " + NumPrimes() + " Prime numbers less than 10000.");
        
    }
    
    
}
