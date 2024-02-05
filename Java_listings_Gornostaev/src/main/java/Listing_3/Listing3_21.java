package Listing_3;

class Vehicle3_21 {
    private int passengers;
    private int wheels;
    private int maxspeed;
    private int burnup;

    Vehicle3_21(int passengers, int wheels, int maxSpeed, int burnup) {
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

    Vehicle3_21() {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup = 13;
    }
    public String toString(){
        return "Vehicle( passengers= " + passengers +";" + " wheels= " + wheels + ";" + " maxspeed= " + maxspeed + ";" + " burnup= " + burnup + ")";
    }

}

class Auto3_21 extends Vehicle3_21 {
    boolean sunroof;

    Auto3_21(boolean sunroof){
        this(4, 4, 200, 12, sunroof);
    }
    Auto3_21(int f, int g, int h, int j, boolean sunroof){
        super(f,g,h,j);
        this.sunroof = sunroof;
    }
}

class PolyVehicleDemo{
    public static void main(String[] args){
        Auto3_21 a = new Auto3_21(true);
        Vehicle3_21 v = new Vehicle3_21();
        Vehicle3_21[] pvd = {a, v};
        for (int i = 0; i < pvd.length; i++) {
            System.out.println(pvd[i].toString());
        }
    }
}