/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan.lewis2
 */

/* String Array spam words, in a text file (spamWords.txt)
 * Program scans each word and increases the "spam score" for the email message based on the number of spam words found.
 * Likelihood that message is spam is rated (less than or equal to 3 is low, less than  or equal to 10 is medium, greater than 10 is high).
 * Use input.nextLine(), also input.hasNextLine() to see if there is another line of string.
 * Research online for common spam words, create a list of 30 common words or phrases (spamWords.txt) saved in project folder.
 *  - Each word or phrase should be on a single line.
 * Message(number).txt will be the email messages to be scanned (6 in all, 2 lows, 2 mediums, and 2 highs).
 * Submit the program, the list of spamWords, and the 6 message files. 
 * This program will utilize the command line argument style to run.
 * Message(1).txt and Message(2).txt are considered low chance of being spam, the next two are medium, and the final two are high.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SpamScanner {   
    
    public static void main(String[] args) throws IOException {
        FileInputStream SpamFile = null;      // File input stream
        FileInputStream MessageFile = null;
        Scanner SpamList = null;                   // Scanner object for the spam words list
        Scanner MessageReader = null;
        ArrayList<String> spamWords = new ArrayList<String>();
        ArrayList<String> messageWords = new ArrayList<String>();
        
        int spamScore = 0;
        
        
        if (args.length != 2) {
         System.out.println("Usage: java SpamScanner spamList emailMessage");
         return;
        }
        
        System.out.println("Opening file " + args[0] + ".");

        SpamFile = new FileInputStream(args[0]);
        SpamList = new Scanner(SpamFile);
        
        while (SpamList.hasNextLine()) {
            spamWords.add(new String(SpamList.nextLine()));
        }

        System.out.println("A list of common spam words and phrases has been added to an array.");
        
        System.out.println("Closing file " + args[0] + ".");
        SpamFile.close();
        
        System.out.println();
        
        System.out.println("Scanning e-mail message " + args[1] + "...");

        MessageFile = new FileInputStream(args[1]);
        MessageReader = new Scanner(MessageFile);
        
        while (MessageReader.hasNext()) {
            messageWords.add(new String(MessageReader.next()));
        }
        
        MessageFile.close();
        
        for (int i = 0; i < spamWords.size(); i++) {
            for(int j = 0; j < messageWords.size(); j++) {
                if (messageWords.get(j).equals(spamWords.get(i))) {
                    spamScore++;
                }
            }
        }
        
        if (spamScore <= 3) {
            System.out.println("* " + args[1] + " has a low chance of being spam.");
        }
        else if (spamScore <= 10) {
            System.out.println("* " + args[1] + " has a medium chance of being spam.");
        }
        else {
            System.out.println("* " + args[1] + " has a high chance of being spam.");
        }
    }
}
