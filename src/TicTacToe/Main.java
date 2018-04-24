package TicTacToe;

public class Main {

    public static void main(String[] args) {
        Board board = new Board();
        
        board.displayBoard();
        board.putToBoard('5', 'X');
        board.displayBoard();


    }
}
