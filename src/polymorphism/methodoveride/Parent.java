package polymorphism.methodoveride;

public class Parent {

    public void printName(String name){
        System.out.println(name);
    }

    public void marry(){  //overridden method
        System.out.println("Indian Girl");
    }

    public  void person(){
        System.out.println("Teacher");
    }

    public void women(){
        System.out.println("Automation Tester");
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        p.printName("Java");
        p.marry();
        p.person();
        p.women();
    }
}
