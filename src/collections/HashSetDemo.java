package collections;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> city = new HashSet<String>();
        city.add("london");
        city.add("paris");
        city.add("newyork");
        city.add("delhi");
        city.add("delhi");
        city.add("delhi");
        city.add("delhi");
        city.add("delhi");
        city.add("delhi");
        System.out.println(city);
        System.out.println(city.size());
        System.out.println(city.contains("london"));
        System.out.println(city.contains("mumbai"));
    }
}
