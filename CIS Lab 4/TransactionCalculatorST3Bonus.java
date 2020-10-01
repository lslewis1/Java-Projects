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

public class TransactionCalculatorST3Bonus {

public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    String NewTransaction = "yes";

    while(NewTransaction.equalsIgnoreCase("yes")) {
    double Price = 0.0;
    int Category = 0;
    System.out.println("-- Starting a transaction --");
    System.out.print("Price (Enter a 0 after entering the last item): $");
    Price = input.nextDouble();
    double TotalCost = 0.0;
    double TaxRate = 0.0;
    double SumCost = 0.0;
    
    System.out.print("Category (1.Food, 2.Home, 3.Clothes, 4.Entertainment, 5.Magazine): ");
    Category = input.nextInt();
    
    switch(Category) {
            case 1: 
                TaxRate = 0.00;
                TotalCost = (Price * TaxRate) + Price;
                break;
            case 2:
                TaxRate = 0.05;
                TotalCost = (Price * TaxRate) + Price;
                break;
            case 3:
                TaxRate = 0.06;
                TotalCost = (Price * TaxRate) + Price;
                break;
            case 4:
                TaxRate = 0.07;
                TotalCost = (Price * TaxRate) + Price;
                break;
            case 5:
                TaxRate = 0.03;
                TotalCost = (Price * TaxRate) + Price;
                break;
        }
    
    
        while(Price != 0) {
            SumCost = SumCost + TotalCost;
            System.out.print("Price (Enter a 0 after entering the last item): $");
            Price = input.nextDouble();
            if (Price != 0) {
                System.out.print("Category (1.Food, 2.Home, 3.Clothes, 4.Entertainment, 5.Magazine): ");
                Category = input.nextInt();
                }
            switch(Category) {
                case 1: 
                    TaxRate = 0.00;
                    TotalCost = (Price * TaxRate) + Price;
                    break;
                case 2:
                    TaxRate = 0.05;
                    TotalCost = (Price * TaxRate) + Price;
                    break;
                case 3:
                    TaxRate = 0.06;
                    TotalCost = (Price * TaxRate) + Price;
                    break;
                case 4:
                    TaxRate = 0.07;
                    TotalCost = (Price * TaxRate) + Price;
                    break;
                case 5:
                    TaxRate = 0.03;
                    TotalCost = (Price * TaxRate) + Price;
                    break;
          
         }
        
        
        
        
        
        }
        System.out.println("- Total is $" + SumCost);
    
        System.out.println("Is there a new transaction? (yes or no): ");
        NewTransaction = input.next();
    
    
    
    }
    System.out.println("Bye!");
    
    
    
    
    
    
    
    
    

    }

}
