package Listing_2;

public class Listing2_11 {
    public static void main(String[] args)  {

        int x; //переменная x во всём методе main

        x = 1;
        System.out.println("До вложенного блока x = " + x);
        {
            int y = 3;
            System.out.println("Внутренний блок: x = " + x + ", y = " + y);
            x = y * 3;
        }
        int y = 100;

        System.out.println("После вложенного блока: x = " + x + "\nА y так как мы указали за скобками ему значение y = 100 теперь: " + y);


    }
}
