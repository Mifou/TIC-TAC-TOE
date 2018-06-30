package TicTacToe;

public class EndingConditions {
    private Board board;

    public EndingConditions(Board board) {
        this.board = board;
    }

    public boolean checkEndingConditions(Player actualPlayer) {
        if (isWin()) {
            System.out.println("\nThe winner is " + actualPlayer.getName() + " (sign " + actualPlayer.getSign() + ")");
            return true;
        }
        if (isDraw()) {
            System.out.println("\nDRAW");
            return true;
        } else {
            return false;
        }
    }

    boolean isDraw() {
        char elements[][] = board.getElements();
        if (isWin()) {
            return false;
        }
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                if (elements[i][j] >= '1' && elements[i][j] <= '9') {
                    return false;
                }
            }

        }

        return true;
    }

    boolean isWin(){
        if (isWinDiagonally()||isWinHorizontally()||isWinVertically()){
            return true;
        }
        return false;
    }


    boolean isWinHorizontally() {
        //In horizontal case
        char elements[][] = board.getElements();
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                if ((elements[i][0] == elements[i][1]) && (elements[i][0] == elements[i][2])) {
                    return true;
                }
            }

        }
        return false;
    }


    //In vertical case
    boolean isWinVertically() {
        char elements[][] = board.getElements();
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                if ((elements[0][j] == elements[1][j]) && (elements[0][j] == elements[2][j])) {
                    return true;
                }
            }

        }
        return false;
    }

    //In diagonal case
    boolean isWinDiagonally() {
        char elements[][] = board.getElements();
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                if (((elements[0][0] == elements[1][1]) && (elements[0][0] == elements[2][2])) ||
                        (elements[0][2] == elements[1][1] && elements[0][2] == elements[2][0])) {
                    return true;
                }

            }

        }
        return false;

    }

}