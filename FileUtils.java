package wyswietlaczobrazkow.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileUtils {
    public static String readFile(String fileName) {
        String text = "";
        
        try {
            Scanner nadzieja = new Scanner(new File(fileName), StandardCharsets.UTF_8);
            while (nadzieja.hasNextLine())
                text += nadzieja.nextLine() + "\n";
            nadzieja.close();
        } catch (IOException ignored) {}

        return text;
    }
    
    public static String readFile(File file) {
//        String text = "";
//        
//        try {
//            Scanner nadzieja = new Scanner(new File(), "UTF-8");
//            while (nadzieja.hasNextLine())
//                text += nadzieja.nextLine() + "\n";
//            nadzieja.close();
//        } catch (FileNotFoundException ignored) {}
        
        return readFile(file.getAbsolutePath());
    }
    
    public static void writeFile(String fileName, String text) {
        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write(text);
            fw.close();
        } catch (IOException ignored) {}
    }
}
