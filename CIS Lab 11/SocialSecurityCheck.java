/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan.lewis2
 */
import java.util.Scanner;
public class SocialSecurityCheck {
    
    public static boolean isSocialSecurityFormat(String sNumber) {
        int numCount = 0;                               // the count of numbers in the string (should total to 9).
        for (int i=0; i <= sNumber.length(); i++) {
            if (sNumber.length() != 11) {
                break;
            }
            for (int j=0; j < sNumber.length(); j++) {
                if (Character.isDigit(sNumber.charAt(j))) {
                    numCount++;
                }
            }
            if (numCount != 9) {
                break;
            }
            if(sNumber.charAt(3) != '-' || sNumber.charAt(6) != '-') {
                break;
            }
            else {
                return true;
            }
        }
        return false;
    }
    
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number to see if it would fit as a valid social security number (include the dashes): ");
        String userNumber = input.next();
        
        if(isSocialSecurityFormat(userNumber)) {
            System.out.println(userNumber + " is a valid social security number format.");
        }
        else {
            System.out.println(userNumber + " is not in a valid format to be a social security number.");
        }
    }
}
