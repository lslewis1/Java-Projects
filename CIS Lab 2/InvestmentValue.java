import java.util.Scanner;

public class InvestmentValue
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter investment amount: ");

		double dInvestmentAmount = input.nextDouble();

		System.out.println("Enter annual interest rate in percentage: ");

		double dInterestRate = input.nextDouble();

		System.out.println("Enter number of years: ");

		double dYears = input.nextDouble();

		double dFutureInvestmentValue = dInvestmentAmount* (Math.pow((1 + dInterestRate), (dYears*12)));

		System.out.print("Accumulated value is $" + dFutureInvestmentValue);


		return;


	}
}