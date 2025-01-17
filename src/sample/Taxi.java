package sample;

public class Taxi extends Car {  // extends 承継するクラス

    protected int price;
    
    public void payment(){
        System.out.println("料金を"+price+"円支払いました。");
        price=0; //支払ったら0にする
    }

    //オーバーライド
@Override
public void stepOneaccele(){
    speed+=10;
    System.out.println(name+"の速度が"+speed+"に増えました。");

    price+=90;
    System.out.println("料金が"+price+"円に増えました。");
}
public int getSpeed(){
    return this.speed;
}
public void setSpeed(int speed){
    this.speed=speed;
}

public int getPrice(){
    return this.price;
}

public void setPrice(int price){
    this.price=price;
}

    }
    

