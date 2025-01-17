package sample;

public class Ex01 {
    public static void main(String[] args) {
        
        Bus bus = new Bus(); //インスタンス化

        bus.speed=10;
        bus.name="市バス";
        
        bus.stepOneaccele();

        bus.payment();
          }

}
