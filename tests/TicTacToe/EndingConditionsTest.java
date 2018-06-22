package TicTacToe;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EndingConditionsTest {

    @Test
    public void isWinDiagonalTest() {
        // arrange
        Board board = new Board();
        board.putToBoard(1, 'X');
        board.putToBoard(5, 'X');
        board.putToBoard(9, 'X');
        EndingConditions endingConditions = new EndingConditions(board);

        // act
        boolean status = endingConditions.isWin();

        // assert
        Assert.assertTrue(status);
    }

    @Test
    public void isWinHorizontalTest() {
        // arrange
        Board board = new Board();
        board.putToBoard(1, 'X');
        board.putToBoard(2, 'X');
        board.putToBoard(3, 'X');
        EndingConditions endingConditions = new EndingConditions(board);

        // act
        boolean status = endingConditions.isWin();

        // assert
        Assert.assertTrue(status);

    }

    @Test
    public void isWinVerticalTest() {
        // arrange
        Board board = new Board();
        board.putToBoard(1, 'X');
        board.putToBoard(4, 'X');
        board.putToBoard(7, 'X');
        EndingConditions endingConditions = new EndingConditions(board);

        // act
        boolean status = endingConditions.isWin();

        // assert
        Assert.assertTrue(status);

    }

    @Test
    public void isWinNegativeTest() {
        // arrange
        Board board = new Board();
        board.putToBoard(1, 'X');
        board.putToBoard(2, 'X');
        board.putToBoard(7, 'X');
        EndingConditions endingConditions = new EndingConditions(board);

        // act
        boolean status = endingConditions.isWin();

        // assert
        Assert.assertFalse(status);
    }

    @Test
    public void isDrawPositiveTest() {
        // arrange
        Board board = new Board();
        board.putToBoard(1, 'X');
        board.putToBoard(3, 'X');
        board.putToBoard(6, 'X');
        board.putToBoard(7, 'X');
        board.putToBoard(8, 'X');
        board.putToBoard(2, 'O');
        board.putToBoard(4, 'O');
        board.putToBoard(5, 'O');
        board.putToBoard(9, 'O');
        EndingConditions endingConditions = new EndingConditions(board);

        // act
        boolean status = endingConditions.isDraw();

        // assert
        Assert.assertTrue(status);
    }

    @Test
    public void isDrawNegativeTest() {
        // arrange
        Board board = new Board();
        board.putToBoard(1, 'X');
        board.putToBoard(4, 'X');
        board.putToBoard(7, 'X');
        EndingConditions endingConditions = new EndingConditions(board);

        // act
        boolean status = endingConditions.isDraw();

        // assert
        Assert.assertFalse(status);
    }
    @Test
    public void notDrawAndNotWin () {
        // arrange
        Board board = new Board();
        board.putToBoard(1, 'X');
        board.putToBoard(4, 'X');
        board.putToBoard(7, 'O');
        EndingConditions endingConditions = new EndingConditions(board);

        // act
        boolean status = endingConditions.isDraw()&&endingConditions.isWin();

        // assert
        Assert.assertFalse(status);
    }

}