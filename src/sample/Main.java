package sample;

public class Main {  //演習7実行用クラス

    public static void main(String[] args) {
        

    Employee[] employees = new Employee[3];

    employees[0]=new Employee();
    employees[0].setName("山田");
    employees[0].setSalaly(200000);

    employees[1]=new Employee();
    employees[1].setName("海田");
    employees[1].setSalaly(220000);
    
    employees[2]=new Employee();
    employees[2].setName("川田");
    employees[2].setSalaly(240000);  //従業員


    Material[] materials = new Material[4];

    materials[0]=new Material();
    materials[0].setName("金");
    materials[0].setCost(10000);

    materials[1]=new Material();
    materials[1].setName("銀");
    materials[1].setCost(5000);

    materials[2]=new Material();
    materials[2].setName("銅");
    materials[2].setCost(1000);

    materials[3]=new Material();
    materials[3].setName("木");
    materials[3].setCost(500);  //材料

    
    MedalFactory medalFactory = new MedalFactory();

    medalFactory.makeMedal();



    // Medal medal = new Medal();
    // System.out.println(medal.getName+"製品名"+"/ 価格："+medal.getPrice()+"円");  //製品の名前、価格

    }
}
