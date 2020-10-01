import java.util.Scanner;

public class PayrollStatement
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter employee's name: ");

		String EmployeeName = input.next();

		System.out.print("Enter number of hours worked in a week: ");

		double dHoursWorked = input.nextDouble();

		System.out.print("Enter hourly pay rate: ");

		double dPayRate = input.nextDouble();

		System.out.print("Enter federal tax withholding rate as a decimal: ");

		double dFederalTax = input.nextDouble();

		System.out.print("Enter state tax withholding rate as a decimal: ");

		double dStateTax = input.nextDouble();

		System.out.println("");

		System.out.println("Employee Name: " + EmployeeName);

		System.out.println("Hours Worked: " + dHoursWorked);

		System.out.println("Pay Rate:  $" + dPayRate);

		Double dGrossPay = dPayRate * dHoursWorked;

		System.out.println("Gross Pay:  $" + dGrossPay);

		double dFedW = dGrossPay * dFederalTax;

		System.out.println("Deductions: ");

		System.out.println("  Federal Withholding (" + dFederalTax*100 + "%):  $" + dFedW);

		double dStateW = dGrossPay * dStateTax;

		System.out.println("  State Withholding (" + dStateTax*100 + "%):  $" + dStateW);

		double TotalD = dFedW + dStateW;

		System.out.println("  Total Deduction:  $" + TotalD);

		double NetPay = dGrossPay - TotalD;

		System.out.println("Net Pay:  $" + NetPay);


		return;


	}
}