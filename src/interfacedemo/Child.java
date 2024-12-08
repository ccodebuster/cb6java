package interfacedemo;

public class Child implements Father{

    public static void main(String[] args) {
        Child c = new Child();
        c.age();
    }

    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    public void name() {
        System.out.println("code");
    }

    @Override
    public void age() {
        System.out.println("2");
    }
}
