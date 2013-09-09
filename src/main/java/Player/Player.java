package main.java.Player;

import main.java.*;
import main.java.org.hexlet.gamexo.ai.Exceptions.CellIsNotEmptyException;

public abstract class Player implements IPlayer{

	public static final int MAX_SIZE_FIELD = 4;

	public static final int ZERO = 0;

	String name;

	Settings settings;

	CellInfo cellInfo;

	CellState cellState;

	Field field;

	protected Player(String name, CellState figure) {
		this.name = name;
		settings = new Settings(name);
		cellState = figure;
	}

	protected boolean checkValue(int x, int y) {
		if ((x > ZERO && y > ZERO) && (x < MAX_SIZE_FIELD && y < MAX_SIZE_FIELD)) {
			return true;
		}
		return false;
	}

	@Override
	public void doMove(int x, int y)  throws CellIsNotEmptyException {
		cellInfo = new CellInfo(x, y, cellState);
		if (checkValue(x, y) && this.field.isAvailible(cellInfo)) {
			field.setCell(cellInfo);
		}
	}

}

