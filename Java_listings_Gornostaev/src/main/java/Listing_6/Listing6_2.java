package Listing_6;

import java.io.*;
public class Listing6_2 {
    public static void main(String[] args) {
        try {
            PrintStream errout = new PrintStream(new FileOutputStream("Error.log"));
            System.setErr(errout);
            PrintStream sysOut = new PrintStream(new FileOutputStream("Debug.log"));
            System.setOut(sysOut);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        System.out.println("Сообщения о нормальной работе программы");
        System.err.println("Cooбшения об ошибкаx");

    }
}