package condtitionstatements;

import java.util.Scanner;

public class SwitchStatements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any charactet to A to D");
        String city=scanner.nextLine();

        if(city.equalsIgnoreCase("a")){
            System.out.println("Ahmedabad");
        } else if (city.equalsIgnoreCase("b")) {
            System.out.println("bombay");
        } else if (city.equalsIgnoreCase("c")) {
            System.out.println("calcutta");
        } else if (city.equalsIgnoreCase("d")) {
            System.out.println("delhi");
        }else{
            System.out.println("doesnt match");
        }


        switch (city){
            case "A":
                System.out.println("Ahmedabad");
                break;
            case "b":
                System.out.println("bombay");
                break;
            case "c":
                System.out.println("calcutta");
                break;
            case "d":
                System.out.println("delhi");
                break;

            default:
                System.out.println("doesnt match");
        }
    }
}
