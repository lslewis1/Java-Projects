/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan.lewis2
 */
import java.util.Scanner;
public class PhoneKeypad {
    
    public static int getNumber(char uppercaseLetter) {
        int digit = 0;
        switch (uppercaseLetter) {
            
            case 'A':
            case 'B':
            case 'C':
                digit = 2;
                break;
            
            case 'D':
            case 'E':
            case 'F':
                digit = 3;
                break;
                
            case 'G':
            case 'H':
            case 'I':
                digit = 4;
                break;
                
            case 'J':
            case 'K':
            case 'L':
                digit = 5;
                break;
            
            case 'M':
            case 'N':
            case 'O':
                digit = 6;
                break;
            
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                digit = 7;
                break;
                
            case 'T':
            case 'U':
            case 'V':
                digit = 8;
                break;
                
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                digit = 9;
                break;
        }
        return digit;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a phone number as a string with some letters: ");
        String userNumber = input.next();
        
        String sNumber = "0";
        char sChar = '0';
        
        
        for (int i=0; i< userNumber.length(); i++) {
            if (Character.isLetter(userNumber.charAt(i))) {
                sNumber = String.valueOf(getNumber(userNumber.charAt(i)));
                sChar = sNumber.charAt(0);
                userNumber = userNumber.replace((userNumber.charAt(i)),sChar);
            }
        }
        
        System.out.println(userNumber);
        
    }
}
