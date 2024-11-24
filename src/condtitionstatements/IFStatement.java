package condtitionstatements;

public class IFStatement {

    public static void main(String[] args) {
        getResults(23);

    }

    public static void getResults(int marks){
        String name= "code2";
        if (marks>35) {

            System.out.println("pass");
        }
         if(name=="code1"){
             System.out.println("name match");
         }

    }
}
