package sda.javaintro.i012_ships_game;


class Player {

    private int[] shipList;
    private int numOffPoints = 0;

    void setShipList(int[] shipList) {
        this.shipList = shipList;
    }

    int getShipNumber(int shipNumber) {
        return shipList[shipNumber];
    }

    void calculateNumberOffAllPoints(){
        for (int i1 : shipList) {
            numOffPoints += i1;
        }
    }

    void deleteOneNumOffPoints(){
        numOffPoints -= 1;
    }

    int getNumOffPoints() {
        return numOffPoints;
    }

    void setNumOffPoints(int numOffPoints) {
        this.numOffPoints = numOffPoints;
    }

    int getShipLength() {

        return shipList.length;
    }

    Player(String playerName) {

    }

}
