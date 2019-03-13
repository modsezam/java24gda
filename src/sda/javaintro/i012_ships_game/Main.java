package sda.javaintro.i012_ships_game;


public class Main {

    public static void main(String[] args) {

        SourceCode game = new SourceCode();

        game.newGame();

        if (game.drawAllShipOnBoard() == true){

            System.out.println("\nYou put all ships on the board!");

        }




    }
}
