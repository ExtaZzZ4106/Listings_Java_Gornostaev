package Listing_2;

public class Listing2_10 {
    public static void main(String[] args)  {

        // эти переменные иницилезируются константами
        double rds = 4; // радиус цилиндра
        double hgt = 5; // высота цилиндра

        // переменная volume (vol) иницилизируется динамически вычесленным значения выражения
        double vol = 3.1416 * rds * rds * hgt;
        System.out.println("Объём цилиндра равен " + vol);

    }
}
