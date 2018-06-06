package TicTacToe;


public class Board {
    private char board[][] = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
    private static final char ZERO_CHAR = (char) 48;
    
    public void displayBoard() {
        for (int i = 0; i < board.length; i++) {
            System.out.println();
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
        }
        System.out.println();
    }

    public boolean putToBoard(int position, char sign) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ZERO_CHAR + position) {
                    board[i][j] = sign;
                    return true;
                }
            }

        }
        return false;

    }


}

