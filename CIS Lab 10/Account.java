
import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan.lewis2
 */
public class Account {
    
    private int id;
    private double balance;
    private double annualInterestRate;
    
    private Date dateCreated = new Date();
    
    
    public Account() {
        
    }
    
    public Account(int newID, double newBalance, double newRate) {
        id = newID;
        balance = newBalance;
        annualInterestRate = newRate;
    }
    
    public void setID(int specID) {
        id = specID;
    }
    
    public int getID() {
        return id;
    }
    
    public void setBalance(double newBalance) {
        balance = newBalance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setInterestRate(double newRate) {
        annualInterestRate = newRate;
    }
    
    public double getInterestRate() {
        return annualInterestRate;
    }
    
    public Date getDateCreated() {  
        return dateCreated;
    }
    
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12.0;
    }
    
    public double withdraw(double withdrawal) {
        balance = balance - withdrawal;
        return balance;
    }
    
    public double deposit(double depositAmt) {
        balance = balance + depositAmt;
        return balance;
    }
    
    public static void main(String[] args) {
        
        Account accnt = new Account(1122, 20000, 4.5);
        accnt.withdraw(2500);
        accnt.deposit(3000);
        
        System.out.println("The balance in the account is now: $" + accnt.balance + 
                "\nwith a monthly interest rate of %" + accnt.getMonthlyInterestRate() + 
                "\nsince its creation on " + accnt.getDateCreated());
    }
}
