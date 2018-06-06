package TicTacToe;

public class Main {

    public static void main(String[] args) {
        Board board = new Board();
        Player Jack = new Player("Jack",board,'X');
        Player Bob = new Player("Bob",board,'O');



        board.displayBoard();
        Jack.move(5);
        Bob.move(5);
        board.displayBoard();


    }
}
