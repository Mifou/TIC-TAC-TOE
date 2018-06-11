package TicTacToe;

import java.util.InputMismatchException;


public class Player {


    public String getName() {
        return name;
    }

    public char getSign() {
        return sign;
    }



    private Board board;
    private String name;
    private char sign;


    public Player() {
    }

    public Player(String name, Board board, char sign) {
        this.board = board;
        this.name = name;
        this.sign = sign;
    }

    public boolean move(int position) {
        return board.putToBoard(position, sign);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        if (sign != player.sign) return false;
        return name != null ? name.equals(player.name) : player.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (int) sign;
        return result;
    }
}
