package GamerTime;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToeDriver {
    public static final String GREEN = "\u001b[32m";
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001b[31m";
    public static char[][] board = new char[3][3];
    public static int[][] checker = new int[3][3];

    public static void main(String[] args) {


        int counter = 0;
        int isRow = 0;
        while (isRow == 0) {

            printBoard();
            if (counter % 2 == 0) {
                playTurn('O', 1);
            } else {
                playTurn('X', 2);
            }

            isRow = checkThreeInARow(isRow);

            counter++;

            if(counter > 9){
                break;
            }

        }

        printBoard();

        if (isRow == 1) {
            System.out.println("Player 1 has won");
        } else if(isRow == 2){
            System.out.println("Player 2 has won");
        } else{
            System.out.println("IT is a tie");
        }


    }

    /**
     * initiates the players turn
     * @param player which character is being input into the chart
     * @param num what the corresponding number is
     */
    public static void playTurn(char player, int num){
        Scanner scan = new Scanner(System.in);
        int row = 0;
        int column = 0;
        try{
            System.out.println("Player " + player + ": It is your turn");
            System.out.println("Type an the row then the column of which square you want to input");
            System.out.print("Row: ");
            row = scan.nextInt() - 1;
            System.out.print("Column: ");
            column = scan.nextInt() - 1;
        }
        catch(InputMismatchException e){
            System.out.println("Type in a number  not a letter");
        }

        while ((!checkValidInput(row, column)) || row > 3 || column > 3) {
            System.out.println("That square would render an error - Choose another square");
            System.out.print("Row: ");
            row = scan.nextInt() - 1;
            System.out.print("Column: ");
            column = scan.nextInt() - 1;
        }

        board[row][column] = player;
        checker[row][column] = num;
    }


    /**
     * checks if the chart has three in a row
     * @param board
     * @return the number that is three in a row
     */
    public static int checkRow(int[][] board) {
        if (board[0][0] == 1 && board[0][2] == 1 && board[0][1] == 1) {
            return 1;
        }
        if (board[1][0] == 1 && board[1][2] == 1 && board[1][1] == 1) {
            return 1;
        }
        if (board[2][0] == 1 && board[2][2] == 1 && board[2][1] == 1) {
            return 1;
        }

        if (board[0][0] == 2 && board[0][2] == 2 && board[0][1] == 2) {
            return 2;
        }
        if (board[1][0] == 2 && board[1][2] == 2 && board[1][1] == 2) {
            return 2;
        }
        if (board[2][0] == 2 && board[2][2] == 2 && board[2][1] == 2) {
            return 2;
        }

        return 0;
    }

    /**
     * checks if there is three in a column
     * @param board
     * @return the number that is three in a column
     */
    public static int checkColumn(int[][] board) {
        if (board[1][0] == 1 && board[2][0] == 1 && board[0][0] == 1) {
            return 1;
        }
        if (board[1][1] == 1 && board[2][1] == 1 && board[0][1] == 1) {
            return 1;
        }
        if (board[1][2] == 1 && board[2][2] == 1 && board[0][2] == 1) {
            return 1;
        }

        if (board[1][0] == 2 && board[2][0] == 2 && board[0][0] == 2) {
            return 2;
        }
        if (board[1][1] == 2 && board[2][1] == 2 && board[0][1] == 2) {
            return 2;
        }
        if (board[1][2] == 2 && board[2][2] == 2 && board[0][2] == 2) {
            return 2;
        }
        return 0;
    }

    /**
     * checks if a diagonal has three in a row
     * @param board
     * @return the number that is three in a diagonal
     */
    public static int checkDiagonal(int[][] board) {
        if (board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1) {
            return 1;
        }
        if (board[0][2] == 1 && board[1][1] == 1 && board[2][0] == 1) {
            return 1;
        }

        if (board[0][0] == 2 && board[1][1] == 2 && board[2][2] == 2) {
            return 2;
        }
        if (board[0][2] == 2 && board[1][1] == 2 && board[2][0] == 2) {
            return 2;
        }
        return 0;
    }

    /**
     * prints the chart
     */
    public static void printBoard() {
        System.out.println("    1    2    3 ");

        for (int row = 0; row < board.length; row++) {
            System.out.print(row + 1 + " ");
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] == 'O') {
                    System.out.print("| " + GREEN + board[row][col] + RESET + " |");
                } else if (board[row][col] == 'X') {
                    System.out.print("| " + RED + board[row][col] + RESET + " |");
                } else {
                    System.out.print("| " + board[row][col] + " |");
                }

            }
            System.out.println();
        }


    }

    /**
     * checks if the players input is correct
     * @param row
     * @param col
     * @return true if it is a correct input and false otherwise
     */
    public static boolean checkValidInput(int row, int col) {
        if (checker[row][col] != 0) {
            return false;
        }

        return true;

    }

    /**
     * figure out who the winner is
     * @param num
     * @return the number of the winner
     */
    public static int checkThreeInARow(int num) {
        num = checkRow(checker);
        if (num == 0) {
            num = checkColumn(checker);
        }
        if (num == 0) {
            num = checkDiagonal(checker);
        }

        return num;
    }
}

