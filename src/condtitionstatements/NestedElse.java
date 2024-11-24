package condtitionstatements;

public class NestedElse {

    public static void main(String[] args) {
        getResults(50);

    }

    public static void getResults(int marks){

        if (marks>80) {

            System.out.println("A++");

        } else if (marks>70 && marks<80)
        {
            System.out.println("A");

        } else if (marks>50 && marks<70)
        {
            System.out.println("B");
        } else {
            System.out.println("fail");
        }

        System.out.println("i am out of all block");
    }


}
