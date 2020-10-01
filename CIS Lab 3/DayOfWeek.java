/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan.lewis2
 */
import java.util.Scanner;

public class DayOfWeek{

   public static void main (String [] args) {

   	Scanner input = new Scanner(System.in);
        
        int year = 0;
        int m = 0;
        int q = 0;
        
        System.out.print("Enter the four-digit year: ");
        year = input.nextInt();
        
        System.out.print("Enter the number of the month (1-12): ");
        m = input.nextInt();
        
        if (m > 0 && m < 3) {
            m = m + 12;
            year = year - 1;
        }
        
        int j = year / 100;
        int k = year % 100;
      
        System.out.print("Enter the day of the month (1-31): ");
        q = input.nextInt();
        
        int h = (q + ((26 * (m + 1))/10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        
       
        switch (h) {
            case 0:
                System.out.println("The day of the week is Saturday.");
                break;
            case 1:
                System.out.println("The day of the week is Sunday.");
                break;
            case 2:
                System.out.println("The day of the week is Monday.");
                break;
            case 3:
                System.out.println("The day of the week is Tuesday.");
                break;
            case 4:
                System.out.println("The day of the week is Wednesday.");
                break;
            case 5:
                System.out.println("The day of the week is Thursday.");
                break;
            case 6:
                System.out.println("The day of the week is Friday.");
                break;
        }
   }
}
