package sda.javaintro.i012_ships_game;


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
        if (bordTableComputer[y][x] == Constants.SHIP_IS_HIT_POINT){
            System.out.println("You already choose this field! (HIT POINT)\nThe queue is gone!\n");
            return false;
        }
        else if (bordTableComputer[y][x] == Constants.SHIP_MISS_POINT){
            System.out.println("You already choose this field! (MISS POINT)\nThe queue is gone!\n");
            return false;
        }
        else if (bordTableComputer[y][x] == Constants.SHIP_POINT) {
            System.out.println("You HIT!\n");
            bordTableComputer[y][x] = Constants.SHIP_IS_HIT_POINT;
            return true;
        } else {
            System.out.println("You do not HIT!\n");
            bordTableComputer[y][x] = Constants.SHIP_MISS_POINT;
        }
        return false;
    }

}
