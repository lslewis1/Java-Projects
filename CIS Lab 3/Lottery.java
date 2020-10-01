/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan.lewis2
 */
import java.util.Scanner;
import java.util.Random;

public class Lottery{

   public static void main (String [] args) {

   	Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        int LotteryNumber1 = rand.nextInt(10);
        int LotteryNumber2 = rand.nextInt(10);
        int LotteryNumber3 = rand.nextInt(10);
        
        int LotteryNumber = (LotteryNumber1 * 100) + (LotteryNumber2 * 10) + LotteryNumber3;
        
        System.out.print("Enter a three-digit lottery number of your choice: ");
        int userNumber = input.nextInt();
        
        int award = 0;
        
         if ((((userNumber / 100) == ((userNumber % 100) / 10)) || ((userNumber / 100) == (userNumber % 10)) || ((userNumber % 10) == ((userNumber % 100) / 10)) ||   // if any of the digits in the userNumber match one another
           ((userNumber / 100) == ((userNumber % 100) / 10)) && ((userNumber / 100) == ((userNumber % 10))))) {                                                      // or they all match each other
             
             if (userNumber == LotteryNumber) {
                award = 10000;
                System.out.println("The lottery number is " + LotteryNumber + ", and your number is " + userNumber + ". You won $" + award + "! Hurray!");
            }
             
             else if ((((userNumber / 100 == LotteryNumber3) || (userNumber / 100 == LotteryNumber2)|| (userNumber / 100 == LotteryNumber1))&&
                    ((((userNumber % 100) / 10) == LotteryNumber3) || (((userNumber % 100) / 10) == LotteryNumber2) || (((userNumber % 100) / 10) == LotteryNumber1))) ||
                    (((((userNumber % 10) == LotteryNumber3) || ((userNumber % 10) == LotteryNumber2) || ((userNumber % 10) == LotteryNumber1))) && 
                    ((userNumber / 100 == LotteryNumber3) || (userNumber / 100 == LotteryNumber2)|| (userNumber / 100 == LotteryNumber1))) ||
                    (((((userNumber % 10) == LotteryNumber3) || ((userNumber % 10) == LotteryNumber2) || ((userNumber % 10) == LotteryNumber1))) &&
                    ((((userNumber % 100) / 10) == LotteryNumber3) || (((userNumber % 100) / 10) == LotteryNumber2) || (((userNumber % 100) / 10) == LotteryNumber1)))&& ((userNumber / 100 != LotteryNumber3) ||
                    (userNumber / 100 != LotteryNumber2) || (userNumber / 100 != LotteryNumber2) || (((userNumber % 100) / 10) != LotteryNumber3) || (((userNumber % 100) / 10) != LotteryNumber2) ||
                    (((userNumber % 100) / 10) != LotteryNumber1) || (userNumber % 10 !=LotteryNumber3) || (userNumber % 10 !=LotteryNumber2) || (userNumber % 10 !=LotteryNumber1))) {
                award = 2000;
                System.out.println("The lottery number is " + LotteryNumber + ", and your number is " + userNumber + ". You won $" + award + "! Great!");
            }
             
            
             else if((((userNumber / 100 == LotteryNumber3) || (userNumber / 100 == LotteryNumber2)|| (userNumber / 100 == LotteryNumber1)) ||
             ((((userNumber % 100) / 10) == LotteryNumber3) || (((userNumber % 100) / 10) == LotteryNumber2) || (((userNumber % 100) / 10) == LotteryNumber1)) ||
             (((userNumber % 10) == LotteryNumber3) || ((userNumber % 10) == LotteryNumber2) || ((userNumber % 10) == LotteryNumber1)))) {  
                 award = 1000;
                 System.out.println("The lottery number is " + LotteryNumber + ", and your number is " + userNumber + ". You won $" + award + "! Fine Job!");
                 
             } 
                     
              else if (((userNumber / 100 == LotteryNumber3) || (userNumber / 100 == LotteryNumber2)|| (userNumber / 100 == LotteryNumber1))&&
                    ((((userNumber % 100) / 10) == LotteryNumber3) || (((userNumber % 100) / 10) == LotteryNumber2) || (((userNumber % 100) / 10) == LotteryNumber1)) &&
                    (((userNumber % 10) == LotteryNumber3) || ((userNumber % 10) == LotteryNumber2) || ((userNumber % 10) == LotteryNumber1)) && ((userNumber / 100 != LotteryNumber3) ||
                      (userNumber / 100 != LotteryNumber2) || (userNumber / 100 != LotteryNumber2) || (((userNumber % 100) / 10) != LotteryNumber3) || (((userNumber % 100) / 10) != LotteryNumber2) ||
                      (((userNumber % 100) / 10) != LotteryNumber1) || (userNumber % 10 !=LotteryNumber3) || (userNumber % 10 !=LotteryNumber2) || (userNumber % 10 !=LotteryNumber1))) {
                award = 3000;
                System.out.println("The lottery number is " + LotteryNumber + ", and your number is " + userNumber + ". You won $" + award + "! Excellent!");
            }
            
            
              else {
                award = 0;
                System.out.println("The lottery number is " + LotteryNumber + ", and your number is " + userNumber + ". Sorry, you won $" + award + ". Better luck next time.");
             }
             
            
                
        }
                
        
         else {
            if (userNumber == LotteryNumber) {
                award = 10000;
                System.out.println("The lottery number is " + LotteryNumber + ", and your number is " + userNumber + ". You won $" + award + "! Hurray!");
            }
            else if (((userNumber / 100 == LotteryNumber3) || (userNumber / 100 == LotteryNumber2)|| (userNumber / 100 == LotteryNumber1))&&
                    ((((userNumber % 100) / 10) == LotteryNumber3) || (((userNumber % 100) / 10) == LotteryNumber2) || (((userNumber % 100) / 10) == LotteryNumber1)) &&
                    (((userNumber % 10) == LotteryNumber3) || ((userNumber % 10) == LotteryNumber2) || ((userNumber % 10) == LotteryNumber1))) {
                award = 3000;
                System.out.println("The lottery number is " + LotteryNumber + ", and your number is " + userNumber + ". You won $" + award + "! Excellent!");
            }
        
            else if ((((userNumber / 100 == LotteryNumber3) || (userNumber / 100 == LotteryNumber2)|| (userNumber / 100 == LotteryNumber1))&&
                    ((((userNumber % 100) / 10) == LotteryNumber3) || (((userNumber % 100) / 10) == LotteryNumber2) || (((userNumber % 100) / 10) == LotteryNumber1))) ||
                    (((((userNumber % 10) == LotteryNumber3) || ((userNumber % 10) == LotteryNumber2) || ((userNumber % 10) == LotteryNumber1))) && 
                    ((userNumber / 100 == LotteryNumber3) || (userNumber / 100 == LotteryNumber2)|| (userNumber / 100 == LotteryNumber1))) ||
                    (((((userNumber % 10) == LotteryNumber3) || ((userNumber % 10) == LotteryNumber2) || ((userNumber % 10) == LotteryNumber1))) &&
                    ((((userNumber % 100) / 10) == LotteryNumber3) || (((userNumber % 100) / 10) == LotteryNumber2) || (((userNumber % 100) / 10) == LotteryNumber1)))) {
                award = 2000;
                System.out.println("The lottery number is " + LotteryNumber + ", and your number is " + userNumber + ". You won $" + award + "! Great!");
            }
        
        
            else if (((userNumber / 100 == LotteryNumber3) || (userNumber / 100 == LotteryNumber2)|| (userNumber / 100 == LotteryNumber1)) ||
                    ((((userNumber % 100) / 10) == LotteryNumber3) || (((userNumber % 100) / 10) == LotteryNumber2) || (((userNumber % 100) / 10) == LotteryNumber1)) ||
                    (((userNumber % 10) == LotteryNumber3) || ((userNumber % 10) == LotteryNumber2) || ((userNumber % 10) == LotteryNumber1))) {
                award = 1000;
                System.out.println("The lottery number is " + LotteryNumber + ", and your number is " + userNumber + ". You won $" + award + "! Fine Job!");
            }
        
        
            else {
                award = 0;
                System.out.println("The lottery number is " + LotteryNumber + ", and your number is " + userNumber + ". Sorry, you won $" + award + ". Better luck next time.");
            }
   
      
         }

  }

}

