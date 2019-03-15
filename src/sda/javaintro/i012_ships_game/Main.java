package sda.javaintro.i012_ships_game;


public class Main {

    public static void main(String[] args) {

        SourceCode game = new SourceCode();

        //choose number od ships
        game.setShipList(new int[]{5, 4 , 3, 3, 2, 2, 1 });
        //game.setShipList(new int[]{5});

        game.newGame();


        if (game.getAndDrawAllShipOnBoard() == true){

            System.out.println("\n###################################" +
                    "\n# You put all ships on the board! #" +
                    "\n###################################");
            System.out.println("\nComputer draws the location of ships ...");
            if (game.generateAllShipOnBoardComputer() == true){
                System.out.println("The location of ships is DONE! and position of ships is hide!");
                if (game.shootAllComputerShips() == true){
                    System.out.println("\nYOU WIN!");
                } else {
                    System.out.println("\nComputer WIN!");
                }
            }
        }
    }
}
