package Listing_2;

public class Listing2_20 {
    public static void main(String[] args)  {

        for (int i = 1; i < 4; i ++)  {

            Block1:  {
            Block2:  {
            Block3:  {

             System.out.println("\ni = " + i);
             if (i == 1) break Block1;
             if (i == 2) break Block2;
             if (i == 3) break Block3;

             System.out.println("Эта строка никогда не будет напечатана");

            }
            System.out.println("Block3 ended");
            }
            System.out.println("Block2 ended");
            }
            System.out.println("Block1 ended");
        }
    }
}
