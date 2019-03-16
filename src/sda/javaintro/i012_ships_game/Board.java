package sda.javaintro.i012_ships_game;

import java.util.List;
public class Board {


    char[][] bordTable;
    char[][] bordTableComputer;

    public Board() {

        this.bordTable = new char[Constants.BOARD_SIZE][Constants.BOARD_SIZE];
        this.bordTableComputer = new char[Constants.BOARD_SIZE][Constants.BOARD_SIZE];

    }

    public char[][] getBordTable() {
        return bordTable;
    }

    public char[][] getBordTableComputer() {
        return bordTableComputer;
    }

    public void boardInitialization(char[][] bordTable) {
        for (int i = 0; i < Constants.BOARD_SIZE; i++) {
            for (int j = 0; j < Constants.BOARD_SIZE; j++) {
                bordTable[i][j] = Constants.EMPTY_POINT;
            }
        }
    }


    public boolean drawShip(int positionX, int positionY, int direction, int shipSize, char[][] bordTable) {
        //draw the ship to the right
        if (direction == 1) {
            if (checkShipDrawError(positionX, positionY, 1, 0, shipSize, bordTable) == true) {
                checkDirectionAndDraw(positionX, positionY, 1, 0, shipSize, bordTable);
            } else return false;
        }
        //draw the ship to down
        else if (direction == 2) {
            if (checkShipDrawError(positionX, positionY, 0, 1, shipSize, bordTable) == true) {
                checkDirectionAndDraw(positionX, positionY, 0, 1, shipSize, bordTable);
            } else return false;
        }
        //draw the ship to left
        else if (direction == 3) {
            if (checkShipDrawError(positionX, positionY, -1, 0, shipSize, bordTable) == true) {
                checkDirectionAndDraw(positionX, positionY, -1, 0, shipSize, bordTable);
            } else return false;
        }
        //draw the ship to up
        else if (direction == 4) {
            if (checkShipDrawError(positionX, positionY, 0, -1, shipSize, bordTable) == true) {
                checkDirectionAndDraw(positionX, positionY, 0, -1, shipSize, bordTable);
            } else return false;
        } else return false;

        return true;

    }

    private void drawPoint(int positionX, int positionY, char[][] bordTable) {
        bordTable[positionY][positionX] = Constants.SHIP_POINT;
    }

    private boolean checkShipDrawError(int positionX, int positionY, int shiftX, int shiftY, int shipSize, char[][] bordTable) {
        for (int i = 0; i < shipSize; i++) {

            if ((positionX + i * shiftX) >= Constants.BOARD_SIZE || (positionX + i * shiftX) < 0) {
                //System.out.println("There is conflict! Correct your indication.");
                return false;
            } else if ((positionY + i * shiftY) >= Constants.BOARD_SIZE || (positionY + i * shiftY) < 0) {
                //System.out.println("There is conflict! Correct your indication.");
                return false;
            } else if (bordTable[positionY + i * shiftY][positionX + i * shiftX] == Constants.SHIP_POINT) {
                //System.out.println("There is conflict! Correct your indication.");
                return false;
            }
        }
        return true;
    }

    private void checkDirectionAndDraw(int positionX, int positionY, int shiftX, int shiftY, int shipSize, char[][] bordTable) {
        for (int i = 0; i < shipSize; i++) {
            drawPoint(positionX + i * shiftX, positionY + i * shiftY, bordTable);
        }
    }

    public void boardDraw(char[][] boardTable, char tableMode) {
        bordDrawFirstLine();
        bordDrawMainsLine(boardTable, tableMode);
    }

    private void bordDrawFirstLine() {
        char a = 'A';
        System.out.print(" *");
        for (int i = 0; i < Constants.BOARD_SIZE; i++) {
            System.out.print("|" + a);
            a += 1;
        }
        System.out.println("|");
    }

    private void bordDrawMainsLine(char[][] boardTable, char tableMode) {
        int a = 1;
        for (int i = 0; i < Constants.BOARD_SIZE; i++) {
            if (a < 10)
                System.out.print(" " + a);
            if (a == 10)
                System.out.print(a);
            for (int j = 0; j < Constants.BOARD_SIZE; j++) {
                if (boardTable[i][j] == Constants.SHIP_POINT && tableMode == 'h') {
                    System.out.print("| ");
                } else {
                    System.out.print("|" + boardTable[i][j]);

                }

            }
            System.out.println("|");
            a += 1;
        }
    }

    public boolean checkAndSetComputerField(int x, int y) {
        if (bordTableComputer[y][x] == Constants.SHIP_IS_HIT_POINT) {
            System.out.println("You already choose this field! (HIT POINT)\nThe queue is gone!\n");
            return false;
        } else if (bordTableComputer[y][x] == Constants.SHIP_MISS_POINT) {
            System.out.println("You already choose this field! (MISS POINT)\nThe queue is gone!\n");
            return false;
        } else if (bordTableComputer[y][x] == Constants.SHIP_POINT) {
            System.out.println("You HIT!\n");
            bordTableComputer[y][x] = Constants.SHIP_IS_HIT_POINT;
            return true;
        } else {
            System.out.println("You do not HIT!\n");
            bordTableComputer[y][x] = Constants.SHIP_MISS_POINT;
        }
        return false;
    }

    public boolean checkPlayerHitMissPoint(int x, int y) {
        if (bordTable[y][x] == Constants.SHIP_IS_HIT_POINT) {
            return false;
        } else if (bordTable[y][x] == Constants.SHIP_MISS_POINT) {
            return false;
        }

        return true;
    }

    public boolean checkAndSetPlayerField(int x, int y) {
        if (bordTable[y][x] == Constants.SHIP_IS_HIT_POINT) {
            System.out.println("Computer already choose this field! (HIT POINT)\nThe queue is gone!\n");
            return false;
        } else if (bordTable[y][x] == Constants.SHIP_MISS_POINT) {
            System.out.println("Computer already choose this field! (MISS POINT)\nThe queue is gone!\n");
            return false;
        } else if (bordTable[y][x] == Constants.SHIP_POINT) {
            System.out.println("Computer HIT!");
            bordTable[y][x] = Constants.SHIP_IS_HIT_POINT;
            return true;
        } else {
            System.out.println("Computer do not HIT!");
            bordTable[y][x] = Constants.SHIP_MISS_POINT;
        }
        return false;
    }

    public int[] algorithmToFindNextFieldToShot() {

        int[] result = {-1, -1};
        int shipAtCoordinatesX;
        int shipAtCoordinatesY;

        for (int y = 0; y < Constants.BOARD_SIZE; y++)
            for (int x = 0; x < Constants.BOARD_SIZE; x++) {
                shipAtCoordinatesX = 0;
                shipAtCoordinatesY = 0;

                if (bordTable[y][x] == Constants.SHIP_IS_HIT_POINT) {
                    // x + 1
                    for (int i = 1; i < 10; i++) {
                        if ((x + i) < 10 && bordTable[y][x + i] == Constants.SHIP_IS_HIT_POINT) {
                            if ( i == 1 ) {
                                shipAtCoordinatesX = 1;
                            }
                            continue;
                        } else if ((x + i) < 10 && bordTable[y][x + i] == Constants.SHIP_MISS_POINT) {
                            break;
                        } else if (x + i >= 10){
                            break;
                        }
                        else {
                            result[0] = x + i;
                            result[1] = y;
                            System.out.println("log> Result x: " + (x + i) + ", y: " + y);
                            return result;
                        }
                    }
                    // y + 1
                    for (int i = 1; i < 10; i++) {
                        if ((y + i) < 10 && bordTable[y + i][x] == Constants.SHIP_IS_HIT_POINT) {

                            if ( i == 1 ) {
                                shipAtCoordinatesY = 1;
                            }
                            continue;
                        } else if ((y + i) < 10 && bordTable[y + i][x] == Constants.SHIP_MISS_POINT || shipAtCoordinatesX == 1) {
                            break;
                        } else if (y + i >= 10){
                            break;
                        }
                        else {
                            result[0] = x;
                            result[1] = y + i;
                            System.out.println("log> Result x: " + (x) + ", y: " + (y + i));
                            return result;
                        }
                    }
                    // x - 1
                    for (int i = 1; i < 10; i++) {
                        if ((x - i) >= 0 && bordTable[y][x - i] == Constants.SHIP_IS_HIT_POINT) {
                            if ( i == 1 ) {
                                shipAtCoordinatesX = 1;
                            }
                            continue;
                        } else if ((x - i) >= 0 && bordTable[y][x - i] == Constants.SHIP_MISS_POINT || shipAtCoordinatesY == 1) {
                            break;
                        } else if (x - i < 0){
                            break;
                        }
                        else {
                            result[0] = x - i;
                            result[1] = y;
                            System.out.println("log> Result x: " + (x - i) + ", y: " + y);
                            return result;
                        }
                    }
                    // y - 1
                    for (int i = 1; i < 10; i++) {
                        if ((y - i) >= 0 && bordTable[y - i][x] == Constants.SHIP_IS_HIT_POINT) {
                            continue;
                        } else if ((y - i) >= 0 && bordTable[y - i][x] == Constants.SHIP_MISS_POINT || shipAtCoordinatesX == 1) {
                            break;
                        } else if (y - i < 0){
                            break;
                        }
                        else {
                            result[0] = x;
                            result[1] = y - i;
                            System.out.println("log> Result x: " + (x) + ", y: " + (y - i));
                            return result;
                        }
                    }

                }
            }
        return result;
    }

}
