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

    public boolean drawAllShipOnBoard() {

        for (int i = 0; i < player[0].getShipLength(); i++){
            while (drawOneShipOnBoard(player[0].getShipNumber(i)) == false){
                drawOneShipOnBoard(player[0].getShipNumber(i));
            }
        }
        return true;

    }



    public boolean drawOneShipOnBoard(int shipSize) {

        if (console.parseShipPosition(scanner, shipSize) == false){
            System.out.println("Bad parse ship position!");
            return false;
        }
        return true;
    }



    public void newGame() {

        console.printLogo();
        console.consoleBoarInitialization();
        player = new Player[2];
        player[0] = new Player(console.getName(scanner));
        player[1] = new Player("computer");

        player[0].setShipList(new int[]{5, 4, 3, 2, 1});

        //int gameMode = console.getMode(scanner, player[0]);

        System.out.println("\nInitialize empty ship border:");
        console.consoleBordDraw();
        System.out.println("You must set the ships on the board: (to put ship type for example \"E 4 r\")");
        System.out.println("When \"E4\" is first field and \"r\" is direction (r - right, d - down)");

    }


}
