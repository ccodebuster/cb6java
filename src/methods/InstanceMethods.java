package methods;

public class InstanceMethods {
    int x= 5;  // global instance variable
    static int y= 10;  //global static  variable

    public static void main(String[] args) {
        int a=5;
        System.out.println(a);
        InstanceMethods m = new InstanceMethods();
        m.m1();
        m2();
    }

    public void m1(){

        System.out.println(x);
        System.out.println(y);
    }

    public static void m2(){
        InstanceMethods m = new InstanceMethods();
        System.out.println(m.x);   // access through object
        System.out.println(y);  // direct access
        System.out.println(InstanceMethods.y); //calling through class name
    }


}
