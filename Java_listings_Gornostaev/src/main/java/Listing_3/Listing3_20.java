package Listing_3;

class Vehicle3_20 {
    private int passengers;
    private int wheels;
    private int maxspeed;
    private int burnup;

    Vehicle3_20(int passengers, int wheels, int maxSpeed, int burnup) {
        this.passengers = passengers;
        this.setWheels(wheels);
        this.maxspeed = maxSpeed;
        this.burnup = burnup;
    }

    double distance(double interval) {
        double val = this.maxspeed * interval;
        return val;
    }

    int getMaxSpeed() {
        return this.maxspeed;
    }

    int getWheels() {
        return this.wheels;
    }

    void setWheels(int wheels) {
        if ((wheels < 1) || (wheels > 24)) {
            System.out.println("Неверно указано число колёс.");
            return;
        }
        this.wheels = wheels;
    }

    Vehicle3_20() {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup = 13;
    }
    public String toString(){
        return "Vehicle( passengers= " + passengers +";" + " wheels= " + wheels + ";" + " maxspeed= " + maxspeed + ";" + " burnup= " + burnup + ")";
    }

}

class Auto3_20 extends Vehicle3_20 {
    boolean sunroof;

    Auto3_20(boolean sunroof){
        this(4, 4, 200, 12, sunroof);
    }
    Auto3_20(int f, int g, int h, int j, boolean sunroof){
        super(f,g,h,j);
        this.sunroof = sunroof;
    }
}

class VehicleOverrideDemo {

    public static void main(String[] args) {

        Vehicle3_20 v = new Vehicle3_20(2, 2, 100, 9);
        Auto3_20 a = new Auto3_20(2, 4, 180, 12, true);
        System.out.println("Vehicle.toString():" + v.toString());
        System.out.println("Auto.toString():" + a.toString());
    }
}