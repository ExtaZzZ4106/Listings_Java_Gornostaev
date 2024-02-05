package Listing_3.Need_fix;

class Vehicle3_8 {
    int passengers; // пассажиры
    int wheels; // колёса
    int maxspeed; // max.скорость
    int burnup; // расход топлива

    // конструкт с параметрами
    Vehicle3_8(int p, int w, int ms, int bu) {
        passengers = p;
        wheels = w;
        maxspeed = ms;
        burnup = bu;
    }
    double distance(double interval) {
        double value = maxspeed * interval;
        return value;
    }
    class VehicleConstrDemo{
        public static void main(String[] args) {
            Vehicle3_8 car = new Vehicle3_8(2, 4, 130, 30);
            Vehicle3_8 bus = new Vehicle3_8(45, 4, 120, 25);

            double interval = 1;
            double distanceCar = car.distance(interval);
            double distanceBus = bus.distance(interval);

            System.out.println("Автомобиль с "+car.passengers+" пассажирами"+" проедет за 1 час "+distanceCar+" км.");

            System.out.println("Автобус с "+bus.passengers+" пассажирами"+" проедет за 1 час "+distanceBus+" км.");
        }
  }
}