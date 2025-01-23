package com.tictactoe.TicTacToe.models;

import java.util.List;

public class Board {

    private int size;
    private List<List<cell>> board;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<cell>> board) {
        this.board = board;
    }
}
