package Listing_3;

class SimpleVehicle {

    int passengers;
}
class RefTypes {


    public static void main(String[] args)  {

        SimpleVehicle car1, car2; // две ссылки на объект типа SimpleVehicle

        car1 = new SimpleVehicle(); // создаём объект и ссылку на него

        car1.passengers = 25; // задаём количество пассажиров

        // обе переменные ссылаются на один объект
        car2 = car1;

        // докажем это
        System.out.println("car2 пассажиры: " + car2.passengers + ", car1: " + car1.passengers);

        car2.passengers = 50;
        // если car1 и car2 эт один и тот же объект, то теперь car1.passengers стало ровно 50

        System.out.println("car1 пассажиры: " + car1.passengers + ", car2: " + car2.passengers);
    }
}