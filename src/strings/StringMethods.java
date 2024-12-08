package strings;

public class StringMethods {



  static String name = "codebuster";
  static String name2 = "BHAVESH";
  static String name3 = "bhavesh";

    public static void main(String[] args) {
        stringManipulation();

    }

    public  static  void stringManipulation(){

        System.out.println("changes to upper case "+name.toUpperCase()); // change to uppercase
        System.out.println("changes to lower case "+name2.toLowerCase());
        System.out.println("concat "+name2.concat(" "+name));
        System.out.println("concat "+name2.concat(" patel"));
        System.out.println("length of string "+name.length());
        System.out.println(name2.equalsIgnoreCase(name3));
        System.out.println(name.charAt(3));
        System.out.println(name.replace('e','0'));
        System.out.println(name.isEmpty());

    }



}
