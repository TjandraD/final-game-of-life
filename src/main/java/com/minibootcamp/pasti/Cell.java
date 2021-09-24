package com.minibootcamp.pasti;

public class Cell {
    private boolean isAlive;

    public boolean isAlive() {
        return isAlive;
    }

    public Cell(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public void decideIsAlive(Cell[] neighbourList) {
        isAlive = false;
    }
}
