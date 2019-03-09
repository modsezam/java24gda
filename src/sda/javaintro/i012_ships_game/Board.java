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
                if (this.bordTable[i][j] == 0) {
                    System.out.print("|" + Constants.SHIP_PIONT);
                } else
                    System.out.print("|" + Constants.EMPTY_PIONT);
            }
            System.out.println("|");
            //System.out.println(a);
            a += 1;
        }
    }


}
