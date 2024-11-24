package protectedaccessmodifier;

public class ClassAProtected {


    protected  int a = 500;
    protected  String name = "CodeBuster";

    public static void main(String[] args) {
        ClassAProtected p = new ClassAProtected();
        System.out.println(p.a);
        System.out.println(p.name);

    }
}
