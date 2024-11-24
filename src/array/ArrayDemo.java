package array;

public class ArrayDemo {

    public static void main(String[] args) {
        int justNum = 6;
        String surname = "patel";
         int [] number = {3, 5, 6, 7, 8,9};

        String[] name = {"bhav", "codebuster", "code1", "code2"};

        System.out.println(surname.length()); //5
        System.out.println(justNum);
        System.out.println(number[3]); //7
        System.out.println(name[3]); //code 2
        System.out.println(name.length); //4
        name[3]="code3";
        System.out.println(name[3]);

    }
}
