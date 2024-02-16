package Listings_7;

import java.io.*;

public class Listing7_3 {
    static class GrepInputStream extends FileInputStream {
        String substring = null;
        BufferedReader br;

        public GrepInputStream(InputStream file, String substring) throws IOException {
            super(file.toString());
            this.br = new BufferedReader(new InputStreamReader(new FileInputStream(file.toString())));
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
