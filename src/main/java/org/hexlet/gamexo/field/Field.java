package main.java.org.hexlet.gamexo.field;


import java.util.ArrayList;

public class Field {
    public static final int SIZE = 3;
    private int availableCells;
    private CellState[][] field;

    public Field(){
        this(SIZE);
    }

    public Field(int fieldSize) {

    }

    public CellState[][] getField() {
        return field;
    }

    public void setField(CellState[][] field) {
        this.field = field;
    }

}

