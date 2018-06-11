package TicTacToe;

public class EndingConditions {
    private Board board;

    public EndingConditions (Board board){
        this.board = board;
    }

    public boolean isDraw(){
        char elements[][] = board.getElements();
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                if (elements[i][j] >= '1'&& elements[i][j] <='9' || isWin()) {
                    return false;
                }
            }

        }

        return true;
    }
    public boolean isWin(){

        //In horizontal case
        char elements[][] = board.getElements();
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                if ((elements[i][0] == elements[i][1]) && (elements[i][0] == elements[i][2])) {
                    return true;
                }
            }

        }
        //In vertical case
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                if ((elements[0][j] == elements[1][j]) && (elements[0][j] == elements[2][j])) {
                    return true;
                }
            }

        }
        //In diagonal case
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                if ((elements[0][0] == elements[1][1]) && (elements[0][0] == elements[2][2])) {
                    return true;
                }
            }

        }
        return false;

    }

}