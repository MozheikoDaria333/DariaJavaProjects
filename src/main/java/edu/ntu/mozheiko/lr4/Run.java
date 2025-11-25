package edu.ntu.mozheiko.lr4;

import edu.ntu.mozheiko.lr4.controller.JsonManager;
import edu.ntu.mozheiko.lr4.controller.UniversityCreator;
import edu.ntu.mozheiko.lr4.model.University;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Run {
    public static void main(String[] args) throws IOException {
        UniversityCreator creator = new UniversityCreator();
        University university = creator.createTypicalUniversity();

        JsonManager jsonManager = new JsonManager();
        Path path = Paths.get("university.json");

        jsonManager.writeUniversityToFile(university, path.toString());
        System.out.println("Записано у файл: " + path.toAbsolutePath());

        University loaded = jsonManager.readUniversityFromFile(path.toString());
        System.out.println("Завантажений університет дорівнює? " + university.equals(loaded));
    }
}
