package TicTacToe;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EndingConditionsTest {

    //Diagonal test
    @DataProvider(name = "DiagonalTest")
    public static Object[][] numbersDiagonal() {
        return new Object[][]{{1, 5, 9, true}, {3, 5, 7, true}, {1, 2, 3, false}, {1, 4, 7, false}};
    }

    @Test(dataProvider = "DiagonalTest")
    public void diagonalTest(Integer number1, Integer number2, Integer number3, Boolean expectedResult) {
        // arrange
        Board board = new Board();
        board.putToBoard(number1, 'X');
        board.putToBoard(number2, 'X');
        board.putToBoard(number3, 'X');
        EndingConditions endingConditions = new EndingConditions(board);

        // act
        boolean status = endingConditions.isWinDiagonally();

        // assert
        Assert.assertEquals(status, expectedResult.booleanValue());
    }

    //Horizontal Test
    @DataProvider(name = "HorizontalTest")
    public static Object[][] numbersHorizontal() {
        return new Object[][]{{1, 2, 3, true}, {4, 5, 6, true}, {7, 8, 9, true}, {1, 5, 9, false}, {2, 5, 8, false}};
    }


    @Test(dataProvider = "HorizontalTest")
    public void isWinHorizontalTest(Integer number1, Integer number2, Integer number3, Boolean expectedResult) {
        // arrange
        Board board = new Board();
        board.putToBoard(number1, 'X');
        board.putToBoard(number2, 'X');
        board.putToBoard(number3, 'X');
        EndingConditions endingConditions = new EndingConditions(board);

        // act
        boolean status = endingConditions.isWinHorizontally();

        // assert
        Assert.assertEquals(status, expectedResult.booleanValue());

    }

    //Vertical Test
    @DataProvider(name = "VerticalTest")
    public static Object[][] numbersVertical() {
        return new Object[][]{{1, 4, 7, true}, {2, 5, 8, true}, {3, 6, 9, true}, {1, 5, 9, false}, {4, 5, 6, false}};
    }

    @Test(dataProvider = "VerticalTest")
    public void isWinVerticalTest(Integer number1, Integer number2, Integer number3, Boolean expectedResult) {
        // arrange
        Board board = new Board();
        board.putToBoard(number1, 'X');
        board.putToBoard(number2, 'X');
        board.putToBoard(number3, 'X');
        EndingConditions endingConditions = new EndingConditions(board);

        // act
        boolean status = endingConditions.isWinVertically();

        // assert
        Assert.assertEquals(status, expectedResult.booleanValue());

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
    public void notDrawAndNotWin() {
        // arrange
        Board board = new Board();
        board.putToBoard(1, 'X');
        board.putToBoard(4, 'X');
        board.putToBoard(7, 'O');
        EndingConditions endingConditions = new EndingConditions(board);

        // act
        boolean status = endingConditions.isDraw() && endingConditions.isWin();

        // assert
        Assert.assertFalse(status);
    }

}