package sda.javaintro.i012_ships_game.board;

public class BoardModel {
    private int boardField;
    private int numShips1Field;
    private int numShips2Field;
    private int numShips3Field;
    private int numShips4Field;
    private int numShips5Field;
    private int numOfSunkenShips;
    int[][] bordTable;

    public void initializationBoard (int bordField){
        this.bordTable = new int[bordField - 1][bordField - 1];
    }


}
