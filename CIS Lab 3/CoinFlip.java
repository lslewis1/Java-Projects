import java.util.Scanner;
import java.util.Random;
public class CoinFlip
{
	public static void main(String[] args)
	{
		// This program simulates a coin flip.
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int coinFlips = 0;
		int Heads = 0;
		int Tails = 0;
		int i = 0;

		System.out.print("How many times would you like the coin to flip? : ");

		coinFlips = input.nextInt();
		int hCount = 0;
	    int tCount = 0;
	    double hPercentage = 0.0;
	    double tPercentage = 0.0;

		for (i = 0; i < coinFlips; ++i) {

			int coinSide = rand.nextInt(2);

			if (coinSide == 0) {
				++hCount;
	    	}
	    	else {
				++tCount;
	    	}
		}

		hPercentage = ((double)hCount / (double)coinFlips) * 100;
		tPercentage = ((double)tCount / (double)coinFlips) * 100;

		double dError = Math.abs(.5 - (hPercentage / 100));

		System.out.println("");
	    System.out.print("Heads: " + hCount + " times");
	    System.out.println(" (" + hPercentage + "%)");
	    System.out.println("");
	    System.out.print("Tails: " + tCount + " times");
	    System.out.println(" (" + tPercentage + "%)");
	    System.out.println("");

	    if (dError < .03) {
			System.out.println("The result is within the expectation.");
	    }
	    else if (dError <= .05) {
			System.out.println("The result is slightly outside the expectation.");
	    }
	    else if (dError <= .07) {
			System.out.println("The result is somewhat outside the expectation.");
		}
		else {
			System.out.println("The result is completely outside the expectation.");
		}

		System.out.println("");

		return;


	}
}