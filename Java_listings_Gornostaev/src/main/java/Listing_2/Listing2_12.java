package Listing_2;

public class Listing2_12 {
    public static void main(String[] args)  {
        int count=1;
        System.out.println("count = " + count);

        {
            int count2=2;
            System.out.println("первый независимый блок: count2 = " + count2);

            int n=3;
            System.out.println("Первый независимый блок: n = " + n);
        }
        {
          int n=5;
          System.out.println("Второй независимый блок: n = " + n);

        }
    }
}
