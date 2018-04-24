package Something;

public class Player {

    private Board board;
    private String name;
    public Player(String name, Board board){
        this.board = board;
        this.name = name;
    }
    public boolean move(int position){
        board.putToBoard1(position);
        return true;
    }

}
