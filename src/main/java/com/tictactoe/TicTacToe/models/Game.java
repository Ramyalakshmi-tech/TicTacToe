package com.tictactoe.TicTacToe.models;

import com.tictactoe.TicTacToe.strategies.winningStrategy;

import java.util.List;

public class Game {
    private List<player> players;
    private Board board;
    private List<move> moves;

    public List<player> getPlayers() {
        return players;
    }

    public void setPlayers(List<player> players) {
        this.players = players;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<move> getMoves() {
        return moves;
    }

    public void setMoves(List<move> moves) {
        this.moves = moves;
    }

    public List<winningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<winningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public player getWinner() {
        return winner;
    }

    public void setWinner(player winner) {
        this.winner = winner;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public Gamestate getGamestate() {
        return gamestate;
    }

    public void setGamestate(Gamestate gamestate) {
        this.gamestate = gamestate;
    }

    List<winningStrategy> winningStrategies;
    private player winner;
    private int nextPlayerIndex;
    private Gamestate gamestate;


}
