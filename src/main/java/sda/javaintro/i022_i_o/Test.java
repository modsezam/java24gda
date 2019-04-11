package sda.javaintro.i022_i_o;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

        Path baseFolder = Paths.get("C:\\io_test");
        System.out.println("baseFolder = " + baseFolder);

        try {
            Files.createDirectories(baseFolder);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Path path = baseFolder.resolve("text.txt");

        try {
            Files.createFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Stream<Path> stream = Files.list(baseFolder);
            List<Path> pathList = stream.collect(Collectors.toList());
            for (Path path1 : pathList) {
                System.out.println("path1 = " + path1.toAbsolutePath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



        //zapisujemy tekst do pliku
        try(FileWriter fileWriter = new FileWriter(path.toString())) {
            fileWriter.write("Marcin Kobierowski\n");
        } catch (IOException e) {
            e.printStackTrace();
        }





    }


}
