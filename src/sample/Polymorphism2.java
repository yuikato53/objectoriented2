package sample;

public class Polymorphism2 {

    public static void main(String[] args) {
        
        Car car = null;

        car=new Taxi();
        car.stepOneaccele();

        car=new Bus();
        car.stepOneaccele();
    }

}
