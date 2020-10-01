/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan.lewis2
 */
import java.util.Scanner;

public class CreditCardValidation {
    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        String TestCardNum = "yes";
        while(TestCardNum.equalsIgnoreCase("yes")) {
           
            long CardNum = getCardNumber(input);
            System.out.print("Is the ");
            cardType(CardNum);
            System.out.print(" with number " + CardNum + " valid? " + isValid(CardNum) + ".");
            System.out.println();
            System.out.print("Type 'yes' if you would like to test another number, or 'no' if not: ");
            TestCardNum = input.next();
        }
        
        /*
        System.out.println(getNumberOfDigits(1234));
        System.out.println(getNumberOfDigits(123456789));
        System.out.println(getNumberOfDigits(123456789012l));
        System.out.println(getNumberOfDigits(1234567890123456l));
        System.out.println(getNumberOfDigits(123456789012345678l));
        
        System.out.println(getDigit(123456789, 7));
        System.out.println(getDigit(123456789, 5));
        System.out.println(getDigit(123456789, 4));
        System.out.println(getDigit(123456789, 8));
      
        System.out.println(isSumDivisibleByTen(3));
        System.out.println(isSumDivisibleByTen(5));
        System.out.println(isSumDivisibleByTen(30));
        System.out.println(isSumDivisibleByTen(45));
        System.out.println(isSumDivisibleByTen(20));
        
        System.out.println(getDoubleTheDigit(4));
        System.out.println(getDoubleTheDigit(5));
        System.out.println(getDoubleTheDigit(8));
        System.out.println(getDoubleTheDigit(2));
        System.out.println(getDoubleTheDigit(9));
        
        System.out.println(sumOfOddPlaces(123456789l));
        System.out.println(sumOfOddPlaces(1234567891l));
        
        System.out.println(sumOfEvenPlaces(123456789l));
        System.out.println(sumOfEvenPlaces(1234567891l));
        
        System.out.println(isValid(4388576018402625l));
        System.out.println(isValid(4388576018410707l));
        */
                
    }
    
    public static int getNumberOfDigits(long lNumber) {
        int count = 0;
        while (lNumber != 0) {
            lNumber /= 10;
            count++;
        }
        
        return count;
    }
    
    public static long getDigit(long lNumber, int ithPlace) {
        long Digit = (long) (lNumber / (Math.pow(10,(ithPlace - 1))));
        Digit = Digit % 10;

        return Digit;        
    }
    
    public static boolean isSumDivisibleByTen(int iSum) {
        if (iSum % 10 == 0){
            return true;
        }
        else {
            return false;
        }
        
    }
    
    public static int getDoubleTheDigit(long lNumber) {
        int Digit = 0;
        int DoubleDigit = 0;
        for (int i = 1; i <= getNumberOfDigits(lNumber); i++) {
            Digit = (int)getDigit(lNumber, i);
            if ((Digit * 2) > 9) {
                DoubleDigit = Digit * 2;
                DoubleDigit = (DoubleDigit / 10) + (DoubleDigit % 10);
                break;
            }
            else {
                DoubleDigit = Digit * 2;
                break;
            }
        }
        return DoubleDigit;
    }
    
    public static int sumOfOddPlaces(long lNumber) {
        int Osum = 0;
        for (int iDigit = 1; iDigit <= getNumberOfDigits(lNumber); iDigit += 2){
            Osum += (getDigit(lNumber, iDigit));
            
        }
        return Osum;
    }
    
    public static int sumOfEvenPlaces(long lNumber) {
        int Esum = 0;
        int DoubleEDigit = 0;
        for (int iDigit = 2; iDigit <= getNumberOfDigits(lNumber); iDigit += 2){
            DoubleEDigit = getDoubleTheDigit(getDigit(lNumber, iDigit));
            Esum += DoubleEDigit;
        }
        return Esum;
    }
    
    public static boolean isValid(long lNumber) {
        int TotalSum = sumOfEvenPlaces(lNumber)+ sumOfOddPlaces(lNumber);
        boolean isValid = isSumDivisibleByTen(TotalSum);
        
        return isValid;
    }
    
    public static long getCardNumber(Scanner input) {
        System.out.print("Enter the card number: ");
        Long CardNumber = input.nextLong();
        
        return CardNumber;
    }
    
    public static void cardType(long lNumber) {
        if(getNumberOfDigits(lNumber) == 16) {
            if(getDigit(lNumber, 16) == 4) {
                System.out.print("Visa Card");
            }
            else if(getDigit(lNumber, 16) == 5) {
                System.out.print("Master Card");
            }
            else if (getDigit(lNumber,16) == 6) {
                System.out.print("Discover Card");
            }
            else {
                System.out.print("Unknown");
            }
        }
        else if (getNumberOfDigits(lNumber) == 13) {
            if(getDigit(lNumber, 13) == 3 && getDigit(lNumber, 12) == 7) {
                System.out.print("American Express Card");
            }
            else {
                System.out.print("Unknown");
            }
        }
    }
    
}
