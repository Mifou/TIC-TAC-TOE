package TicTacToe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);
    private Board board;

    public Input(Board board) {
        this.board = board;
    }

    public int chosePosition() {
        int field;
        do {
            try {
                field = scanner.nextInt();
            } catch (InputMismatchException ime) {
                System.err.println("Wrong format");
                field = -1;
                scanner.nextLine();
            }
        } while (field < 1 || field > 9);

        return field;

    }

    public boolean isSignIn(int position) {
        char elements[][] = board.getElements();
        //Calculations are based on indexes, therefore position has to be 1 smaller
        position -= 1;
        int i = position / 3;
        int j = position % 3;
        if (elements[i][j] < '1' || elements[i][j] > '9') {
            return true;
        }
        return false;
    }
}
