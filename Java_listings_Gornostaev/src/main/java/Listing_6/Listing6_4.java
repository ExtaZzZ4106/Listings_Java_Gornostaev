package Listing_6;

import java.io.IOException;

public class Listing6_4 {
    public static void main(String[] args) {
        try {
            // Используем операционную систему для определения команды для открытия блокнота
            String os = System.getProperty("os.name").toLowerCase();

            // Запуск программы Блокнот в Windows
            if (os.contains("win")) {
                Runtime.getRuntime().exec("notepad.exe");
            } else {
                System.out.println("Данная операционная система не поддерживается.");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
