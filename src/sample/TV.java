package sample;

public class TV {
 
    private int channel ;
    protected String name ;

    void changeChannel(int channel){
        if(channel <= 0 || 13 <=channel){
            System.out.println(name+":1～12までで設定してください。");
            return;
        }

        this.channel = channel;
        System.out.println(name+":"+this.channel+"チャンネルに切り替わりました。");
    }
}
