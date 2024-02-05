package Listing_3;

class Vehicle3_11{
    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;

    Vehicle3_11(int passengers, int wheels, int maxspeed, int burnup){
        this.passengers=passengers;
        this.setwheels(wheels);
        this.maxspeed=maxspeed;
        this.burnup=burnup;
    }
    double distance(double interval){
        double val = this.maxspeed * interval;
        return val;
    }
    int getMaxspeed(){
        return this.maxspeed;
    }
    int getWheels(){
        return this.wheels;
    }
    void setwheels(int wheels){
        if ((wheels<1)||(wheels>24)){
            System.out.println("неверно количество колес");
            return;
        }
        this.wheels=wheels;
    }
}
class VGSM{
    public static void main(String[] args){
        Vehicle3_11 ferrari = new Vehicle3_11(2, -2, 360, 12);
        System.out.println("Max speed:"+ferrari.getMaxspeed());
        System.out.println("Wheels:"+ferrari.getWheels());
        ferrari.setwheels(4);
        System.out.println("Число колёс (повторно): "+ferrari.getWheels());
    }
}