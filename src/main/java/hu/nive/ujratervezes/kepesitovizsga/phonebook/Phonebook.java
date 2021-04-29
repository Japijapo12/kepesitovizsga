package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output) {

        if (contacts == null) {
            throw new IllegalArgumentException("Map is empty");
        }

        if (output == null) {
            throw new IllegalArgumentException("Path is null");
        }
        Path file = Path.of(output);

        Map<String, String> treeMap = new TreeMap<>(contacts);



        try (BufferedWriter writer = Files.newBufferedWriter(file)) {
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        } catch (
                IOException e) {
            throw new IllegalStateException("Can not read file, e");


        }
    }
}
