package operators;

public class Operatores {
    public static void main(String args[]){
        int a =5, b= 10, c =20, d = 5;

        //Airthmatic operators

        System.out.println("Addition of " +a+ " and " +b+ " = " +(a+b));
        System.out.println("Subtraction of " +c+ " and " +b+ " = " +(c-b));
        System.out.println("Multiplication of " +c+ " and " +a+ " = " +(c*a));
        System.out.println("Division of " +c+ " and " +b+ " = " +(c/b));
        System.out.println("Modulus of " +c+ " and " +b+ " = " +(c%b));
        System.out.println("Increment of a "+(++a));
        System.out.println("Decrement of b " +(--b));

        a += 15;
        b -= 2;
        c *= 2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        //Logical Operators
        boolean result = b>a;
        boolean result1 = a>b;
        boolean result2 = b<c;
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);



        boolean logicalAnd = b>a && c>b;
        boolean logicalAnd1 = b>a && b>c;
        System.out.println(logicalAnd);
        System.out.println(logicalAnd1);


        boolean logicalOr = d>c || c>b;
        boolean logicalOr1 = d>c || c<b;
        System.out.println(logicalOr);
        System.out.println(logicalOr1);


        boolean logicalNot = !(b>a);
        System.out.println(logicalNot);


        //Relational Operators

        boolean isEqualTo = (d==a);
        boolean isNotEqualTo = !(c==a);
        System.out.println(isEqualTo);
        System.out.println(isNotEqualTo);

        boolean isGreterThan = c>d;
        boolean isGreterThan1 = c>=d;

        System.out.println(isGreterThan);
        System.out.println(isGreterThan1);


        boolean isLessThan = b<a;
        boolean isLessThan1 = c<=d;

        System.out.println(isLessThan);
        System.out.println(isLessThan1);

    }

}
