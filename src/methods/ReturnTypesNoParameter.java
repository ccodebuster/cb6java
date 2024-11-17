package methods;

public class ReturnTypesNoParameter {

    public static void main(String[] args) {
        System.out.println(addition()); // one way

       int results= addition();  // second way
        System.out.println(results);
        String name=displayName();
        System.out.println(name);
        System.out.println(displayPin());
    }

    public static int addition(){
        int x=5;
        int y=6;
        int sum = x+y;
        return sum;
    }

    public static String displayName(){

        String name = "codebsuter";
        int pin = 3456;
        return name;

    }

    public static int displayPin(){

        String name = "codebsuter";
        int pin = 3456;
        return pin;

    }


}
