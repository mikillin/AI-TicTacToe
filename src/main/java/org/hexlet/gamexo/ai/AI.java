package org.hexlet.gamexo.ai;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Date: 09.09.13
 * Time: 14:25
 */
public class AI {
    private Difficulty difficulty;

    /**
     * Initializing constructor
     *
     * @param difficulty         - level of game difficulty
     */
    public AI(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * Calculating next step from AI
     *
     * @param gameField           - current game field  statement
     * ..@param calculatingMoveSign - char, indicates the empty place of game field
     * @return - move from AI
     * @throws AIException - exception of wrong difficulty level
     */
    public CellInfo calculatingMove(CellInfo[][] gameField) throws AIException {
        switch (difficulty) {
            case EASY:
                return getEasyMove();
            case MEDIUM:
                return getMediumMove();
            case HARD:
                return getHardMove();
            default:
                throw new AIException("Incorrect difficulty level");
        }
    }

    /**
     * Calculating move for easy game difficulty
     *
     * @return -  move from AI
     */
    private CellInfo getEasyMove() {

        return null;
    }

    /**
     * Calculating move for medium game difficulty
     *
     * @return -  move from AI
     */
    private CellInfo getMediumMove() {
        return null;
    }

    /**
     * Calculating move for hard game difficulty
     *
     * @return -  move from AI
     */
    private CellInfo getHardMove() {
        return null;
    }
}
