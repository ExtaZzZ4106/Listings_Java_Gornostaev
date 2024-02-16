package Listing_3;

class Vehicle {
    @Override
    public String toString() {
        return "vehicle";
    }
}

class Auto extends Vehicle implements Moveable {
    @Override
    public String toString() {
        return "auto";
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Moving to: (" + x + ", " + y + ")");
    }
}

interface Moveable {
    void move(int x, int y);
}

public class Listing3_25 {
    public static void main(String[] args) {

        Auto a = new Auto();
        Vehicle v = new Vehicle();

        Vehicle[] va = {a, v};
        for (int i = 0; i < va.length; i++) {

            System.out.println(va[i].toString());
            if (va[i] instanceof Moveable) {
                Moveable m = (Moveable) va[i];
                m.move(10 + 1 * 34, 34);
            }
        }
    }
}