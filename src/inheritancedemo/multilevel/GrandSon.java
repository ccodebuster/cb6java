package inheritancedemo.multilevel;

public class GrandSon extends SonP {

    public void myPropertyGranSon(){
        System.out.println("Father assest");
    }

    public void myFatherGranSon(){
        System.out.println("Granfather assest");
    }

    public static void main(String[] args) {

        GrandSon g = new GrandSon();
        g.myFatherSon();
        g.myPropertySon();
        g.myFather();
        g.myProperty();



    }
}
