package sda.javaintro.i012_ships_game;

class Board {


    char[][] bordTablePlayer;
    char[][] bordTableComputer;

    Board() {

        this.bordTablePlayer = new char[Constants.BOARD_SIZE][Constants.BOARD_SIZE];
        this.bordTableComputer = new char[Constants.BOARD_SIZE][Constants.BOARD_SIZE];

    }

    char[][] getBordTablePlayer() {
        return bordTablePlayer;
    }

    char[][] getBordTableComputer() {
        return bordTableComputer;
    }

    void boardInitialization(char[][] bordTable) {
        for (int i = 0; i < Constants.BOARD_SIZE; i++) {
            for (int j = 0; j < Constants.BOARD_SIZE; j++) {
                bordTable[i][j] = Constants.EMPTY_POINT;
            }
        }
    }

    boolean drawShip(int positionX, int positionY, int direction, int shipSize, char[][] bordTable) {
        //draw the ship to the right
        if (direction == 1) {
            if (checkShipDrawError(positionX, positionY, 1, 0, shipSize, bordTable)) {
                checkDirectionAndDraw(positionX, positionY, 1, 0, shipSize, bordTable);
            } else return false;
        }
        //draw the ship to down
        else if (direction == 2) {
            if (checkShipDrawError(positionX, positionY, 0, 1, shipSize, bordTable)) {
                checkDirectionAndDraw(positionX, positionY, 0, 1, shipSize, bordTable);
            } else return false;
        }
        //draw the ship to left
        else if (direction == 3) {
            if (checkShipDrawError(positionX, positionY, -1, 0, shipSize, bordTable)) {
                checkDirectionAndDraw(positionX, positionY, -1, 0, shipSize, bordTable);
            } else return false;
        }
        //draw the ship to up
        else if (direction == 4) {
            if (checkShipDrawError(positionX, positionY, 0, -1, shipSize, bordTable)) {
                checkDirectionAndDraw(positionX, positionY, 0, -1, shipSize, bordTable);
            } else return false;
        } else return false;

        return true;
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
    private void drawPoint(int positionX, int positionY, char[][] bordTable) {
        bordTable[positionY][positionX] = Constants.SHIP_POINT;
    }


    void boardDraw(char[][] boardTable, char tableMode) {
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

    boolean checkAndSetComputerField(int x, int y) {
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

    boolean checkPlayerHitMissPoint(int x, int y) {
        if (bordTablePlayer[y][x] == Constants.SHIP_IS_HIT_POINT) {
            return false;
        } else return bordTablePlayer[y][x] != Constants.SHIP_MISS_POINT;

    }

    boolean checkAndSetPlayerField(int x, int y) {
        if (bordTablePlayer[y][x] == Constants.SHIP_IS_HIT_POINT) {
            System.out.println("Computer already choose this field! (HIT POINT)\nThe queue is gone!\n");
            return false;
        } else if (bordTablePlayer[y][x] == Constants.SHIP_MISS_POINT) {
            System.out.println("Computer already choose this field! (MISS POINT)\nThe queue is gone!\n");
            return false;
        } else if (bordTablePlayer[y][x] == Constants.SHIP_POINT) {
            System.out.println("Computer HIT!");
            bordTablePlayer[y][x] = Constants.SHIP_IS_HIT_POINT;
            return true;
        } else {
            System.out.println("Computer do not HIT!");
            bordTablePlayer[y][x] = Constants.SHIP_MISS_POINT;
        }
        return false;
    }

    int[] algorithmToFindNextFieldToShot() {

        int[] result;
        int[] shipAtAxisXY = new int[2];

        for (int y = 0; y < Constants.BOARD_SIZE; y++)
            for (int x = 0; x < Constants.BOARD_SIZE; x++) {

                shipAtAxisXY[0] = 0;
                shipAtAxisXY[1] = 0;

                if (bordTablePlayer[y][x] == Constants.SHIP_IS_HIT_POINT) {

                    // find the direction to shoot
                    shipAtAxisXY = findShipPositionOnAxisXY(x, y);

                    // x + 1 (right)
                    result = findNextFieldToShot(x, y, 1, 0, shipAtAxisXY[1]);
                    if (result != null) return result;

                    // y + 1 (down)
                    result = findNextFieldToShot(x, y, 0, 1, shipAtAxisXY[0]);
                    if (result != null) return result;

                    // x - 1 (left)
                    result = findNextFieldToShot(x, y, -1, 0, shipAtAxisXY[1]);
                    if (result != null) return result;

                    // y - 1 (up)
                    result = findNextFieldToShot(x, y, 0, -1, shipAtAxisXY[0]);
                    if (result != null) return result;
                }
            }
        return new int[]{-1, -1};
    }

    private int[] findShipPositionOnAxisXY(int x, int y) {

        int[] shipAtCoordinatesXY = {0, 0};

        // find the direction to shoot
        if ((x + 1) < 10 && bordTablePlayer[y][x + 1] == Constants.SHIP_IS_HIT_POINT) {
            shipAtCoordinatesXY[0] = 1; //right
        } else if ((y + 1) < 10 && bordTablePlayer[y + 1][x] == Constants.SHIP_IS_HIT_POINT) {
            shipAtCoordinatesXY[1] = 1; //down
        } else if ((x - 1) >= 0 && bordTablePlayer[y][x - 1] == Constants.SHIP_IS_HIT_POINT) {
            shipAtCoordinatesXY[0] = 1; //left
        } else if ((y - 1) >= 0 && bordTablePlayer[y - 1][x] == Constants.SHIP_IS_HIT_POINT) {
            shipAtCoordinatesXY[1] = 1; //up
        }

        return shipAtCoordinatesXY;
    }

    private int[] findNextFieldToShot(int x, int y, int xShift, int yShift, int shipAtAxisXY){

        int[] result = {-1, -1};

        for (int i = 1; i < 10; i++) {

            int iReplacement = yShift * yShift * (y + yShift * i) + xShift * xShift * (x + xShift * i);

            if ( (iReplacement >= 0 && iReplacement < 10) && bordTablePlayer[y + yShift * i][x + xShift * i] == Constants.SHIP_IS_HIT_POINT) {
                continue;
            } else if ((iReplacement >= 0 && iReplacement < 10) && bordTablePlayer[y + yShift * i][x + xShift * i] == Constants.SHIP_MISS_POINT || shipAtAxisXY == 1) {
                break;
            } else if (iReplacement >= 10 || iReplacement < 0) {
                break;
            } else {
                result[0] = x + xShift * i;
                result[1] = y + yShift * i;
                System.out.println("log> Result x: " + result[0] + ", y: " + result[1]);
                return result;
            }
        }

        return null;
    }


}
