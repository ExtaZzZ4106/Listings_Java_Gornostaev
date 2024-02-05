package Listing_3;

class PBV{
    void CBV(int x, int y){
        x=x+y;
        y=y+1;
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }
}
class PBVDemo{
    public static void main(String[]args){
        int a = 2;
        int b = 3;

        System.out.println("a = "+a);
        System.out.println("b = "+b);

        PBV test = new PBV();
        test.CBV(a,b);

    }
}