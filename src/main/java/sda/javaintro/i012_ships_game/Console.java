package sda.javaintro.i012_ships_game;

import java.util.Random;
import java.util.Scanner;

public class Console {


    Console() {

    }

    private Board board = new Board();
    private Random generator = new Random();

    void printLogo() {
        System.out.println(Constants.LOGO);
    }

    public String getName(Scanner scanner) {
        System.out.println("\nWhat is your name?");
        return scanner.nextLine();
    }

    void consoleBoardInitialization() {
        board.boardInitialization(board.getBordTablePlayer());
        board.boardInitialization(board.getBordTableComputer());
    }

    void consoleBoardDrawPlayer() {
        board.boardDraw(board.bordTablePlayer, Constants.PLAYER_TABLE_MODE);
    }

    void consoleBoardDrawComputer() {
        board.boardDraw(board.bordTableComputer, Constants.COMPUTER_TABLE_MODE);
    }

    boolean parseAndDrawShipCreatePosition(Scanner scanner, int shipSize, char playerTable) {

        String parseText = "";

        if (playerTable == 'p') {
            System.out.println("\nEnter the position of the ship ( size " + shipSize + "):");
            parseText = scanner.nextLine();
        }

        if (playerTable == 'c') {
            parseText = getRandomParse(true);
        }

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
                        if (direction == 0) {
                            return false;
                        }
                    }
                } else {
                    if (parseText.charAt(2) == '1' && parseText.charAt(3) == '0') {
                        positionY = 9;
                        direction = parseDirection(parseText, 5);
                        if (direction == 0) {
                            return false;
                        }
                    }
                }
            }
        }
        if (playerTable == 'p') {
            if (board.drawShip(positionX, positionY, direction, shipSize, board.getBordTablePlayer())) {
                board.boardDraw(board.bordTablePlayer, 'v');
            } else return false;
        }
        if (playerTable == 'c') {
            return board.drawShip(positionX, positionY, direction, shipSize, board.getBordTableComputer());
        }
        return true;
    }

    int parseAndShootOneShipPositionComputer(Scanner scanner) {

        String parseText;

        System.out.println("\nEnter the the field witch you shoot (for example A 1):");
        parseText = scanner.nextLine();


        int textFirstIndex = parseText.indexOf(' ');
        int positionX;
        int positionY;

        if (parseText.length() >= 3 && parseText.length() <= 4) {

            if (textFirstIndex == 1) {

                if (Character.toLowerCase(parseText.charAt(0)) >= 'a' && Character.toLowerCase(parseText.charAt(0)) <= 'j') {
                    positionX = (int) Character.toLowerCase(parseText.charAt(0)) - 97;
                } else return 0;
                if (parseText.charAt(2) >= 49 && parseText.charAt(2) <= 58 && parseText.length() == 3) {
                    positionY = (int) parseText.charAt(2) - 49;
                } else if (parseText.length() == 4 && parseText.charAt(2) == 49 && parseText.charAt(3) == 48) {
                    positionY = 9;
                } else return 0;

            } else return 0;
        } else return 0;

        if (board.checkAndSetComputerField(positionX, positionY)) {
            board.boardDraw(board.getBordTableComputer(), Constants.COMPUTER_TABLE_MODE);
            return 10;
        } else {
            //board draw - hide mode (change in Constants)
            board.boardDraw(board.getBordTableComputer(), Constants.COMPUTER_TABLE_MODE);
        }

        return 1;
    }


    private String getRandomParse(boolean addDirection) {

        // get random first field (a - j) (97 - 106)
        char randomFirstField;
        randomFirstField = (char) (generator.nextInt(9) + 97);

        // get random second field (0 - 9)
        int randomSecondField;
        randomSecondField = generator.nextInt(9) + 1;
        if (addDirection) {
            //get random third field (r, d, l, u)
            int randomThirdFieldIndex = generator.nextInt(3);
            char randomThirdField = ' ';

            if (randomThirdFieldIndex == 0) randomThirdField = 'r';
            if (randomThirdFieldIndex == 1) randomThirdField = 'd';
            if (randomThirdFieldIndex == 2) randomThirdField = 'l';
            if (randomThirdFieldIndex == 3) randomThirdField = 'u';

            return randomFirstField + " " + randomSecondField + " " + randomThirdField;
        } else {
            return randomFirstField + " " + randomSecondField;
        }
    }

    private int parseDirection(String string, int parseIndex) {
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

    private boolean parseAndShootOneShipPositionPlayer(String parseText) {

        int textFirstIndex = parseText.indexOf(' ');
        int positionX;
        int positionY;

        if (parseText.length() >= 3 && parseText.length() <= 4) {

            if (textFirstIndex == 1) {

                if (Character.toLowerCase(parseText.charAt(0)) >= 'a' && Character.toLowerCase(parseText.charAt(0)) <= 'j') {
                    positionX = (int) Character.toLowerCase(parseText.charAt(0)) - 97;
                } else return false;
                if (parseText.charAt(2) >= 49 && parseText.charAt(2) <= 58 && parseText.length() == 3) {
                    positionY = (int) parseText.charAt(2) - 49;
                } else if (parseText.length() == 4 && parseText.charAt(2) == 49 && parseText.charAt(3) == 48) {
                    positionY = 9;
                } else return false;

            } else return false;
        } else return false;

        System.out.print("\nComputer shot: (" + parseText.toUpperCase() + "). ");

        return board.checkAndSetPlayerField(positionX, positionY);

    }

    boolean computerOneShotAlgorithm() {
        String randomParse;
        int[] coordinates;
        int x;
        int y;

        coordinates = board.algorithmToFindNextFieldToShot();

        if (coordinates[0] < 0 || coordinates[1] < 0){
            do {
                x = generator.nextInt(Constants.BOARD_SIZE - 1);
                y = generator.nextInt(Constants.BOARD_SIZE - 1);
                randomParse = (char)(x + 97) + " " + (y + 1);
                //System.out.println("log> randomParse RANDOM: " + randomParse);
            } while (!board.checkPlayerHitMissPoint(x, y));
        }
        else {
            randomParse = (char)(coordinates[0] + 97) + " " + (coordinates[1] + 1);
            //System.out.println("log> randomParse: " + randomParse);
        }


        if (parseAndShootOneShipPositionPlayer(randomParse)) {
            board.boardDraw(board.getBordTablePlayer(), 'v');

            return true;
        }
        board.boardDraw(board.getBordTablePlayer(), 'v');

        return false;
    }

}
