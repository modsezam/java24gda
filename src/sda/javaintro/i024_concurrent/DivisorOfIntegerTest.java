package sda.javaintro.i024_concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DivisorOfIntegerTest {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Start ExecutorService!");

        long start = System.currentTimeMillis();

        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        for (int i = 1; i <= 100; i++) {
            executorService.execute(new DivisorOfInteger(i));
        }
        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

        System.out.println( "time all: " + (System.currentTimeMillis() - start));

        System.out.println("Done!");

        System.out.println("abc\\s");

    }

}
