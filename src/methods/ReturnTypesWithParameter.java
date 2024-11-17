package methods;

public class ReturnTypesWithParameter {

    public static void main(String[] args) {
      int results= addition(5, 6);
        System.out.println(results);
        int results1= addition(5, 10);
        System.out.println(results1);
    }


    public  static int addition(int x , int y){
        int sum = x+y;
        return sum;
    }
}
