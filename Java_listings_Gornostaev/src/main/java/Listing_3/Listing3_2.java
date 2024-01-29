package Listing_3;

class Vihecle3_2 {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;
}

    class MoreVehicleDemo  {

        public static void main(String[] args)  {
            // 1 машина
            Vihecle3_2 car1 = new Vihecle3_2();
            car1.passengers = 2;
            car1.wheels = 6;
            car1.maxspeed = 130;
            car1.burnup = 30;

            // 1 автобус
            Vihecle3_2 bus1 = new Vihecle3_2();
            bus1.passengers = 45;
            bus1.wheels = 4;
            bus1.maxspeed = 100;
            bus1.burnup = 45;

            // расчёт пройденного пути за 1.25 часа
            double interval = 1.25;
            double distcar1 = car1.maxspeed * interval;
            double distbus1 = bus1.maxspeed * interval;

            // вывод значений
            System.out.println("car1 может проехать " + distcar1 + "км с " + car1.passengers + "пассажирами");
            System.out.println("bus1 может проехать " + distbus1 + "км с " + bus1.passengers + "пассажирами");
        }
    }
