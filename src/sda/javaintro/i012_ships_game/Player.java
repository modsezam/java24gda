package sda.javaintro.i012_ships_game;

import sda.javaintro.i012_ships_game.Board;

public class Player {

    String playerName;
    Board board = new Board();

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public void playerInitialization(){
        this.board.boardInitialization();
    }

    public void boardDraw(){
        board.boardDraw();
    }

    public void setShips(){
        //obsługa dodawania statków
    }


}
