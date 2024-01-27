package Listing_2;

public class Listing2_7 {

    public static void main(String[] args)  {
        double cts1, cts2, hypot;

        cts1 = 3; //длина первого катета
        cts2 = 4; //длина вторгого катета

        hypot = Math.sqrt((cts1 * cts1) + (cts2 * cts2));

        System.out.println("длина гипотенузы равна " + hypot);
    }
}
