package loop;

public class loopDemo {

    static String name = "code";
   static int [] number = {3, 5, 6, 7, 8,9};


    public static void main(String[] args) {

         String [][] display  = new String[3][2];
        display[0][0] =  "usa";
        display[0][1] = "newyork";
        display[1][0] =  "france";
        display[1][1] = "paris";
        display[2][0] = "india";
        display[2][1] = "goa";

       /* for( int i=1; i<=5; i++ ){

            System.out.println(name);
        }*/
        int lengthOfArray =number.length;

        for( int i=0; i<=number.length-1; i++ ){

            System.out.println(number[i]);

        }

        /*
         * -------------------------------
         * |  usa    |   newyork         |
         * |  france |   paris           |
         * |  india  |   goa             |
         * _______________________________
         * */

        for( int i=0; i<=display.length-1; i++ ){

            for(int j=0 ; j<display[i].length; j++){
                System.out.println(display[i][j]);
            }

        }

    }
}
