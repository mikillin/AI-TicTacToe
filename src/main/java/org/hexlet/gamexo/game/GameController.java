package main.java.org.hexlet.gamexo.game;
import main.java.org.hexlet.gamexo.ai.AIException;
import main.java.org.hexlet.gamexo.field.*;
import main.java.org.hexlet.gamexo.player.*;


public class GameController {
    private FieldController fieldController;
    //2 игрока (нет в в диаграмме https://groups.google.com/group/hexlet_ai-team/attach/8b41548a9d2bf692/arch.asta?part=4&authuser=0&view=1)
    private Human human;
    private PlayerAI playerAI;

    //функция начала игры, здесь игроки поочереди совершают ходы
    public void startGame() throws AIException {
        //тут должен быть цикл, в котором игроки поочереди ходят, условия выхода из цика 1-победа, 2-кончились свободные клетки
        human.doMove();
        playerAI.doMove(this.getFieldController().getField());
    }

    public FieldController getFieldController() {
        return fieldController;
    }
}
