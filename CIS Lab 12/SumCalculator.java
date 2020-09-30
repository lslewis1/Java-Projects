/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan.lewis2
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SumCalculator {
   public static void main(String[] args) throws IOException {      // myfile1.txt and myfile2.txt contain numbers to be added.
      //FileInputStream fileByteStream = null; // File input stream
      ArrayList<Integer> numberList = new ArrayList<>();

      // Check number of arguments 
      if (args.length != 1) {
         System.out.println("Usage: SumCalculator inputFileName");
         return;
      }

      // Try to open the file
      System.out.println("Opening file " + args[0] + ".");

      FileInputStream fileByteStream = new FileInputStream(args[0]);
      Scanner inFS = new Scanner(fileByteStream);

      // File is open and valid if we got this far
      // ***Scanner.hasNext() - true if there is another number
       
      while (inFS.hasNext()) {
               numberList.add(new Integer(inFS.nextInt()));
        } 

      // Done with file, so try to close it
      System.out.println("Closing file " + args[0] + "\n");
      fileByteStream.close(); // close() may throw IOException if fails

      // Output values read from file, add, and display result.
      int sum = 0;
      for (int i = 0; i < numberList.size() - 1; i++) {
          System.out.print(numberList.get(i) + " + ");
          sum += numberList.get(i);
          
      }
      sum = sum + numberList.get(numberList.size() - 1);
      System.out.print(numberList.get(numberList.size() - 1) + " = " + sum);
      System.out.println();

   }
}