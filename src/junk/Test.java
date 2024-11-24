package junk;

public class Test {

    int x = 5;
    static String name = "code1";

    public static void main(String[] args) {
      Test t = new Test();
     // t.m1();
     // m2();
      displayName("code1");
      int result = addition(5, 2);
      multiplication(result, result);
      multiplication(addition(5, 2), addition(5,2));

    }

    public void m1(){
        System.out.println(x);
        System.out.println(name);

    }
    public static void m2(){
        Test t = new Test();
        System.out.println(t.x);
        System.out.println(name);

    }

    public static void displayName(String name){
            System.out.println(name);
    }

    public static int addition(int x, int y){
        int sum=x+y;
        return x;
    }

    public static void additionNR(int x, int y){
        int sum=x+y;
        System.out.println(sum);
    }

    public static void multiplication(int x, int y){
        System.out.println(x*y);
    }



}
