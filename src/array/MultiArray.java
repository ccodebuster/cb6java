package array;

public class MultiArray {

    public static void main(String[] args) {
        /*
        * -------------------------------
        * |  usa    |   newyork         |
        * |  france |   paris           |
        * |  india  |   goa             |
        * _______________________________
        * */

         String display [][] = new String[3][2];
            display[0][0] =  "usa";
            display[0][1] = "newyork";
            display[1][0] =  "france";
            display[1][1] = "paris";
            display[2][0] = "india";
            display[2][1] = "goa";

        System.out.println(display[1][0]);
    }
}
