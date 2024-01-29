package Listing_3;

class Vehicle3_5 {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;

    double distance(double interval)  {
        double value = maxspeed * interval;
        return value;
    }
}
class VehicleMethodDemo_1  {
    public static void main(String[] args)  {

        // машина
        Vehicle3_5 car = new Vehicle3_5();
        car.passengers = 2;
        car.wheels = 4;
        car.maxspeed = 130;
        car.burnup = 30;

        // автобус
        Vehicle3_5 bus = new Vehicle3_5();
        bus.passengers = 45;
        bus.wheels = 4;
        bus.maxspeed = 100;
        bus.burnup = 25;

        // расчёт пути, пройденного за 0.5 часа
        double time = 0.5;
        double distanceCar = car.distance(time);
        double distanceBus = bus.distance(time);

        System.out.println("авто: " + car.passengers + " - пассажиров");
        car.distance(time);
        System.out.println("автобус: " + bus.passengers + " - пассажиров");
        bus.distance(time);


    }
}
