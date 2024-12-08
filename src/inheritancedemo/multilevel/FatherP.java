package inheritancedemo.multilevel;

import inheritancedemo.single.Father;

public class FatherP {

    public void myProperty(){
        System.out.println("Father assest");
    }

    public void myFather(){
        System.out.println("Granfather assest");
    }

    public static void main(String[] args) {
        Father f = new Father();
        f.myFather();
        f.myProperty();
    }
}
