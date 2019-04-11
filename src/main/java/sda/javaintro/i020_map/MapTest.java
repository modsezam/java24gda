package sda.javaintro.i020_map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

        Map<String, String> vocabulary = new HashMap<>();

        vocabulary.put("kot", "cat");
        vocabulary.put("pies", "dog");
        vocabulary.put("lew", "lion");

        //sprawdź
        System.out.println("contains kot: " + vocabulary.containsKey("kot"));
        System.out.println("contains wąż: " + vocabulary.containsKey("wąż"));
        System.out.println("contains cat: " + vocabulary.containsValue("cat"));
        System.out.println("contains snake: " + vocabulary.containsValue("snake"));

        //pobierz pojedyńczy element
        String dogInEnglish = vocabulary.get("pies");
        System.out.println("dog in english: " + dogInEnglish);
        String birdInEnglish = vocabulary.getOrDefault("ptak", "empty");
        System.out.println("bird in english: " + birdInEnglish);

    }

}
