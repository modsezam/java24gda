package sda.javaintro.i012_ships_game;


public class Board {

    private int numOfPoints = Constants.LIVES_INT;
    char[][] bordTable;

    public Board() {
        this.bordTable = new char[Constants.BOARD_SIZE][Constants.BOARD_SIZE];
    }

    public void boardInitialization() {
        for (int i = 0; i < Constants.BOARD_SIZE; i++) {
            for (int j = 0; j < Constants.BOARD_SIZE; j++) {
                this.bordTable[i][j] = Constants.EMPTY_PIONT;
            }
        }
    }

    public boolean drawShip(int positionX, int positionY, int direction, int shipSize){
        //draw the ship to the right
        if (direction == 1){
            if (checkShipDrawError(positionX, positionY, 1, 0, shipSize) == true){
                checkDirectionAndDraw(positionX, positionY, 1, 0, shipSize);
            }
            else return false;
        }
        //draw the ship to down
        else if (direction == 2){
            if (checkShipDrawError(positionX, positionY, 0, 1, shipSize) == true) {
                checkDirectionAndDraw(positionX, positionY, 0, 1, shipSize);
            }
            else return false;
        }
        //draw the ship to left
        else if (direction == 3){
            if (checkShipDrawError(positionX, positionY, -1, 0, shipSize) == true) {
                checkDirectionAndDraw(positionX, positionY, -1, 0, shipSize);
            }
            else return false;
        }
        //draw the ship to up
        else if (direction == 4){
            if (checkShipDrawError(positionX, positionY, 0, -1, shipSize) == true) {
                checkDirectionAndDraw(positionX, positionY, 0, -1, shipSize);
            }
            else return false;
        }
        else return false;

    return  true;

    }

    private void drawPoint(int positionX, int positionY){
        bordTable [positionY][positionX] = Constants.SHIP_PIONT;
    }

    private boolean checkShipDrawError(int positionX, int positionY, int shiftX, int shiftY, int shipSize){
        for (int i = 0; i < shipSize; i++){

            if ((positionX + i * shiftX) >= Constants.BOARD_SIZE ){
                System.out.println("There is conflict! Correct your indication.");
                return false;
            }
            else if ((positionY + i * shiftY) >= Constants.BOARD_SIZE ){
                System.out.println("There is conflict! Correct your indication.");
                return false;
            }
            else if (bordTable [positionY + i * shiftY][positionX + i * shiftX] == Constants.SHIP_PIONT){
                System.out.println("There is conflict! Correct your indication.");
                return false;
            }
        }
        return true;
    }

    private void checkDirectionAndDraw(int positionX, int positionY, int shiftX, int shiftY, int shipSize){
        for (int i = 0; i < shipSize; i++){
            drawPoint(positionX + i * shiftX, positionY + i * shiftY);
        }
    }

    public void boardDraw() {
        bordDrawFirstLine();
        bordDrawMainsLine();
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

    private void bordDrawMainsLine() {
        int a = 1;
        for (int i = 0; i < Constants.BOARD_SIZE; i++) {
            if (a < 10)
                System.out.print(" " + a);
            if (a == 10)
                System.out.print(a);
            for (int j = 0; j < Constants.BOARD_SIZE; j++) {
                System.out.print("|" + this.bordTable[i][j]);
            }
            System.out.println("|");
            a += 1;
        }
    }


}
