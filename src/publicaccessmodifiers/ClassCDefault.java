package publicaccessmodifiers;

public class ClassCDefault {

    public String text = "Java";

    static String text1 = "Language";

    public static void main(String[] args) {
        ClassAPublic a= new ClassAPublic();  //Create an Object of differnt class in same package
        System.out.println(a.fname); //calling variable using object
        System.out.println(a.lname); //calling variable using object

        ClassCDefault c = new ClassCDefault();  //Create an object of same class
        System.out.println(c.text); //calling variable using object
        System.out.println(text1); //calling variable directly
    }
}
