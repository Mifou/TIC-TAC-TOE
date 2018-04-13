package Something;

import java.util.Scanner;

public class Board {
    Scanner scanner = new Scanner(System.in);
    private char board[][] = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};


    public void displayBoard() {
        for (int i = 0; i < board.length; i++) {
            System.out.println();
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
        }
        System.out.println();
    }

    public void putToBoard() {

        System.out.println("Type number of field, where you want to put X");
        char chose = scanner.next().charAt(0);


        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == chose) {
                    board[i][j] = 'X';
                }
            }

        }

    }

}

