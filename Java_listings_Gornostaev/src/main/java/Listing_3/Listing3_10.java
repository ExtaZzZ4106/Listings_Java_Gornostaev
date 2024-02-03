package Listing_3;

class Vehicle3_10 {
    int passengers;
    int wheels;
    private int maxspeed;
    int burnup;

    // конструктор
    Vehicle3_10(int passengers, int wheels, int maxspeed, int burnup){
        this.passengers=passengers;
        this.wheels=wheels;
        this.maxspeed=maxspeed;
        this.burnup=burnup;
    }
    // расчёт
    double distance(double interval){
        double val = this.maxspeed * interval;
        return val;
    }
}
class VehicleAccessDemo{
    public static void main(String[] args){

        Vehicle3_10 ferrari=new Vehicle3_10(2, 4, 360,12);

        double distance=ferrari.distance(0.6);
        System.out.println("скорость Ferrari: "+ferrari.maxspeed+" км.ч"); // переменая maxspeed не будет работать так как она находится в привате
    }
}