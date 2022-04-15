package kolofortuny.utils;

import java.util.Scanner;

public class Display {
    public static void line(String text) {
        System.out.println(text);
    }
    
    public static void print(String text) {
        System.out.print(text);
    }

    public static void clear() {
        try {
            if (System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else System.out.print("\033[H\033[2J");
        }
        catch (final Exception ignored) {}
        System.out.flush();
    }

    public static void pause() {
        Scanner sc = new Scanner(System.in);
        print("\nWprowadź jakikolwiek znak... ");
        sc.next();
    }
}
