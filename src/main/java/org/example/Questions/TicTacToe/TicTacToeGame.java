package org.example.Questions.TicTacToe;

import org.example.Questions.SnakeLadder.Pair;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    Board gamingBoard;
    Deque<Player> players;

    public TicTacToeGame() {
        initializeGame();
    }

    private void initializeGame() {
        gamingBoard = new Board(3);
        players = new LinkedList<>();
        players.add(new Player("player1", new PlayerPieceX()));
        players.add(new Player("player2", new PlayerPieceO()));
    }

    public String startGame() {
        boolean noWinner = true;
        while (noWinner) {
            Player playerTurn = players.removeFirst();


            gamingBoard.printBoard();

            List<Pair<Integer, Integer>> freeCells = gamingBoard.getFreeCells();
            if (freeCells.isEmpty()) {
                noWinner = false;
                continue;
            }
            System.out.println(playerTurn.id + " Enter row,column : ");

            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] split = s.split(",");
            int row = Integer.parseInt(split[0].trim());
            int column = Integer.parseInt(split[1].trim());

            boolean isPieceAdded = gamingBoard.addPiece(row, column, playerTurn);
            if (!isPieceAdded) {
                System.out.println("incorrect position");
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(row, column, playerTurn.playerPiece);
            if (winner) {
                gamingBoard.printBoard();
                return playerTurn.id;
            }

        }

        return "tie";
    }

    private boolean isThereWinner(int row, int column, PlayerPiece playerPiece) {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;
        for (int i = 0; i < gamingBoard.size; i++) {
            if (gamingBoard.board[row][i] == null || gamingBoard.board[row][i].pieceType != playerPiece.pieceType) {
                rowMatch = false;
                break;
            }
        }

        for (int i = 0; i < gamingBoard.size; i++) {
            if (gamingBoard.board[i][column] == null || gamingBoard.board[i][column].pieceType != playerPiece.pieceType) {
                columnMatch = false;
                break;
            }
        }

        for (int i = 0, j = gamingBoard.size - 1; i < gamingBoard.size; i++, j--) {
            if (gamingBoard.board[i][j] == null || gamingBoard.board[i][j].pieceType != playerPiece.pieceType) {
                antiDiagonalMatch = false;
                break;
            }
        }

        for (int i = 0, j = 0; i < gamingBoard.size; i++, j++) {
            if (gamingBoard.board[i][j] == null || gamingBoard.board[i][j].pieceType != playerPiece.pieceType) {
                diagonalMatch = false;
                break;
            }
        }
        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}
