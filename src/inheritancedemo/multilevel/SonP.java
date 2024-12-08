package inheritancedemo.multilevel;

import inheritancedemo.single.Son;

public class SonP extends FatherP {


    public void myPropertySon(){
        System.out.println("Father assest");
    }

    public void myFatherSon(){
        System.out.println("Granfather assest");
    }


    public static void main(String[] args) {

        Son f = new Son();
        f.myProperty();
        f.myFather();

    }

}
