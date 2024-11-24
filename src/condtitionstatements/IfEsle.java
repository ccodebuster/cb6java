package condtitionstatements;

public class IfEsle {

    public static void main(String[] args) {
        getResults(12);

    }

    public static void getResults(int marks){

        if (marks>35) {

            System.out.println("pass");
        }else{
            System.out.println("fail");
        }


    }
}
