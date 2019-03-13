package sda.javaintro.i012_ships_game;

import java.util.Scanner;

public class Console {


    public Console() {

    }
    Board board = new Board();

    private int gameMode;

    public boolean parseShipPosition(Scanner scanner, int shipSize) {
        System.out.println("\nEnter the position of the ship ( size " + shipSize + "):");
        String parseText = scanner.nextLine();
        int textFirstIndex = parseText.indexOf(' ');
        int textLastIndex = parseText.lastIndexOf(' ');
        int positionX = 0;
        int positionY = 0;
        int direction = 0;


        if (parseText.length() >= 5 && parseText.length() <= 6) {

            if (textFirstIndex == 1 && (textLastIndex == 3 || textLastIndex == 4)) {

                if (Character.toLowerCase(parseText.charAt(0)) >= 'a' && Character.toLowerCase(parseText.charAt(0)) <= 'j') {
                    positionX = (int) Character.toLowerCase(parseText.charAt(0)) - 97;
                } else {
                    return false;
                }
                if (textLastIndex == 3) {
                    if (parseText.charAt(2) >= 49 && parseText.charAt(2) <= 58) {
                        positionY = (int) parseText.charAt(2) - 49;

                        direction = parseDirection(parseText, 4);
                        if (direction == 0){
                            return false;
                        }

                    }

                } else {
                    return false;
                }
            } else if (textLastIndex == 4) {
                if (parseText.charAt(2) == '1' && parseText.charAt(3) == '0') {
                    positionY = 9;
                    direction = parseDirection(parseText, 5);
                    if (direction == 0){
                        return false;
                    }

                }
            } else {
                return false;
            }


        }

        if (board.drawShip(positionX, positionY, direction, shipSize) == true){
            board.boardDraw();
        }
        else return false;

        return true;
    }

    public void consoleBoarInitialization(){
        board.boardInitialization();


    }

    public void consoleBordDraw(){
        board.boardDraw();
    }

    public void printLogo() {
        System.out.println(Constants.LOGO);
    }


    public String getName(Scanner scanner) {

        System.out.println("\nWhat is your name?");
        return scanner.nextLine();
    }


    public int getMode(Scanner scanner, Player player) {

        System.out.println("Hi " + player.getPlayerName() + ", choose game mode: (1 - Computer shoot, 2 - You shoot)");
        gameMode = scanner.nextInt();
        scanner.nextLine();
        if (gameMode == 1) {
            return 1;
        } else if (gameMode == 2) {
            System.out.println("This game mode is not finished! Bye!");
            return 2;
        }
        System.out.println("There is bad game mode indicated! Game mode set to default 1.");
        return 1;
    }

    public int parseDirection(String string, int parseIndex) {
        if (string.toLowerCase().charAt(parseIndex) == 'r') {
            return 1;
        } else if (string.toLowerCase().charAt(parseIndex) == 'd') {
            return 2;
        } else if (string.toLowerCase().charAt(parseIndex) == 'l') {
            return 3;
        } else if (string.toLowerCase().charAt(parseIndex) == 'u') {
            return 4;
        }
        return 0;
    }



}
