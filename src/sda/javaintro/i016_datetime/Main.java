package sda.javaintro.i016_datetime;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate myBirdday;
        myBirdday = LocalDate.of(1985, 5, 10);
        System.out.println(myBirdday);
        System.out.println(myBirdday.getDayOfMonth() + " " + myBirdday.getDayOfWeek() + " " + myBirdday.getYear());



    }
}
