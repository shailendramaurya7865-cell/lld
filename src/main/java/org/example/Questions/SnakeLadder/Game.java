package org.example.Questions.SnakeLadder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> playerList = new LinkedList<>();
    Player winner;

    Game() {
        initializeGame();
    }

    private void initializeGame() {
        board = new Board(10, 5, 4);
        dice = new Dice(1);
        winner = null;
        addPlayers();

    }

    private void addPlayers() {
        Player player1 = new Player("p1", 0);
        Player player2 = new Player("p2", 0);
        playerList.add(player1);
        playerList.add(player2);
    }

    public void startGame() {
        while (winner == null) {
            Player playerTurn = findPlayerTurn();
            System.out.println("player turn is : = " + playerTurn.getPlayerId() + " current position :" + playerTurn.getCurrentPosition());

            int diceNumbers = dice.rollDice();
            int playerNewPosition = playerTurn.getCurrentPosition() + diceNumbers;
            playerNewPosition = jumpCheck(playerNewPosition);
            playerTurn.setCurrentPosition(playerNewPosition);
            System.out.println("player turn is : = " + playerTurn.getPlayerId() + " new  position :" + playerTurn.getCurrentPosition());

            if (playerNewPosition >= board.cells.length * board.cells.length - 1) {
                winner = playerTurn;
            }

        }
        System.out.println("Winner is  = "  + winner.getPlayerId());
    }

    private int jumpCheck(int playerNewPosition) {
        if (playerNewPosition > board.cells.length * board.cells.length - 1) {
            return playerNewPosition;
        }
        Cell cell = board.getCell(playerNewPosition);
        if (cell.jump != null && cell.jump.getStart() == playerNewPosition) {
            String jumpBy = cell.jump.getStart() < cell.jump.getEnd() ? "ladder" : "snake";
            System.out.println("jump done by = " + jumpBy);
            return cell.jump.getEnd();
        }
        return playerNewPosition;
    }

    private Player findPlayerTurn() {
        Player playerTurn = playerList.removeFirst();
        playerList.addLast(playerTurn);
        return playerTurn;
    }
}
