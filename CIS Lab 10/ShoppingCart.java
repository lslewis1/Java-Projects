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

public class ShoppingCart {
    static Item[] m_rgItems = new Item[20];  
    static int m_iNumOfItems = 0;
    
    public ShoppingCart() {
        for(int i = 0; i < m_rgItems.length; i++) {
            m_rgItems[i] = new Item();                    
        }
    }
    
    public Item[] getItems() { 
        return m_rgItems; 
    }
    
    public static void addItem(Item newItem) {  
        
        m_rgItems[m_iNumOfItems] = newItem;
        m_iNumOfItems++;
             
    }
    
    public double getTotal() {
        double total = 0.0;
        
        for(int i = 0; i < m_iNumOfItems; i++) {
            total += m_rgItems[i].calculateUnitTotal();
        }
        return total;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userChoice = "Yes";
        
        ShoppingCart cart = new ShoppingCart();
        
       
        while (!userChoice.equalsIgnoreCase("No") && m_iNumOfItems < 20) {
            Item item = new Item();
            System.out.println("Add an item to the shopping cart: ");       

            input.nextLine();
            System.out.println("What is the product's name? ");
            item.setProductName(input.nextLine());             
            input.nextLine();
     
            System.out.println("What is the product's description? ");
            item.setProductDescription(input.nextLine());                   
            
            System.out.println("What is the product's unit price? ");                   
            item.setUnitPrice(input.nextDouble());
            
            System.out.println("How many are you adding to the cart? ");
            item.setUnits(input.nextInt());
               
      
            cart.addItem(item);
            System.out.println();
            System.out.println("Would you like to add another item?");
            userChoice = input.next();
            System.out.println();
        }
        System.out.println();
        System.out.println("The shopping cart's info is as follows: ");
        for(int i = 0; i < m_iNumOfItems; i++) {
            System.out.println(m_rgItems[i].ToString());
        }
        
        System.out.println();        
        System.out.println("The total for the cart is $" + cart.getTotal());
            
    }
    
}
