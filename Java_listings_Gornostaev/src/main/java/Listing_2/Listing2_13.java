package Listing_2;

public class Listing2_13 {
    public static void main(String[] args)  {
        int iresult, iremain; // для деления целых чисел
        double dresult, dremain; // для деления вещественных чисел

        // деление целых чисел
        iresult = 10 / 3;
        iremain = 10 % 3;

        System.out.print("частное от деления 10 / 3 = ");
        System.out.println(iresult + ", остаток равен " + iremain);

        //деление весщественных чисел
        dresult = 10.0 / 3;
        dremain = 10.0 % 3;

        System.out.print("Частное от деления 10.0 / 3.0 равно ");
        System.out.println(dresult + ", остаток равен " + dremain);

    }
}
