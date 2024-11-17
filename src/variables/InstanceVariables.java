package variables;

public class InstanceVariables {


        int x= 5;  // global instance variable
        static int y= 10;  //global static  variable

    public static void main(String[] args) {
        int a = 12; // local variable

        System.out.println(a);

         // ClassName refVariable = new ClassName();
        InstanceVariables t = new InstanceVariables();
        System.out.println(t.x);
        System.out.println(y);

    }

    public void m1(){

        System.out.println(x);
        System.out.println(y);
    }


    public static void m2(){
        InstanceVariables m = new InstanceVariables();
        System.out.println(m.x);
        System.out.println(y);
    }
}
