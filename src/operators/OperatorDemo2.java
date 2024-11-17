package operators;

public class OperatorDemo2 {

    public static void main(String[] args) {
                int a =10;
                int b = 5;
                int x =10;
                int y=10;
                int z =15;
     // comparison operators
        /*
        *         ==	Equal to	x == y
                !=	Not equal	x != y
                >	Greater than	x > y
                <	Less than	x < y
                >=	Greater than or equal to	x >= y
                <=	Less than or equal to	x <= y*/
        System.out.println(a>b); // true
        System.out.println(a<b);  // false
        System.out.println(x>=y); // true
        System.out.println(x<=y); // true
        System.out.println(x<=z); // true
        System.out.println(x>=z); // false
        System.out.println(x==y);  // true
        System.out.println(x!=y);  // false
        System.out.println(y!=z);  // true

       // logical operators  &&, ||, !
        //  && 	Logical and	Returns true if both statements are true
        //  || 	Logical or	Returns true if one of the statements is true
        System.out.println( "logical "+ (  (x<5) || (y>8)  )   );
    }
}
