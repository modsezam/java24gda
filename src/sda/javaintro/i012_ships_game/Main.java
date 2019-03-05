package sda.javaintro.i012_ships_game;

import sda.javaintro.i012_ships_game.board.BoardModel;
import sda.javaintro.i012_ships_game.console.Console;


public class Main {

    public static void main(String[] args) {

        BoardModel boardModel = new BoardModel();

        boardModel.initializationBoard(10);


/*
        Console console = new Console();
        int[][] table = new int[9][9];

        console.drawShipBord(table);

        table[1][1] = 1;
        table[2][1] = 1;
        table[3][1] = 1;

        console.cls();
        console.drawShipBord(table);

        table[5][4] = 1;
        table[5][3] = 1;
        table[5][2] = 1;

        console.cls();
        console.drawShipBord(table);
*/



    }
}
