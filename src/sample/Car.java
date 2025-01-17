package sample;

public class Car {

    protected int speed;
    protected String name;


//アクセル踏む
    public void stepOneaccele(){
         speed+=10;
         System.out.println(name+"の速度が"+speed+"に増えました");
    }

//ブレーキ
    public void stepOnebrake(){
        speed-=10;
        System.out.println(name+"の速度が"+speed+"に減りました");
    }

    // getter setter
    public int getSpeed(){  //getter 
        return this.speed;
    }

    public void setSpeed(int speed){
        this.speed=speed;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }


}
    


