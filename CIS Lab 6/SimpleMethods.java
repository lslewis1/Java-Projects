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

public class SimpleMethods {
    
    public static int getValue(Scanner input) {
        System.out.print("Enter an integer value: ");
        int iNum = input.nextInt();
        return iNum;
    }
    public static int subtract(int Num1, int Num2) {
        int difference = Num1 - Num2;
        return difference;
    }
    public static double divide(int Num1, int Num2) {
        double quotient = (double)Num1 / Num2;
        return quotient;
    }
    public static double celsius2fahrenheit(double Celsius) {
        double Fahrenheit = 0.0;
        if (Celsius < -273) {
            return -500;
        }
        else {
            Fahrenheit = (Celsius * (9 / 5)) + 32;
        }
        return Fahrenheit;
    }
    public static void printResult(double degree) {
        System.out.print(degree);
    }
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int Value1 = getValue(input);
        int Value2 = getValue(input);
        
        System.out.print("The difference between " + Value1 + " and " + Value2 + " is ");
        int subtractValue = subtract(Value1, Value2);
        printResult(subtractValue);
        System.out.println();
        
        System.out.print(Value1 + " divided by " + Value2 + " results in ");
        double divideValue = divide(Value1, Value2);
        printResult(divideValue);
        System.out.println();
        
        int CelsiusDegree = getValue(input);
        double FahrenheitDegree = celsius2fahrenheit(CelsiusDegree);
        System.out.print(CelsiusDegree + " degrees celsius is ");
        printResult(FahrenheitDegree);
        System.out.print(" degrees fahrenheit.");
        System.out.println();
        
    }
}
