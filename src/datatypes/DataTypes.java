package datatypes;

public class DataTypes {

    public static void main(String[] args) {
         // primitive datatypes
        String fullName = "Bhav patel";
        String lastName = "Bhavesh Patel1";

        // non-primitive datatypes

        byte num = 125; //Stores whole numbers from -128 to 127
        short num1 = 32761; //Stores whole numbers from -32,768 to 32,767
        int num2 = 2147483645; //	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long num3 = 2147483645; // Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float num4 = 21.456f; // Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double num5 = 21.456; // Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
        boolean result = true; // Stores true or false values
        boolean result1 =(5==6);
        String  result2 =("false");
        boolean nameCompare =(fullName==lastName);
        char a = 'a'; //Stores a single character/letter or ASCII values

        System.out.println("bhavesh"); // printing without data types
        System.out.println(fullName); // printing with data types ---> String
        System.out.println(num); // printing with data types ---> byte,
        System.out.println(num1); // printing with data types ---> short,
        System.out.println(num1); // printing with data types ---> short,
        System.out.println(num2); // printing with data types ---> int,
        System.out.println(num4); // printing with data types ---> long,
        System.out.println(num5); // printing with data types ---> double,
        System.out.println(result); // printing with data types ---> boolean,
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(nameCompare);
        System.out.println(a);
    }
}
