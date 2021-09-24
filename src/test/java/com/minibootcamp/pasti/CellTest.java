package com.minibootcamp.pasti;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CellTest {

    @Test
    public void isAlive_ReturnFalse_LiveCellWithOneAliveNeighbour() {
        Cell mainCell = new Cell(true);
        Cell aliveNeighbour = new Cell(true);
        Cell[] neighbourList = {aliveNeighbour};

        mainCell.decideIsAlive(neighbourList);

        assertFalse(mainCell.isAlive());
    }

    @Test
    public void isAlive_ReturnTrue_LiveCellWithTwoAliveNeighbour() {
        Cell mainCell = new Cell(true);
        Cell aliveNeighbour = new Cell(true);
        Cell[] neighbourList = {aliveNeighbour, aliveNeighbour};

        mainCell.decideIsAlive(neighbourList);

        assertTrue(mainCell.isAlive());
    }
}
