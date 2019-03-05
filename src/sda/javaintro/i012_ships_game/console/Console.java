package sda.javaintro.i012_ships_game.console;

public class Console {

    int[][] table = new int[9][9];


    public void drawMenu(){

    }

    public void drawShipBord(int [][] table){
        bordDrawFirstLastLine(table.length);
        bordDrawMainLine(table);
        bordDrawFirstLastLine(table.length);
    }

    public void cls(){
        for (int i = 0; i < 30; i++)
            System.out.println();
    }


    public static void bordDrawFirstLastLine(int tableLength){
        char a = 'A';
        System.out.print(" ");
        for (int i = 0; i < tableLength; i++){
            System.out.print("|" + a);
            a += 1;
        }
        System.out.println("|");
    }

    public static void bordDrawMainLine(int table[][]){
        char a = '1';
        for (int i = 0; i < table.length; i++){
            System.out.print(a);
            for (int j = 0; j < table.length; j++){
                if (table[i][j] == 0){
                    System.out.print("| ");
                }
                else
                    System.out.print("|X");
            }
            System.out.print("|");
            System.out.println(a);
            a += 1;
        }
    }

}
