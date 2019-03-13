package sda.javaintro.i012_ships_game;


public class Player {

    private String playerName;
    private int shipList[];

    public void setShipList(int[] shipList) {
        this.shipList = shipList;
    }

    public int getShipNumber(int shipNumber) {
        return shipList[shipNumber];
    }

    public int getShipLength() {
        return shipList.length;
    }

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }
}
