/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan.lewis2
 */
import java.util.Scanner;

public class Checkout1 {

public static void main(String[] args) {
    final float OUT_OF_STATE_DISCOUNT_PERCENT = 0.1f, AGE_DISCOUNT_PERCENT = 0.05f,
	SHIPPING_RATE = 0.1f, SC_TAX_RATE = 0.05f;

    Scanner input = new Scanner(System.in);
    String sState;
    int iBonusPoint = 0, iCustomerAge =0;
    float fWeight = 0.0f, fPrice = 0.0f, fCheckOutPrice = 0.0f;

    System.out.print("Customer State: ");
    sState = input.next();
    System.out.print("Customer Age: ");
    iCustomerAge = input.nextInt();
    System.out.print("Bonus Point: ");
    iBonusPoint = input.nextInt();
    System.out.print("Total Weight (lbs): ");
    fWeight = input.nextFloat();
    System.out.print("Total Product Price: $");
    fPrice = input.nextFloat();

    // rule 1. If the bonus point of a customer is over 200 and
    // the customer lives in a state other than SC,
    // then discount 10% of product price (before tax).
    // Or if the bonus point of a customer is over 300 OR customer is between age 18 and 35,
    // discount 5% of product price.
    // Only one of the discounts can be applied. First discount (10% discount) is applied whenever possible.
    if (iBonusPoint > 200 && !sState.equalsIgnoreCase("SC")) {
            fCheckOutPrice = fPrice - (fPrice*OUT_OF_STATE_DISCOUNT_PERCENT);
    }
    else if (iBonusPoint > 300 || (iCustomerAge >= 18 && iCustomerAge <= 35)) {
            fCheckOutPrice = fPrice - (fPrice*AGE_DISCOUNT_PERCENT);
    }
    else {
            fCheckOutPrice = fPrice;
    }
    
    // rule 3. If a customer lives in SC,
    // then add sales tax 5% (of product price) to the total checkout price. Otherwise, no sales tax is added.
    if (sState.equalsIgnoreCase("SC"))
            fCheckOutPrice += (fCheckOutPrice*SC_TAX_RATE);

    // rule 2. If total weight of products are less than 20 lbs and
    // total purchase (before tax, after 10% discount) is more than $200.00,
    // then shipping cost is free.
    // Otherwise, shipping cost is 10% of the weight. (i.e. shipping cost of 250 lbs is $25)
    if (fCheckOutPrice < 200 || fWeight > 20)
            fCheckOutPrice += (fWeight*SHIPPING_RATE);



    System.out.println("Check out price: $" + fCheckOutPrice);

  }
}
