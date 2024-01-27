package Listing_2;

public class Listing2_3 {

    public static void main(String[] args) {
        int a, b, c, d;

        a = 2;
        b = 3;

        System.out.print("a равно 2, b равно 3");
        if (a < b) System.out.println("a меньше b");
        if (a > b) System.out.println("этот текст вы никогда неувидите");

        System.out.println("");

        c = a - b; // с будет равно -1
        System.out.println("c равно -1");
        if (c >= 0) System.out.println("c имеет положительное значение ");

        if (c < 0) System.out.println("c имеет отрицательное значение");

        System.out.println("");

        d = b - a; //d равно 1
        System.out.println("d равно 1");
        if (d >= 0) System.out.println("d имеет положительное значение");

        if (d < 0) System.out.println("d имеет отрицатильное значение");

        System.out.println("");

        if (a + c != b) System.out.println("a плюс c не равняется b");
        if (a + d == b) System.out.println("a плюс d равняется b");

    }
}
