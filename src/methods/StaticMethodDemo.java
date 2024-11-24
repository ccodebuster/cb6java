package methods;

public class StaticMethodDemo {

    public static void main(String[] args) {
        name();
        addition();
        InstanceMethods i = new InstanceMethods();
        i.m1();

    }


    public static void name(){
        System.out.println("Codebuster");
    }

    public static void addition(){
        System.out.println(5+6);
    }

    public void m3(){

    }

}
