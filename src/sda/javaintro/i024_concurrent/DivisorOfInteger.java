package sda.javaintro.i024_concurrent;

public class DivisorOfInteger implements Runnable {

    int number;
    int result = 0;

    public DivisorOfInteger(int number) {
        this.number = number;
    }

    @Override
    public void run() {

        for (int i = 1; i < number ; i++){
            if (number%i == 0){
                System.out.println("for number: " + number + " divisor: " + i);
            }
        }


    }
}
