package Listings_7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Listing7_2 {
    public static void main(String[] args) {
        File file = new File("file.bin");
        InputStream is = null;

        try {
            is = new FileInputStream(file);

            long length = file.length();

            // Нельзя создать байтовый массив с количеством элементов большим, чем значение Integer.MAX_VALUE.
            // Если размер файла в байтах больше этого значения, файл нельзя прочитать
            if (length > Integer.MAX_VALUE) {
                throw new IOException("Файл " + file.getName() + " слишком длинный!");
            }

            byte[] bytes = new byte[(int) length];

            int offset = 0;
            int numRead = 0;

            // Чтение файла в байтовый массив
            while (offset < bytes.length && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
                offset += numRead;
            }

            // Проверка, что файл прочитан полностью
            if (offset < bytes.length) {
                throw new IOException("Не удалось прочитать файл " + file.getName() + " целиком.");
            }
        } catch (IOException e) {
            e.printStackTrace(); // Обработка исключения
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace(); // Обработка исключения при закрытии потока
            }
        }
    }
}
