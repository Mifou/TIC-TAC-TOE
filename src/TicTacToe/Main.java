package TicTacToe;


public class Main {

    public static void main(String[] args) {
        Board board = new Board();
        Player jack = new Player("Jack", board, 'X');
        Player bob = new Player("Bob", board, 'O');
        EndingConditions endingConditions = new EndingConditions(board);
        Player actualPlayer = jack;
        Input input = new Input(board);


        while (true) {
            int position = input.chosePosition();
            while (input.isSignIn(position)) {
                System.out.println("There is a sign in this field, chose free field");
                position = input.chosePosition();
            }


            actualPlayer.move(position);

            board.displayBoard();
            if (endingConditions.isWin()) {
                System.out.println("\nThe winner is " + actualPlayer.getName() + " (sign " + actualPlayer.getSign() + ")");
                break;
            }
            if (endingConditions.isDraw()) {
                break;

            }
            if (actualPlayer.equals(jack)) {
                actualPlayer = bob;
            } else {
                actualPlayer = jack;
            }


            if (endingConditions.isDraw()) {
                System.out.println("\nDRAW");
            }
        }
    }
}