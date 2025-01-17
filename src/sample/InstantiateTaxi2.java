package sample;

public class InstantiateTaxi2 {
    public static void main(String[] args) {
        System.out.println("車が発車します。");
        Car car = new Car();
        car.name = "プリウス";
        car.stepOneaccele();
        

        System.out.println("タクシーが発車します。");
        Taxi taxi = new Taxi();
        taxi.name="タクシー用プリウス";

        for(int i = 1 ; i<=10; i++){
            taxi.stepOneaccele();
        }
        taxi.payment();
        }

}
