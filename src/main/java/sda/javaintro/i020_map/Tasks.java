package sda.javaintro.i020_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Tasks {

    public static void main(String[] args) {

        Map<Integer, String> testMaps = new HashMap<>();

        testMaps.put(1, "one");
        testMaps.put(2, "two");
        testMaps.put(3, "three");
        testMaps.put(-1, "three");

        System.out.println("Size testMap " + testMaps.size());


        Set<Integer> keys = testMaps.keySet();
        int k = 0;
        for (Integer key : keys) {
            if (key < 0) k++;
            String value = testMaps.get(key);
            System.out.println(key + " = " + value);
        }
        System.out.println("Mniejsze: " + k + " Większe równe: " + (testMaps.size() - k));



    }
}
