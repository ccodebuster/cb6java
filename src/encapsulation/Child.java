package encapsulation;

public class Child {

    public static void main(String[] args) {
        Child c = new Child();
        c.user();
    }

    public void user(){
        Test t = new Test();
        t.setUserName("codebuster");
        t.setEmail("code@gmail.com");
        t.setPassword("123456");

        System.out.println("Username is "+  t.getUserName());
        System.out.println("email is "+ t.getEmail() );
        System.out.println("password is "+  t.getPassword() );
    }
}
