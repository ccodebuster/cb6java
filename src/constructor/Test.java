package constructor;

public class Test {
    String name;
    int age;

    Test() {  //0-arguments constructor
        System.out.println("Zero Arguments Constructor");
    }

    Test(String name) {       //One-arguments constructor

        this.name=name;
    }

    Test(int age) {          //One-arguments constructor
        this.age= age;
    }

    Test(int age, String name) {   //Two-arguments constructor

        this.name= name;        //reperesent current class object using this keyword
        this.age = age;     //reperesent current class object using this keyword
    }

    public String getName(){        //Return type without parameters method
        return name;
    }

}
