package publicaccessmodifiers;

public class ClassBPublic {


    public static void main(String[] args) {
        ClassAPublic a = new ClassAPublic();  //Create an object
        System.out.println(a.fname);  // calling variable using object
        System.out.println(a.lname);  // calling variable using object
    }

}
