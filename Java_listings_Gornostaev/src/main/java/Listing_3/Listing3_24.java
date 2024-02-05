package Listing_3;

interface A {
    void metodA(); // метод А() Интерфейса А
}

interface B extends A {
    void metodB(); // метод В() интерфейса В
}

class IExample implements B {
    public void metodA() {
        System.out.println("Метод А");
    }

    public void metodB() {
        System.out.println("Метод В");
    }
}

public class Listing3_24 {
    public static void main(String[] args) {
        IExample ie = new IExample();
        ie.metodA(); // вызов метода интерфейса А
        ie.metodB(); // вызов метода интерфейса В
    }
}