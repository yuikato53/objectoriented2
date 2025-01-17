package sample;

public class InstantiateTaxi {

    public static void main(String[] args) {
        
        Taxi taxi = new Taxi(); //インスタンス化

        taxi.setSpeed(0);
        taxi.name="タクシー仕様のプリウス";
        
        
        taxi.setPrice(700);
      
        //下記動作

        taxi.stepOneaccele();
        taxi.payment();


        // System.out.println(taxi.name+"の現在速度は"+taxi.speed+"です。"); //車名と速度の表示
    }

}
