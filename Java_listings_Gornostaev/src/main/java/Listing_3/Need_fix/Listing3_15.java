package Listing_3.Need_fix;

class Vehicle3_15 {
    public int passengers;
    private int wheels;
    private int maxSpeed;
    int burnup;

    // конструктор без параметров, инициализирующий
    // переменные объекта стандартными значениями
    Vehicle3_15() {
        this.passengers = 4;
        this.wheels = 4;
        this.maxSpeed = 160;
        this.burnup = 13;
    }

    // конструктор с параметрами, инициализирующий
    // переменные объекта значениями, переданными из вызывающей программы
    Vehicle3_15(int passengers, int wheels, int maxSpeed, int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxSpeed = maxSpeed;
        this.burnup = burnup;
    }
}