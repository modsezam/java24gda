package sda.javaintro.i012_ships_game;

import  java.util.Scanner;

public class SourceCode {

    private Player[] player;
    private String playerName;
    private int gameMode;
    private Scanner scaner;

    public SourceCode(){

    }

    public void newGame(){
        System.out.println(Constants.LOGO);

        scaner = new Scanner(System.in);

        System.out.println("\nWhat is your name?");
        playerName = scaner.next();

        player = new Player[2];
        player[0] = new Player(playerName);
        player[1] = new Player("computer");

        System.out.println("Hi " + playerName + ", choose game mode: (1 - You shoot, 2 - Computer shoot)");

        gameMode = scaner.nextInt();
        if (gameMode == 1){
            System.out.println("This game mode is not finished! Bye!");
        }
        else if (gameMode == 2){

            System.out.println("\nInitialization bord:");
            player[0].playerInitialization();
            player[0].boardDraw();

            System.out.println("\nYou must set the ships on the board: (to put ship type for example \"E 4 r\")");
            System.out.println("When \"E4\" is first field and \"r\" is direction (r - right, d - down)");

            player[0].setShips();
        }
        else {
            System.out.println("There is no game mode indicated! Bye!");
        }
    }



}
