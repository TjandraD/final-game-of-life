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
        if (isAlive) {
            isAlive = neighbourList.length == 2 || neighbourList.length == 3;
        } else {
            isAlive = neighbourList.length == 3;
        }
    }
}
