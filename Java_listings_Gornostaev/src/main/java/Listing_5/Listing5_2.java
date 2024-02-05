package Listing_5;

import java.io.PrintStream;

public class Listing5_2 {
    private int numBits; // количество битов для отображения
    private PrintStream out;

    public Listing5_2(int numBits) {
        this(numBits, System.out);
    }

    public Listing5_2(int numBits, PrintStream out) {
        this.numBits = numBits;
        this.out = out;
    }

    public String getBinaryForm(long val) {
        long mask = 1;
        String form = "";
        mask <<= numBits - 1;
        int spacer = 0;
        for (; mask != 0; mask >>>= 1) {
            if ((val & mask) != 0) {
                form += "1"; // бит включен
            } else {
                form += "0"; // бит выключен
            }
            // разделение битов на группы по 8
            spacer++;
            if ((spacer % 8) == 0) {
                form += " ";
                spacer = 0;
            }
        }
        return form;
    }

    public void show(long val) {
        String binaryForm = getBinaryForm(val);
        out.println(binaryForm);
    }

    public static void main(String[] args) {
        Listing5_2 sb = new Listing5_2(32);
        sb.show(12);
        sb.show(67981);
        sb.show(237558758);
        sb.show(1113748768L);
        sb.show(1997);
        sb.show(1987);
    }
}