package sda.javaintro.i012_ships_game;

public class ShipModel {

    private int coordinateX;
    private int coordinateY;
    private int numberOfField;
    //two direction d-down r-right
    private char direction;
    //1 - ship is sunk, 0 - ship is not sunk
    private int shipIsSunk;

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public int getNumberOfField() {
        return numberOfField;
    }

    public char getDirection() {
        return direction;
    }

    public int getShipSunk() {
        return shipIsSunk;
    }
}
