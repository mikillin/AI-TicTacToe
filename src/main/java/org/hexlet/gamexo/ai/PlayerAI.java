package org.hexlet.gamexo.ai;

/**
 * User: S.Rogachevsky
 * Date: 07.09.13
 * Time: 15:31
 */
public class PlayerAI implements IPlayerAI {
    Difficulty difficulty;
    int amountVictoryMoves;

    public PlayerAI(Difficulty difficulty, int amountVictoryMoves) {
        this.difficulty = difficulty;
        this.amountVictoryMoves = amountVictoryMoves;
    }


    public Move doMove(char[][] matrix) throws AIException {

        switch (difficulty) {
            case EASY:
                return getEasyMove(matrix);
            case MEDIUM:
                return getMediumMove(matrix);
            case HARD:
                return getHardMove(matrix);
            default:
                throw new AIException("Incorrect difficulty level");
        }
    }

    private Move getEasyMove(char[][] matrix) {
        return null;
    }

    private Move getMediumMove(char[][] matrix) {
        return null;
    }

    private Move getHardMove(char[][] matrix) {
        return null;
    }


}
