package TicTacToe;


public class Board {
    private char elements[][] = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
    private static final char ZERO_CHAR = (char) 48;

    public void displayBoard() {
        for (int i = 0; i < elements.length; i++) {
            System.out.println();
            for (int j = 0; j < elements[i].length; j++) {
                System.out.print(elements[i][j]);
            }
        }
        System.out.println();
    }

    public boolean putToBoard(int position, char sign) {

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                if (elements[i][j] == ZERO_CHAR + position) {
                    elements[i][j] = sign;
                    return true;
                }
            }

        }
        return false;

    }


    public char[][] getElements() {
        return elements;
    }
}