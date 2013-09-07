package org.hexlet.gamexo.ai;

/**
 * User: S.Rogachevsky
 * Date: 07.09.13
 * Time: 15:37
 */
public class Movement {
    private int x;
    private int y;


    public Movement(int x, int y){
        this.x = x;
        this.y = y;


    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
