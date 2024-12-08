package polymorphism.constructorLoading;

public class ConstructorOverloading {

    public ConstructorOverloading(int a , int b){
        System.out.println(a);
        System.out.println(b);
    }

    public ConstructorOverloading(int b){
        System.out.println(b);
    }

    public ConstructorOverloading(String name, String name1){
        System.out.println(name + name1);
    }

    public ConstructorOverloading(String name, int x){
        System.out.println(name);
        System.out.println(x);
    }

    public static void main(String[] args) {
        ConstructorOverloading c  = new ConstructorOverloading(10,100);
        ConstructorOverloading c1  = new ConstructorOverloading("Java is a ","Robust Language");
        ConstructorOverloading c3  = new ConstructorOverloading(500);
        ConstructorOverloading c4  = new ConstructorOverloading("Codebuster","Testing");
        ConstructorOverloading c5  = new ConstructorOverloading("Codebuster",1000);

    }
}
