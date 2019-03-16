package sda.javaintro.i012_ships_game;

import java.util.Scanner;

public class SourceCode {

    private Player[] player;
    private String playerName;
    private int[] shipList;

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


    public boolean generateAllShipOnBoardComputer() {

        boolean state = false;

        for (int i = 0; i < player[1].getShipLength(); i++) {
            do {
                state = getAndDrawOneShipOnBoard(player[1].getShipNumber(i), 'c');
            }
            while (state == false);

        }
        console.consoleBoardDrawComputer();
        return true;
    }

    public boolean shootAllComputerShips() {


        while (player[0].getNumOffPoints() > 0 && player[1].getNumOffPoints() > 0){
            shootOneComputerShips();
            computerOneShotAlgorithm();
            System.out.println("Number of field to shoot:");
            System.out.println("YOU: " + player[0].getNumOffPoints() + ", COMPUTER: " + player[1].getNumOffPoints());
        }
        if (player[0].getNumOffPoints() == 0){
            return true;
        }
        if (player[1].getNumOffPoints() == 0){
            return false;
        }


        return true;
    }


    public void shootOneComputerShips() {
        int state = console.parseAndShootOneShipPositionComputer(scanner);
        if (state == 0) {
            System.out.println("Bad coordinate of field!");
        }
        if (state == 10) {
            player[0].deleteOneNumOffPoints();
        }
    }


    public void computerOneShotAlgorithm() {

        if (console.computerOneShotAlgorithm() == true) {
            player[1].deleteOneNumOffPoints();
        }
    }



    public boolean getAndDrawOneShipOnBoard(int shipSize, char playerTable) {

        if (console.parseAndDrawShipCreatePosition(scanner, shipSize, playerTable) == false) {
            if (playerTable == 'p') System.out.println("Bad coordinate off ship position! Please reenter.");
            return false;
        }
        return true;
    }

    public void setShipList (int[] shipList){
        this.shipList = shipList;
    }

    public void newGame() {

        console.printLogo();
        console.consoleBoardInitialization();
        player = new Player[2];
        player[0] = new Player(console.getName(scanner));
        player[1] = new Player("computer");

        player[0].setShipList(shipList);
        player[1].setShipList(shipList);

        player[1].setNumOffPoints(player[0].getNumOffPoints());

        player[0].calculateNumberOffAllPoints();
        player[1].calculateNumberOffAllPoints();

        System.out.println("\nInitialize empty ship border:");
        console.consoleBoardDrawPlayer();
        System.out.println("You must set the ships on the board: (to put ship type for example \"A 1 r\")");
        System.out.println("When \"A 1\" is first field and \"r\" is direction (r - right, d - down)");

    }


}
