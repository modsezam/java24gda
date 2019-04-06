package sda.javaintro.i012_ships_game;

import sda.javaintro.i012_ships_game.Constants;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();

        //choose number od ships
        game.setShipList(Constants.SHIP_QUANTITY);

        game.newGame();


        if (game.getAndDrawAllShipOnBoard()){

            System.out.println("\n###################################" +
                    "\n# You put all ships on the board! #" +
                    "\n###################################");
            System.out.println("\nComputer draws the location of ships ...");
            if (game.generateAllShipOnBoardComputer()){
                System.out.println("The location of ships is DONE! Position of the ships is hide!");
                if (game.shootAllComputerShips()){
                    System.out.println("\nYOU WIN!");
                } else {
                    System.out.println("\nComputer WIN!");
                }
            }
        }
    }
}
