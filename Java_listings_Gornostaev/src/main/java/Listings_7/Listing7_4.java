package Listings_7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Listing7_4 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Использование: java List7_4 <образец> <имя_файла>");
            System.exit(1);
        }

        try {
            File file = new File(args[1]);
            InputStream fis = new FileInputStream(file);
            Listing7_3.GrepInputStream gis = new Listing7_3.GrepInputStream(fis, args[0]);
            String line;

            while ((line = gis.readLine()) != null) {
                System.out.println(line);
            }

            gis.close();
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }
}
