package sda.javaintro.i012_ships_game;


public class Player {

    private String playerName;
    private int shipList[];
    //private Board board = new Board();
    private int numOffPoints = 0;

    public void setShipList(int[] shipList) {
        this.shipList = shipList;
    }

    public int getShipNumber(int shipNumber) {
        return shipList[shipNumber];
    }

    public void calculateNumberOffAllPoints(){
        for (int i = 0; i < shipList.length; i++){
            numOffPoints += shipList[i];
        }
    }

    public void deleteOneNumOffPoints(){
        numOffPoints -= 1;
    }

    public int getNumOffPoints() {
        return numOffPoints;
    }

    public void setNumOffPoints(int numOffPoints) {
        this.numOffPoints = numOffPoints;
    }

    public int getShipLength() {

        return shipList.length;
    }

    public Player(String playerName) {

        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }
}
