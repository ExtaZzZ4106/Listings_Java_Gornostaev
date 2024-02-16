package Listings_7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Listing7_3 {
    static class GrepInputStream extends FileInputStream {
        String substring = null;
        BufferedReader br;

        public GrepInputStream(File file, String substring) throws IOException {
            super(file);
            this.br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            this.substring = substring;
        }

        public final String readLine() throws IOException {
            String line;

            // Читаем строки до тех пор, пока не найдена подстрока или не достигнут конец потока
            do {
                line = br.readLine();
            } while ((line != null) && line.indexOf(substring) == -1);

            return line;
        }
    }
}
