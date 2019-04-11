package sda.javaintro.i012_ships_game;

class Constants {
    private Constants(){ }

    static final int BOARD_SIZE = 10;

    // h - hide chosen ships, v - visible chosen ships
    static final char COMPUTER_TABLE_MODE = 'v';
    static final char PLAYER_TABLE_MODE = 'v';

    static final int[] SHIP_QUANTITY =new int[]{5, 4, 3, 2};

    static final char EMPTY_POINT = ' ';
    static final char SHIP_POINT = '#';
    static final char SHIP_IS_HIT_POINT = 'X';
    static final char SHIP_MISS_POINT = 'o';

    static final String LOGO =
            "       .__    .__         ___.           __    __  .__          \n" +
            "  _____|  |__ |__|_____   \\_ |__ _____ _/  |__/  |_|  |   ____  \n" +
            " /  ___/  |  \\|  \\____ \\   | __ \\\\__  \\\\   __\\   __\\  | _/ __ \\ \n" +
            " \\___ \\|   Y  \\  |  |_> >  | \\_\\ \\/ __ \\|  |  |  | |  |_\\  ___/ \n" +
            "/____  >___|  /__|   __/   |___  (____  /__|  |__| |____/\\___  >\n" +
            "     \\/     \\/   |__|          \\/     \\/                     \\/ ";
}
