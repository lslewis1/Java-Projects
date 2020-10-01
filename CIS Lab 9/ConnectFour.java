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

public class ConnectFour {
    
    final static int RED_WIN = 0, YELLOW_WIN = 1, DRAW = 2, CONTINUE = 3;
    
    public static void main(String[] args) {                            
        Scanner input = new Scanner(System.in);
        
        char[][] board = new char[6][7];
        initializeBoard(board);
        displayBoard(board);
        char color = 'R';
        int Column = 0;
        
        int gameStatus = checkGameStatus(board);
        int count = 1;
        
        while(gameStatus == CONTINUE) {
            Column = getColumnNoFromPlayer(input, color);
            dropDisk(color, Column, board);
            displayBoard(board);
            gameStatus = checkGameStatus(board);
            
            count++;

            if(count % 2 == 0) {
                color = 'Y';
            }
            else{
                color = 'R';
            }
        }
        
        
        if(gameStatus == RED_WIN) {
            System.out.println("The red player wins!");
        }
        else if(gameStatus == YELLOW_WIN) {
            System.out.println("The yellow player wins!");
        }
        else if(gameStatus == DRAW) {
            System.out.println("The game ended in a draw, neither player has won");
        }
    }
    
    public static void initializeBoard(char[][] board) {        // fill the board with space characters ''.
        
      for (int row = 0; row < board.length; row++) {
          for (int column = 0; column < board[row].length; column++) {
              board[row][column] = ' ';
          }
      }
     
    }
    
    public static int getColumnNoFromPlayer(Scanner input, char color) {        // recieves column no. (0 - 6).
        int Column = 0;
        if (color == 'R') {
            System.out.print("Drop a red disk at column (0 - 6): ");  
            Column = input.nextInt();
        }
        else {
            System.out.print("Drop a yellow disk at column (0 - 6): ");  
            Column = input.nextInt();
        }
        return Column;
    }
    
    public static void dropDisk(char color, int columnNo, char[][] board) {   // drop disk at column no. with a colored piece. 
        for(int row = 5; row >= 0; row--) {
            if (board[row][columnNo] == ' ') {
                board[row][columnNo] = color;
                break;
            }
        }
    }
    
    public static void displayBoard(char[][] board) {   // prints current board.
        for(int row = 0; row < board.length; row++) {
            for(int column = 0; column < board[row].length; column++) {
                System.out.print("|" + board[row][column]);
            }
            System.out.println("|");
        }
        System.out.println("---------------");
    }
    
    public static int checkGameStatus(char[][] board) { // returns the current status of the game: RED_WIN, YELLOW_WIN, DRAW, CONTINUE (int named constants).  
        int gameStatus = CONTINUE;
            
            if(checkRows(board) == CONTINUE ) {
                gameStatus = checkColumns(board);
                if (checkColumns(board) == CONTINUE) {
                    gameStatus = checkDiagonals(board);
                }
            }
            else {
                gameStatus = checkRows(board);
            }

        if(isBoardFull(board)) {
            return DRAW;
        }
        return gameStatus; 
    } 
    
    public static int checkRows(char[][]board) {    
        
        for (int row = 0; row < board.length; row++) {
            int count = 1;
            for (int column = 1; column < board[row].length; column++) {
                if (board[row][column] != ' ' && board[row][column] == board[row][column-1]) {
                    ++count;
                }
                else {
                    count = 1;
                }

                if (count >= 4) {
                    if (board[row][column] == 'R') {
                        return RED_WIN;
                    }
                    else {
                        return YELLOW_WIN;
                    }
                }
            }
        }
        return CONTINUE;
    }
    
    
    public static int checkColumns(char[][]board) {     
        
        for (int column = 0; column < board[0].length; column++) {
            int count = 0;
            for (int row = 1; row < board.length; row++) {
                if (board[row][column] != ' ' && board[row][column] == board[row-1][column]) {
                    ++count;
                }
                else {
                    count = 1;
                }
                
                if (count >= 4) {
                    if(board[row][column] == 'R') {
                        return RED_WIN;
                    }
                    else { 
                        return YELLOW_WIN;
                    }
                }
                
            }
        }
        return CONTINUE;
    }
    
    public static int checkDiagonals(char[][]board) {       //***FIXME
        
      for (int column = 0; column < board[0].length; column++) {
            int count = 0;
            for (int row = 1; row < (board.length + 1); row++) {

                if (column + row >= 6) {
                    break;
                }
                
                if (board[row][(column+row)] != ' ' && board[row-1][(column + (row - 1))] == board[row][(column+row)]) {
                    ++count;
                }
                else {
                    count = 1;
                }
                if (count >= 4) {
                    if(board[row][column + row] == 'R') {
                        return RED_WIN;
                    }
                    else { 
                        return YELLOW_WIN;
                    }
                }
            }
        }

        /*for (int row = 0; row < (board.length + 1); row++) {      
            int count = 0;
            for (int column = 1; column <  board[row].length; ++column) {

                if (column + row >= 6) {
                    break;
                }
                if (board[row + column][column] != ' ' && board[row+column - 1][column - 1] == board[row + column][column]) {
                    ++count;
                }
                else {
                    count = 1;
                }
                if (count >= 4) {
                    if(board[row + column][column] == 'R') {
                        return RED_WIN;
                    }
                    else { 
                        return YELLOW_WIN;
                    }
                }
            }
        }*/
        
        

        for (int column = 0; column <  board[0].length; ++column) { //works
            int count = 0;
            for (int row = 1; row <  (board.length); ++row) {

                if (column - row < 0) {
                    break;
                }
                if (board[row][column-row] != ' ' && board[row - 1][column - row + 1] == board[row][column-row]) {
                    ++count;
                }
                else {
                    count = 1;
                }
                if (count >= 4) {
                    if(board[row][column - row] == 'Y') {
                        return YELLOW_WIN;
                    }
                    else { 
                        return RED_WIN;
                    }
                }
            }
        }
        

        for (int row = 0; row < 7; row++) {
            int count = 0;
            for (int column = 5; column >= 0; column--) {

                if (column - row < 0) {
                    break;
                }
                if (board[column - row][column] != ' ' && board[column - row - 1][column + 1] == board[column - row][column]) {
                    ++count;
                }
                else {
                    count = 1;
                }
                if (count >= 4) {
                    if(board[column - row][column] == 'R') {
                        return RED_WIN;
                    }
                    else { 
                        return YELLOW_WIN;
                    }
                }
            }
        }

        return CONTINUE;
    }
    
    public static boolean isBoardFull(char[][]board) {
        int count = 0;
        for (int column = 0; column < board[0].length;column++) {
            for (int row = 0; row < board.length; row++) { 
                if(board[row][column] == 'R' || board[row][column] == 'Y') {
                    count++;
                }
            }
        }
        if (count == 42) {
            return true;
        }
        
        return false;
        
    }
}
