package collections;

import java.util.ArrayList;

public class ArrayListDemo {

    /*
     * ArrayList supports dynamic array that can grow as needed
     * It can contain duplicate element and it also maintains the insertion order
     * manipulation is slow because a lot of shifting to be occured if any elemet is removed from the array list
     * Arrylist not synchronised
     * Arraylist allows random access because it works on the index basis
     * */

    //String name = "code";
    static String [] mixData = {"bhav", "codebuster", "city", "london"}; // fixed
    public static void main(String[] args) {

        name();
    }

    public static void name(){
        ArrayList<String> city = new ArrayList<>();
        city.add("london");
        city.add("paris");
        city.add("newyork");
        city.add("delhi");
        city.add("delhi");
        city.add("delhi");
        city.add("delhi");
        city.add("delhi");
        city.add("delhi");


        ArrayList<String> names = new ArrayList<>();
        names.add("code");
        names.add("code1");
        names.add("code2");
        names.add("code4");
        names.add("code3");

        System.out.println(names); //[code, code1, code2, code4, code3]
        names.addAll(city); //adding city collection into names collections
        System.out.println(names); //[code, code1, code2, code4, code3, london, paris, newyork, delhi]
        names.removeAll(city);
        System.out.println(names); //[code, code1, code2, code4, code3]
        System.out.println(names.get(2)); // code 2
        System.out.println(names.set(2, "code22"));
        System.out.println(names.get(2)); // code 22
        System.out.println(names); //[code, code1, code22, code4, code3]
        System.out.println(names.remove(4)); //code3
        System.out.println(names); //[code, code1, code22, code4]
      /*  for(String name:names){
            System.out.println(name);
        }*/
        System.out.println(city);
        city.clear();
        System.out.println(city);

    }
}
