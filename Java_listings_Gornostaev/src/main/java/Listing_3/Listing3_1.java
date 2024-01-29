package Listing_3;

class Vihecle3_1 {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;
}
class VehicleDemo  {

    public static void main(String[] args)  {

        Vihecle3_1 car1 = new Vihecle3_1();
        car1.passengers = 2;
        car1.wheels = 6;
        car1.maxspeed = 130;
        car1.burnup = 30;

        double distance = car1.maxspeed * 0.5;

        System.out.println("За пол часа car1 может проехать:" + distance + "км");

        car1 = null;
    }

}



