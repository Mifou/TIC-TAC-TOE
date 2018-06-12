package TicTacToe;


public class Main {
    private static Board board = new Board();
    private static Player jack = new Player("Jack", board, 'X');
    private static Player bob = new Player("Bob", board, 'O');
    private static EndingConditions endingConditions = new EndingConditions(board);
    private static Player actualPlayer = jack;
    private static Input input = new Input(board);

    public static void main(String[] args) {

        while (true) {
            int position = input.chosePosition();
            while (input.isSignIn(position)) {
                System.out.println("There is a sign in this field, chose free field");
                position = input.chosePosition();
            }

            actualPlayer.move(position);

            board.displayBoard();
            if (endingConditions.checkEndingConditions(actualPlayer)) {
                break;
            }
            changeActualPlayer();


        }
    }

    private static void changeActualPlayer() {
        if (actualPlayer.equals(jack)) {
            actualPlayer = bob;
        } else {
            actualPlayer = jack;
        }
    }
}