package Listing_3;

class Vehicle3_4 {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;

    // объявляем метод вычисляющий путь
    // метод принимает параметр interval, задающий время и не возврощает никакого значения в (void)
    void distanse(double interval)  {
        double value = maxspeed * interval;
        System.out.println("пройдкнный путь: " + value + "км");

    }
}
class VehicleMethodDemo  {
    public static void main(String[] args)  {

        // машина
        Vehicle3_4 car = new Vehicle3_4();
        car.passengers = 2;
        car.wheels = 4;
        car.maxspeed = 130;
        car.burnup = 30;

        // автобус
        Vehicle3_4 bus = new Vehicle3_4();
        bus.passengers = 45;
        bus.wheels = 4;
        bus.maxspeed = 100;
        bus.burnup = 25;

        // расчёт пути, пройденного за 0.5 часа
        double time = 0.5;
        System.out.println("авто: " + car.passengers + " - пассажиров");
        car.distanse(time);
        System.out.println("автобус: " + bus.passengers + " - пассажиров");
        bus.distanse(time);


    }
}
