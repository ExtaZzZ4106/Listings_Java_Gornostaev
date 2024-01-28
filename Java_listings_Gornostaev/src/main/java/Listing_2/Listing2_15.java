package Listing_2;

public class Listing2_15 {
    public static void main(String[] args)  {

        byte x, z;
        int y;

        x = 5;
        y = x * x;  //результат опирации имеет тип int

        z = (byte) (x * x);

        System.out.println("значение z = " + z);

    }
}
