import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileUtils {
    public static String readFile(String fileName) {
        String text = "";

        try {
            Scanner nadzieja = new Scanner(new File(fileName));
            while (nadzieja.hasNextLine()) text += nadzieja.nextLine() + "\n";
            nadzieja.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return text;
    }

    public static void writeFile(String fileName, String text) {
        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write(text);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}