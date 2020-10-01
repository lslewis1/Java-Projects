 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan.lewis2
 */
import java.util.Scanner;

public class BlackJack {
    
    //Subtask 1
    public static int[] shuffleDeck(int[] deck) {
        
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
    
        for (int i = 0; i < deck.length; i++) {
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index]; 
            deck[index] = temp;
        }
        return deck;
    }
            
    //Subtask 2
    public static int[] initializeHands(int[] hand) {
        
        for(int i = 0; i < hand.length; i++) {
            hand[i] = -1;
        }
        return hand;
    }
    
    //Subtask 3
    public static void giveCard(int[] deck, int[] hand) { 
        int count = 0;
        
        while(deck[count] == -1) {
            count++;
        }
        
        for(int i = 0; i < hand.length; i++) {
            if(hand[i] == -1) {
                hand[i] = deck[count];
                deck[count] = -1;
                break;
            }
        }
    }
    
    //Subtask 4
    public static int FaceValue(int Card) { 
        
        if (Card % 13 == 0) {
            return 11;
        }
        else if (Card % 13 == 10 || Card % 13 == 11 || Card % 13 == 12) {
            return 10;
        }
        else {
            return (Card % 13) + 1;
        }
    }
    
    //Subtask 5
    public static int blackJackValue(int[] hand) { 
        int BlackJackValue = 0;
        for (int i = 0; i < hand.length; i++) {
            if(hand[i] != -1) {
                BlackJackValue += FaceValue(hand[i]);
                if (BlackJackValue > 21 && FaceValue(hand[i]) == 11) {
                    BlackJackValue -= 10;
                }
            }
        }
        return BlackJackValue;
    }
    
    //Subtask 6
    public static void printHands(int[] hand) { //CHECK ***
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
        "10", "Jack", "Queen", "King"};
        
        for (int i = 0; i < hand.length; i++) {
            if(hand[i] != -1) {
                String suit = suits[hand[i] / 13];
                String rank = ranks[hand[i] % 13];
                System.out.println("    -" + rank + " of " + suit);
            }
        }
    }
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        /*int[] player = {0,1,};
        printHands(player);
        System.out.println(blackJackValue(player));
        */
        
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
        "10", "Jack", "Queen", "King"};
        
        int[] deck = new int[52];
        int[] dealer = new int[5];
        int[] player = new int[5];
        
        dealer = initializeHands(dealer);       //Hands are -1s until the cards are given from deck.
        player = initializeHands(player);       // "
        deck = shuffleDeck(deck);               // Deck is randomly shuffled.
        
        
        for (int i = 0; i < 2; i++) {               //Two cards given to the player and dealer.
            giveCard(deck, player);     //Give 1 card to player's hand.       
            giveCard(deck, dealer);     //Give 1 card to dealer's hand.
        }
        
        System.out.println("The player's hand contains: ");
        printHands(player);             //Print the cards currently in the player's hand.
        System.out.println("");
        
        System.out.println("The dealer's first card is: ");        //Display 1st card of dealer's hand.
        String suit = suits[dealer[0] / 13];
        String rank = ranks[dealer[0] % 13];
        System.out.println("    -" + rank + " of " + suit);
        
        System.out.println("");

        System.out.print("Would you like to hit (enter a 0) or stand (enter a 1): ");  //Ask user to hit or stand.
        int userPlay = input.nextInt();

        int BlackJackVal = 0;
        int DBlackJackVal = 0;
        
        if (userPlay == 1) {
            BlackJackVal = blackJackValue(player);
            System.out.println("Your blackjack value is: " + BlackJackVal);
            System.out.println();
        }


        while (userPlay == 0) {         //While the user decides to hit instead of standing.
            giveCard(deck, player);    //Give another card to player's hand.
            System.out.println("The player's hand contains: ");
            printHands(player); 
            BlackJackVal = blackJackValue(player);                             //Calculate blackjack value.
            System.out.println("Your blackjack value is: " + BlackJackVal);    //Print blackjack value.
            System.out.println();
            if (BlackJackVal > 21) {                        //Decide if the player has busted.
                System.out.println("You lose.");
                break;                                      //If so, break out of the loop, game is over and player has lost.
            }
            else if (BlackJackVal == 21) {
                System.out.println("You won.");
                break;
            }
            else {                                          //Otherwise, if the player has not busted...
                System.out.print("Would you like to hit (enter a 0) or stand (enter a 1): ");  //Ask user to hit or stand again.
                userPlay = input.nextInt();                                                                       
            }
        }
     
        if(BlackJackVal < 21) {
            DBlackJackVal = blackJackValue(dealer);        //check blackjack value of dealer's hand.
            System.out.println("The dealer's hand contains: ");
            printHands(dealer); 
            System.out.println("The dealer's blackjack value is: " + DBlackJackVal);
            System.out.println();

            if(DBlackJackVal > BlackJackVal) {    // if dealer's blackjack value is better than player's blackjack value
                System.out.println("The dealer wins.");
            }

            else {
                while(DBlackJackVal <= BlackJackVal) {      //While dealer's blackjack value is worse than player's blackjack value...
                    giveCard(deck, dealer);                 //Give another card to dealer's hand.
                    System.out.println("The dealer's hand contains: ");
                    printHands(dealer); 
                    DBlackJackVal = blackJackValue(dealer);
                    System.out.println("The dealer's blackjack value is: " + DBlackJackVal);
                    System.out.println();

                    if(DBlackJackVal > 21) {                           // if busted
                        System.out.println("The player wins.");       // player wins
                        break;
                    }
                    else if (DBlackJackVal == 21) {
                        System.out.println("The dealer wins.");
                        break;
                    }
                    else if (DBlackJackVal == 21 && BlackJackVal == 21) {
                        System.out.println("It is a tie, both the player and the dealer have 21.");
                    }
                 System.out.println("The dealer wins.");  
                }
            }
        } 
    }
}

