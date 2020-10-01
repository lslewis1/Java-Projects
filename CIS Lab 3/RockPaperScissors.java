import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		final int SCISSORS = 0;
		final int ROCK = 1;
		final int PAPER = 2;
		int CompChoice = rand.nextInt(2);




		System.out.print("Enter a '0' for Scissors, a '1' for Rock, or a '2' for Paper: ");

		int UserChoice = input.nextInt();

		if (UserChoice == SCISSORS && CompChoice == PAPER) {

			System.out.println("The computer was paper. You are scissors. You won.");
		}

		else if (UserChoice == SCISSORS && CompChoice == SCISSORS) {

					System.out.println("The computer was scissors. You are scissors. It is a draw.");
		}

		else if (UserChoice == SCISSORS && CompChoice == ROCK) {

							System.out.println("The computer was rock. You are scissors. The computer wins.");
		}

		else if (UserChoice == ROCK && CompChoice == SCISSORS) {

							System.out.println("The computer was scissors. You are rock. You won.");
		}

		else if (UserChoice == ROCK && CompChoice == PAPER) {

							System.out.println("The computer was paper. You are rock. The computer wins.");
		}

		else if (UserChoice == ROCK && CompChoice == ROCK) {

							System.out.println("The computer was rock. You are rock. It is a tie.");
		}

		else if (UserChoice == PAPER && CompChoice == SCISSORS) {

							System.out.println("The computer was scissors. You are paper. The computer wins.");
		}

		else if (UserChoice == PAPER && CompChoice == ROCK) {

							System.out.println("The computer was rock. You are paper. You won.");
		}

		else if (UserChoice == PAPER && CompChoice == PAPER) {

							System.out.println("The computer was paper. You are paper. It is a tie.");
		}








		return;


	}
}