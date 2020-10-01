import java.util.Scanner;

public class HexagonArea
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		double side = 0.0;
		double area = 0.0;
		
		System.out.print("Enter the length of a side of a hexagon: ");
		side = input.nextDouble();
		
		area = ((3.0 * (Math.sqrt(3.0))) / 2.0) * (side * side);
		
		System.out.println("The area of the hexagon is: " + area);
		
		
		



		return;


	}
}