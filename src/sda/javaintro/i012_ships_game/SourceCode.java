package sda.javaintro.i012_ships_game;

import java.util.Scanner;

public class SourceCode {

    private Player[] player;
    private String playerName;
    private int gameMode;

    Scanner scanner = new Scanner(System.in);

    Console console = new Console();

    public SourceCode() {

    }

    public boolean getAndDrawAllShipOnBoard() {

        boolean state = false;

        for (int i = 0; i < player[0].getShipLength(); i++) {
            do {
                state = getAndDrawOneShipOnBoard(player[0].getShipNumber(i), 'p');
            }
            while (state == false);

        }
        return true;

    }

    public boolean getAllShipOnBoardComputer(){

        boolean state = false;

        for (int i = 0; i < player[1].getShipLength(); i++){
//            while (getAndDrawOneShipOnBoard(player[1].getShipNumber(i), 'c') == false){
//                getAndDrawOneShipOnBoard(player[1].getShipNumber(i), 'c');
//            }
            do {
                state = getAndDrawOneShipOnBoard(player[1].getShipNumber(i), 'c');
            }
            while (state == false);

        }

        return true;
    }



    public boolean getAndDrawOneShipOnBoard(int shipSize, char playerTable) {

        if (console.parseAndDrawShipPosition(scanner, shipSize, playerTable) == false){
            System.out.println("Bad parse ship position!");
            return false;
        }
        return true;
    }



    public void newGame() {

        console.printLogo();
        console.consoleBoardInitialization();
        player = new Player[2];
        player[0] = new Player(console.getName(scanner));
        player[1] = new Player("computer");

        player[0].setShipList(new int[]{5, 4, 3 , 2});
        player[1] = player[0];

        //int gameMode = console.getMode(scanner, player[0]);

        System.out.println("\nInitialize empty ship border:");
        console.consoleBordDraw();
        System.out.println("You must set the ships on the board: (to put ship type for example \"E 4 r\")");
        System.out.println("When \"E4\" is first field and \"r\" is direction (r - right, d - down)");

    }


}
