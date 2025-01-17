package sample;

public class Bus extends Car{

    int price;
    void payment(){
        System.out.println(price+"円支払いました。");
        price=0;
    }

    @Override
    public void stepOneaccele(){ //何もつけないと狭くなる
        price+=30;
        System.out.println("料金が"+price+"円に増えました。");
    }
}
