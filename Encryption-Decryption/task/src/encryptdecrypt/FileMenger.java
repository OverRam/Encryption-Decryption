package encryptdecrypt;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileMenger {
    static String readFileAsString(String fileName) {
        try {
            return new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            System.out.println("Error read file");
            e.printStackTrace();
        }
        return "";
    }

    static void saveToFile(String name, String text) {
        try {
            FileWriter fw = new FileWriter(name);
            fw.write(text);
            fw.close();
        } catch (IOException e) {
            System.out.println("Error save file");
            e.printStackTrace();
        }
    }
}
