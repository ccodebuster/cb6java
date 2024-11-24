package publicaccessmodifiers;

import methods.InstanceMethods;

public class ClassAPublic {

    String fname ="code"; //Declared Instance Variable
  public   String lname ="buster"; //Declared Instance Variable
    public static void main(String[] args) {

        InstanceMethods i = new InstanceMethods();
        i.m1();

    }

}
