package TicTacToe;

public class Player {

    private Board board;
    private String name;
    private char sign;

    public Player(String name, Board board, char sign){
        this.board = board;
        this.name = name;
        this.sign = sign;
    }
    public boolean move(int position){
       return board.putToBoard(position, sign);
    }

}
