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

public class IsNumberPrime {
    public static boolean isPrime(int n, Scanner input) {
        boolean isPrime = true;
        
        for (int divisor = 2; divisor <= (n / 2); divisor ++) {
            if (n % divisor == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.print("Enter a number to see if it is prime or not: ");
        number = input.nextInt();
        System.out.println("Is " + number + " prime? " + isPrime(number, input));
    }
}
