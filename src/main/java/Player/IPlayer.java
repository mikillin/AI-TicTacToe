package main.java.Player;

import main.java.org.hexlet.gamexo.ai.Exceptions.CellIsNotEmptyException;

public interface IPlayer {

    void doMove(int x, int y)  throws CellIsNotEmptyException;

}
