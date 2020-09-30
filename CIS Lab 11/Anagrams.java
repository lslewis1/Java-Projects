/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan.lewis2
 */
import java.util.Scanner;
public class Anagrams {
    
    public static String removeDelimeters(String userString) {      // removes delimeters and makes the string lower case.
        String filteredString = "";
        for (int i=0;i<userString.length();i++)
        {
            if (Character.isLetter(userString.charAt(i)))
                filteredString += userString.charAt(i);
        }
        userString = filteredString.toLowerCase();
        return userString;
    }
    public static boolean isAnagram(String s1, String s2) {     // remove delimeters, all lower case, create boolean array.

        boolean [] WordArray = new boolean[s1.length()];
        int trueCount = 0;
        
        for(int i = 0; i < WordArray.length; i++) {
            WordArray[i] = false;
        }
        
        for (int i = 0; i < s1.length(); i++) {
            if (s1.length() != s2.length()) {
                break;
            }
            
            for(int j = 0; j < s2.length(); j++) {      
                if(s1.charAt(i) == s2.charAt(j)) {
                    WordArray[i] = true;
                    trueCount++;
                    s2.replace((s2.charAt(j)), ' ');
                    break;
                }
            }
            if(trueCount == WordArray.length) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {            // try "William Shakespeare" and "I am a weakish speller."
        Scanner input = new Scanner(System.in);         // also try "Anagram" and "Nag a ram."
        
        System.out.println("Enter the first string: ");
        String userString1 = input.nextLine();
        userString1 = removeDelimeters(userString1);
        System.out.println("Enter the second string: ");
        String userString2 = input.nextLine();
        userString2 = removeDelimeters(userString2);
        
        if (isAnagram(userString1, userString2)) {
            System.out.println();
            System.out.println("The two strings are anagrams.");
        }
        
        else {
            System.out.println();
            System.out.println("The two strings are not anagrams.");
        }
    }
}
