package main.java.org.hexlet.gamexo.ai;

/**
 * User: Oleg
 * Date: 09.09.13
 * Time: 11:42
 */

import java.util.Random;
import main.java.org.hexlet.gamexo.ai.Exceptions.*;

public class RandomMadBot {

	private Difficulty difficulty;
	private boolean isAIFirst;
	private int x;
	private int y;
	private final int SIZE_X;
	private final int SIZE_Y;
	private char[][] gameBoard;
	private char chip;

	/* difficulty  и  isAIFirst будут нужны в более сложном ИИ,
	* но пока что пусть они остаются для примера*/

 	public RandomMadBot(int sizeX, int sizeY, int numInTheRow,
                        Difficulty difficulty, boolean isAIFirst) {
		this.difficulty = difficulty;
		this.isAIFirst = isAIFirst;
	    this.SIZE_X = sizeX;
	    this.SIZE_Y = sizeY;
	    this.gameBoard = new char[sizeX][sizeY];
	    if (isAIFirst) {
		    chip = 'x';
	    }else {
		    chip = '0';
	    }
	}

    public void doMove(int x, int y)throws CellIsNotEmptyException {

	    if (!isCellEmpty(x, y)){
		    String ex = x + " " + y;
		    throw new CellIsNotEmptyException(ex);
	    }

	    while (true) {
		    Random random = new Random();
		    this.x = random.nextInt(SIZE_X);
		    this.y = random.nextInt(SIZE_Y);
		    if (isCellEmpty(x, y)) {
			    gameBoard[x][y] = chip;
			    return;
		    }

	    }
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean isCellEmpty(int column,int row){
		return gameBoard[column][row] == '\u0000';
	}

	public boolean isWin(int column, int row) {
		 // код код код....
		return false;
	}


}
