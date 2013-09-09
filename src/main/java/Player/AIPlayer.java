package main.java.Player;

import main.java.*;
import main.java.org.hexlet.gamexo.ai.Difficulty;
import main.java.org.hexlet.gamexo.ai.Exceptions.CellIsNotEmptyException;
import main.java.org.hexlet.gamexo.ai.RandomMadBot;

public class AIPlayer extends Player implements IPlayer{

	private RandomMadBot madBot;

    public AIPlayer(CellState figure, int sizeX, int sizeY,
                    int numInTheRow,Difficulty difficulty, boolean isAIFirst) {
        super("bot", figure);
	    madBot = new RandomMadBot(sizeX, sizeY, numInTheRow, difficulty, isAIFirst);
    }

	@Override
	public void doMove(int x, int y) throws CellIsNotEmptyException{

		madBot.doMove(x, y);
		x = madBot.getX();
		y = madBot.getY();

		cellInfo = new CellInfo(x, y, cellState);
		if (checkValue(x, y) && this.field.isAvailible(cellInfo)) {
			field.setCell(cellInfo);
		}
	}

}
