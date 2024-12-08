package polymorphism.methodoveride;

public class Child extends Parent{

    public void person(){
        System.out.println("salePerson");
    }

    public void women(){
        System.out.println("Manual Tester");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.marry();
        c.person();
        c.women();

        Parent p = new Parent();
        p.women();
    }
}
