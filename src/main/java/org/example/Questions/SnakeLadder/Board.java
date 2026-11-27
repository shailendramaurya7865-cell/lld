package org.example.Questions.SnakeLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;
    int boardSize;
    int snakeCount;
    int ladderCount;


    public Board(int boardSize, int snakeCount, int ladderCount) {
        this.boardSize = boardSize;
        this.snakeCount = snakeCount;
        this.ladderCount = ladderCount;

        initializeCells();
        addSnakesAndLadders(cells, snakeCount, ladderCount);
    }

    private void initializeCells() {
        cells = new Cell[boardSize][boardSize];
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    private void addSnakesAndLadders(Cell[][] cells, int numberOfSnake, int numberOfLadders) {
        while (numberOfLadders > 0) {
            System.out.println("ladderCount = " + ladderCount);
            int ladderStart = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            if (ladderStart >= ladderEnd) {
                continue;
            }
            System.out.println("ladderStart = " + ladderStart);
            System.out.println("ladderEnd = " + ladderEnd);
            Jump ladder = new Jump(ladderStart, ladderEnd);
            Cell cell = getCell(ladderStart);
            cell.jump = ladder;
            numberOfLadders--;
        }


        while (numberOfSnake > 0) {
            System.out.println("snakeCount = " + snakeCount);
            int snakeStart = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int snakeEnd = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            if (snakeStart <= snakeEnd) {
                continue;
            }
            System.out.println("snakeStart = " + snakeStart);
            System.out.println("snakeEnd = " + snakeEnd);
            Jump snake = new Jump(snakeStart, snakeEnd);
            Cell cell = getCell(snakeStart);
            cell.jump = snake;
            numberOfSnake--;
        }
    }

    public Cell getCell(int start) {
        int column = start % cells.length;
        int row = start / cells.length;
        return cells[row][column];
    }
}



