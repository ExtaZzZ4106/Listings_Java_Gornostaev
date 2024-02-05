package Listing_3;

class Vehicle3_19 {
    private int passengers;
    private int wheels;
    private int maxspeed;
    private int burnup;

    Vehicle3_19(int passengers, int wheels, int maxSpeed, int burnup) {
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

    Vehicle3_19() {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup = 13;
    }
}

class Auto3_19 extends Vehicle3_19 {
    boolean sunroof; // наличие люка
}

class VehicleGetSetMethod3_19 {
    public static void main(String[] args) {
        Auto3_19 bmw = new Auto3_19();
        bmw.sunroof = true; // люк есть
        System.out.println("Путь, пройденный за 1.5 часа: " + bmw.distance(1.5) + " км.");
        System.out.println("Max.скорость: " + bmw.getMaxSpeed() + " км/ч.");
        System.out.println("Наличие люка: " + bmw.sunroof);
    }
}


