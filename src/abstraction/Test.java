package abstraction;

public class Test extends Child {


    @Override
    void age() {
        System.out.println("25");
    }

    @Override
    void surname() {
        System.out.println("pat");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.m1();
    }


}
