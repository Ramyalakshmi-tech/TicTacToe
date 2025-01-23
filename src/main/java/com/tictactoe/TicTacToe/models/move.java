package com.tictactoe.TicTacToe.models;

public class move {
    private cell cell;
    private symbol symbol;

    public com.tictactoe.TicTacToe.models.cell getCell() {
        return cell;
    }

    public void setCell(com.tictactoe.TicTacToe.models.cell cell) {
        this.cell = cell;
    }

    public com.tictactoe.TicTacToe.models.symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(com.tictactoe.TicTacToe.models.symbol symbol) {
        this.symbol = symbol;
    }
}
