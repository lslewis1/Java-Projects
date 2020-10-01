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

public class PiCalculator{

   public static void main (String [] args) {
       
       Scanner input = new Scanner(System.in);

       String Method = "A";
       int N = 0;
       
       System.out.print("Enter the method of your choice: you can enter A - E, upper or lower case, or a 'Q' to end the program: ");
       Method = input.next();

       while (!Method.equalsIgnoreCase("Q")) {

            System.out.print("Enter the number of terms to use in the Pi calculation: ");
            N = input.nextInt();

            double PiValue = 0.0;
            int i = 0;
            int iSign = 1;
            int iNum = 1;
            int iDenom = 1;

            switch (Method) {
                case "A": 
                case "a":
                    for(i = 1; i <= N; i++) {
                         PiValue += 4 * (iSign *(1.0 / iDenom));
                         iSign *= -1;
                         iDenom += 2;
                    }
                    System.out.printf("The value of Pi, using method " + Method+ ", and " + N + " terms is: %5.12f\n", + PiValue);
                    break;

                case "B":
                case "b":
                    System.out.println("The value of Pi is : 3.1415927");
                    break;

                case "C":
                case "c":
                    int Power = 0;
                    for (i = 1; i <= N; i++) {
                        PiValue += ((iSign) * (1 / ((iDenom) * (Math.pow(3, Power)))));
                        iSign *= -1;
                        iDenom += 2;
                        Power++;
                    }
                    PiValue = (PiValue * (2 * Math.sqrt(3)));
                    System.out.printf("The value of Pi, using method " + Method+ ", and " + N + " terms is: %5.12f\n", + PiValue);

                    break;

                case "D":
                case "d":
                    System.out.println("The value of Pi is : 3.1415927");
                    break;

                case "E":
                case "e":
                    for(i = 1; i <= N; i++) {
                         PiValue += (1.0 / (iDenom * iDenom));
                         iDenom++;
                    }
                    PiValue = Math.sqrt(6 * PiValue);
                    System.out.printf("The value of Pi, using method " + Method+ ", and " + N + " terms is: %5.12f\n", + PiValue);
                    break;

                default:
                    System.out.println("Incorrect Method choice.");
                    break;

        }

        System.out.print("Enter the method of your choice: you can enter A - E, upper or lower case, or a 'Q' to end the program: ");
        Method = input.next();
        }
       
    }
}
