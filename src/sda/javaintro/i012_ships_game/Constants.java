package sda.javaintro.i012_ships_game;

public class Constants {
    private Constants(){ }

    public static final int BOARD_SIZE = 10;

    // to hide - h
    public static final char COMPUTER_TABLE_MODE = 'v';

    public static final char EMPTY_POINT = ' ';
    public static final char SHIP_POINT = '#';
    public static final char SHIP_IS_HIT_POINT = 'X';
    public static final char SHIP_MISS_POINT = 'o';

    public static final String LOGO =
            "       .__    .__         ___.           __    __  .__          \n" +
            "  _____|  |__ |__|_____   \\_ |__ _____ _/  |__/  |_|  |   ____  \n" +
            " /  ___/  |  \\|  \\____ \\   | __ \\\\__  \\\\   __\\   __\\  | _/ __ \\ \n" +
            " \\___ \\|   Y  \\  |  |_> >  | \\_\\ \\/ __ \\|  |  |  | |  |_\\  ___/ \n" +
            "/____  >___|  /__|   __/   |___  (____  /__|  |__| |____/\\___  >\n" +
            "     \\/     \\/   |__|          \\/     \\/                     \\/ ";
}
