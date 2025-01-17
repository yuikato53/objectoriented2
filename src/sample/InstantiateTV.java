package sample;

public class InstantiateTV {
    public static void main(String[] args) {
        
        TV myTV = new TV();
        myTV.name="ソニー";
        myTV.changeChannel(5);

        TV yourTV = new TV();
        yourTV.name="パナソニック";
        yourTV.changeChannel(13);
    }

}
