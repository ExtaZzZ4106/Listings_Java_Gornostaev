package Listing_5;

import java.util.Base64;

public class Listing5_3 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("usage: Base64Demo text");
            System.exit(1);
        }

        // кодирование текста
        String text = args[0];
        Base64.Encoder enc = Base64.getEncoder();
        String encoded = enc.encodeToString(text.getBytes());

        // декодирование текста
        String decoded = null;
        try {
            Base64.Decoder dec = Base64.getDecoder();
            decoded = new String(dec.decode(encoded));
            dec = null;
        } catch (IllegalArgumentException ioe) {
            ioe.printStackTrace();
        }

        // вывод результатов
        System.out.println("Закодировано: " + encoded);
        System.out.println("Декодировано: " + decoded);
        encoded = null;
        decoded = null;
    } // main
} //Base64Demo