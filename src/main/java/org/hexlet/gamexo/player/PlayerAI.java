package main.java.org.hexlet.gamexo.player;

import main.java.org.hexlet.gamexo.ai.*;
import main.java.org.hexlet.gamexo.field.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * User: S.Rogachevsky
 * Date: 07.09.13
 * Time: 15:31
 */
public class PlayerAI extends Player {
    private AI artificialIntelligence;

    //создаем инстанс АИ
    public PlayerAI(AI artificialIntelligence) {
        this.artificialIntelligence = new AI(Difficulty.MEDIUM);
    }

    // TODO: refactor  (maybe needs to create factory to calculate move.. ala.. return MoveFactory.calculateNext(PlayerAI))
    //короче архитектура пока дерьмо.. надо переделывать, в бине делать такую бизнес логику не по фень-шую даже самому
    // индусскому
     //функция хода игрока (в нашем случае компьютера)
     public CellInfo doMove(Field gameField) throws AIException {
        //this.setGameField(gameField);
        //this.setCalculatingMoveSign(calculatingMoveSign);
        return artificialIntelligence.calculatingMove(gameField);

    }

}
