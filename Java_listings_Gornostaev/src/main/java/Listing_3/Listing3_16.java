package Listing_3;

class Vehicle3_16 {
    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;

    Vehicle3_16(){
        this(4, 4, 160, 13);
    }

    Vehicle3_16(int passengers, int wheels, int maxspeed, int burnup){

        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }
    double distance(int interval){
        double value = this.maxspeed * interval;
        return value;
    }
}