package polymorphism;

public class Method_Overload {


    public void addition(int a, int b) {
        System.out.println("This method contains integer datatype with variable a and b");
        System.out.println("Addition of a and b " + (a + b));
    }


    public void addition(int a, int b, int c) {
        System.out.println("This method contains integer datatype with variable a,b and c");
        System.out.println("Addition of a and b and c " + (a + b + c));
    }

    public void addition(int a) {
        System.out.println("This method contains integer datatype with variable a");
        System.out.println(a);
    }

    public void addition(String fname, String lname) {
        System.out.println("This method contains string datatype with variable fname and lname");
        System.out.println(fname + lname);

    }

    public void addition(String fname, int a) {
        System.out.println("This method contains string datatype with variable fname and data type int with variable a");
        System.out.println(fname);
        System.out.println(a);
    }

    public void addition(int a, String fname) {
        System.out.println("This method contains string datatype with variable fname and data type int with variable a");
        System.out.println(fname);
        System.out.println(a);
    }

    public static void main(String[] args) {
       Method_Overload m = new Method_Overload();
        m.addition("vaidehi", 30);
        m.addition("Gaurang", 30);
        m.addition("Bhavesh", 30);
        m.addition(10, 20, 30);
        m.addition(25);
        m.addition(200, 200);
        m.addition("Codebuster", "Java");


    }


}
