/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Logan
 */
import java.util.Random;

public class GameOfCraps {
    public static int CRAPS = 1, NATURAL = 2, POINT = 3, WIN = 4, LOSE = 5, UNDECIDED = 6;
    
    public static int playCrap() {
        int result = 0;
        int DiceVal = rollADie();
        int DiceVal2 = rollADie();
        int sum = DiceVal + DiceVal2;
        System.out.println("You rolled " + DiceVal + " + " + DiceVal2 + " = " + sum);
        int resultSum = checkSumOfDice(DiceVal,DiceVal2);
        if(resultSum == POINT) {
            System.out.println("Point established. Point is " + sum);
            result = checkSumOfDice(sum);
        }
        else {
            result = resultSum;
        }
        return result;
    }
    
    public static int rollADie() {
        Random rand = new Random();
        int FaceVal = (rand.nextInt(6)) + 1;
        return FaceVal;
    }
    
    public static int checkSumOfDice(int Die1, int Die2) {
        int sum = Die1 + Die2;
        if (sum == 2 || sum == 3 || sum == 12) {
            return CRAPS;
        }
        else if (sum == 7 || sum == 11) {
            return NATURAL;
        }
        else {
            return POINT;
        }
    }
    
    public static int checkSumOfDice(int point) {
        int DiceSum = 0;
        int result = UNDECIDED;
        while (result == UNDECIDED) {
            int Die1 = rollADie();
            int Die2 = rollADie();
            DiceSum = Die1 + Die2;
            System.out.println("You rolled " + Die1 + " + " + Die2 + " = " + DiceSum);
            if (DiceSum == point) {
                result = WIN;
            }
            else if (DiceSum == 7) {
                result = LOSE;
            }
            else {
                result = UNDECIDED;
            }
        }
        return result;
    }
    
    public static void printResult(int result) {
        if (result == CRAPS || result == LOSE) {
            System.out.println("You lose.");
        }
        else if (result == NATURAL || result == WIN) {
            System.out.println("You win.");
        }
        else if (result == POINT || result == UNDECIDED) {
            System.out.println("Point established. Point is - " + result);
        }
        else {
            System.out.println("Error");
        }
    }
    
    public static void main (String[] args) {
        int GameResult = 0;
        GameResult = playCrap();
        printResult(GameResult);
    }
}