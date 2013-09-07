package org.hexlet.gamexo.ai;

/**
 * User: S.Rogachevsky
 * Date: 07.09.13
 * Time: 15:31
 */
public class AI {
    Difficulty difficulty;
    int sizeX;
    int sizeY;

    public AI(Difficulty difficulty, int sizeX, int sizeY) {
        this.difficulty = difficulty;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }


    public Movement doMove(Movement step) throws AIException{


        switch (difficulty){
            case EASY: break;
            case MEDIUM: break;
            case HARD: break;
            default: throw new AIException("Incorrect difficulty level");
        }
      return null;
    }

}
