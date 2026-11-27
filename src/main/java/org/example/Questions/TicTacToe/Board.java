package org.example.Questions.TicTacToe;

import org.example.Questions.SnakeLadder.Pair;

import java.util.ArrayList;
import java.util.List;

public class Board {
    int size;
    PlayerPiece[][] board;

    public Board(int size) {
        this.size = size;
        board = new PlayerPiece[size][size];
    }

    public boolean addPiece(int row, int column, Player playerTurn) {
        if (board[row][column] != null) {
            return false;
        }
        board[row][column] = playerTurn.playerPiece;
        return true;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {
                PlayerPiece piece = board[i][j];

                String value = " ";
                if (piece != null) {
                    value = piece.pieceType.name();
                }

                System.out.print(" " + value + " ");

                if (j < size - 1) {
                    System.out.print("|");
                }
            }

            System.out.println();

            if (i < size - 1) {
                for (int j = 0; j < size; j++) {
                    System.out.print("---");
                    if (j < size - 1) {
                        System.out.print("+");
                    }
                }
                System.out.println();
            }
        }
    }

    public List<Pair<Integer, Integer>> getFreeCells() {
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                // 2. Check your "free" condition (e.g., 0, '.', true, or null)
                if (board[row][col] == null) {
                    freeCells.add(new Pair<>(row, col));
                }
            }
        }
        return freeCells;

    }
}
