package org.hexlet.gamexo.ai;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * User: S.Rogachevsky
 * Date: 07.09.13
 * Time: 15:31
 */

//   Стоит ли реализовывать работу ИИ в этом классе?
//   Может лучше сделать его только игроком, который передает данные ИИ.
//   И в зависимости от уровня сложности игры он будет создавать инстанс ИИ с соответствующими параметрами, а потом
//   работать с ним в doMove?
//   К тому же, потом можно будет всегда  слегкостью переписывать ИИ не затрагивая этот класс.
public class PlayerAI implements IPlayerAI {
    private Difficulty difficulty;
    private CellState calculatingMoveSign;
    private CellInfo[][] gameField;

    /**
     * Initializing constructor
     *
     * @param difficulty         - level of game difficulty
     */
    public PlayerAI(Difficulty difficulty) {
        this.difficulty = difficulty;
    }


    // TODO: refactor  (maybe needs to create factory to calculate move.. ala.. return MoveFactory.calculateNext(PlayerAI))
    //короче архитектура пока дерьмо.. надо переделывать, в бине делать такую бизнес логику не по фень-шую даже самому
    // индусскому

    /**
     * Calculating next step from AI
     *
     * @param gameField           - current game field  statement
     * @param calculatingMoveSign - char, indicates the empty place of game field
     * @return - move from AI
     * @throws AIException - exception of wrong difficulty level
     */
    public CellInfo doMove(CellInfo[][] gameField, CellState calculatingMoveSign) throws AIException {
        this.setGameField(gameField);
        this.setCalculatingMoveSign(calculatingMoveSign);

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


    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public CellState getCalculatingMoveSign() {
        return calculatingMoveSign;
    }

    public void setCalculatingMoveSign(CellState calculatingMoveSign) {
        this.calculatingMoveSign = calculatingMoveSign;
    }

    public CellInfo[][] getGameField() {
        return gameField;
    }

    public void setGameField(CellInfo[][] gameField) {
        this.gameField = gameField;
    }


    /**
     * Calculating move for easy game difficulty
     *
     * @return -  move from AI
     */
    private CellInfo getEasyMove() {
        List<CellInfo> freeMoves = new ArrayList<CellInfo>();
        CellInfo cellInfo;
        for (int i = 0; i < this.getGameField().length; i++)
            for (int j = 0; j < this.getGameField()[i].length; j++)
                if (this.getGameField()[i][j].getFigure() == getCalculatingMoveSign()) {
                    cellInfo = new CellInfo(i, j, this.getGameField()[i][j].getFigure());
                    freeMoves.add(cellInfo);
                }
        return freeMoves.get(new Random().nextInt(freeMoves.size()));
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
