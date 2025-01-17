package sample;

public class PC implements Erectrical {

    private boolean powerOn;

    @Override
    public void power(){

        if(powerOn){
            System.out.println("PCの電源が切れました");
            powerOn=false;
        }else{
            System.out.println("設定ファイルを読み込んでいます");
            powerOn=true;
            System.out.println("PCの電源が入りました");
        }
        }
    }



