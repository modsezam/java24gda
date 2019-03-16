package sda.javaintro.i012_ships_game;

import java.util.Random;
import java.util.Scanner;

public class Console {


    public Console() {

    }

    Board board = new Board();
    Random generator = new Random();

    public void printLogo() {
        System.out.println(Constants.LOGO);
    }

    public String getName(Scanner scanner) {
        System.out.println("\nWhat is your name?");
        return scanner.nextLine();
    }

    public void consoleBoardInitialization() {
        board.boardInitialization(board.getBordTable());
        board.boardInitialization(board.getBordTableComputer());
    }

    public void consoleBoardDrawPlayer() {
        board.boardDraw(board.bordTable, 'v');
    }

    public void consoleBoardDrawComputer() {
        board.boardDraw(board.bordTableComputer, Constants.COMPUTER_TABLE_MODE);
    }

    public boolean parseAndDrawShipCreatePosition(Scanner scanner, int shipSize, char playerTable) {

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
                } else if (textLastIndex == 4) {
                    if (parseText.charAt(2) == '1' && parseText.charAt(3) == '0') {
                        positionY = 9;
                        direction = parseDirection(parseText, 5);
                        if (direction == 0) {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
        }
        if (playerTable == 'p') {
            if (board.drawShip(positionX, positionY, direction, shipSize, board.getBordTable()) == true) {
                board.boardDraw(board.bordTable, 'v');
            } else return false;
        }
        if (playerTable == 'c') {
            if (board.drawShip(positionX, positionY, direction, shipSize, board.getBordTableComputer()) == true) {
            } else return false;
        }
        return true;
    }

    public int parseAndShootOneShipPositionComputer(Scanner scanner) {

        String parseText;

        System.out.println("\nEnter the the field witch you shoot (for example A 1):");
        parseText = scanner.nextLine();


        int textFirstIndex = parseText.indexOf(' ');
        int positionX = 0;
        int positionY = 0;

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

        if (board.checkAndSetComputerField(positionX, positionY) == true) {
            board.boardDraw(board.getBordTableComputer(), Constants.COMPUTER_TABLE_MODE);
            return 10;
        } else {
            //board draw - hide mode (change in Constants)
            board.boardDraw(board.getBordTableComputer(), Constants.COMPUTER_TABLE_MODE);
        }

        return 1;
    }


    public String getRandomParse(boolean addDirection) {

        // get random first field (a - j) (97 - 106)
        char randomFirstField;
        randomFirstField = (char) (generator.nextInt(9) + 97);

        // get random second field (0 - 9)
        int randomSecondField;
        randomSecondField = generator.nextInt(9) + 1;
        if (addDirection == true) {
            //get random third field (r, d, l, u)
            int randomThirdFieldIndex = generator.nextInt(3);
            char randomThirdField = ' ';

            if (randomThirdFieldIndex == 0) randomThirdField = 'r';
            if (randomThirdFieldIndex == 1) randomThirdField = 'd';
            if (randomThirdFieldIndex == 2) randomThirdField = 'l';
            if (randomThirdFieldIndex == 3) randomThirdField = 'u';

            String randomParse = randomFirstField + " " + randomSecondField + " " + randomThirdField;
            return randomParse;
        } else {
            String randomParse = randomFirstField + " " + randomSecondField;
            return randomParse;
        }
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

    public boolean parseAndShootOneShipPositionPlayer(String parseText) {

        int textFirstIndex = parseText.indexOf(' ');
        int positionX = 0;
        int positionY = 0;

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

        System.out.println("\nComputer shot: " + parseText.toUpperCase());

        if (board.checkAndSetPlayerField(positionX, positionY) == true) {
            //board.boardDraw(board.getBordTableComputer(), Constants.COMPUTER_TABLE_MODE);
            return true;
        }

        return false;
    }

    public boolean computerOneShotAlgorithm() {
        String randomParse = " ";
        int[] coordinates;
        int x = 0;
        int y = 0;

        coordinates = board.algorithmToFindNextFieldToShot();

        if (coordinates[0] < 0 || coordinates[1] < 0){
            do {
                x = generator.nextInt(Constants.BOARD_SIZE - 1);
                y = generator.nextInt(Constants.BOARD_SIZE - 1);
                randomParse = (char)(x + 97) + " " + (y + 1);
                System.out.println("log> randomParse RANDOM: " + randomParse);
            } while (board.checkPlayerHitMissPoint(x, y) == false);
        }
        else {
            randomParse = (char)(coordinates[0] + 97) + " " + (coordinates[1] + 1);
            System.out.println("log> randomParse: " + randomParse);
        }


        if (parseAndShootOneShipPositionPlayer(randomParse) == true) {
            board.boardDraw(board.getBordTable(), 'v');

            return true;
        }
        board.boardDraw(board.getBordTable(), 'v');

        return false;
    }

}
