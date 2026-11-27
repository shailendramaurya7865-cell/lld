package org.example.Questions.TicTacToe;

public class Main {
    static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        String s = game.startGame();
        System.out.println("s = " + s);
    }
}
