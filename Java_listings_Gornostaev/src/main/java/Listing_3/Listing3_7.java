package Listing_3;

class Number {
    int x;
    Number(int num) {
        x = num;
    }
}
class NumberDemo {
    public static void main(String[] args) {

        Number t1 = new Number(9);
        Number t2 = new Number(27);

        System.out.println(t1.x + " *** " + t2.x);
    }
}