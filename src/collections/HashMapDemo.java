package collections;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {


        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("Name", "bhav");
        capitalCities.put("Surname", "patel");
        capitalCities.put("course", "testing");
        capitalCities.put("city", "delhi");

        HashMap<Integer, String> user = new HashMap<Integer, String>();
        user.put(1, "bhav");
        user.put(2, "tom");

        HashMap<Object, Object> data = new HashMap<Object, Object>();
        data.put(1, "code");
        data.put("india", "delhi");

        System.out.println(capitalCities);
        System.out.println(capitalCities.get("Name")); // bhav
        System.out.println(capitalCities.containsValue("bhav")); //true
        System.out.println(capitalCities.replace("Name", "Bhavesh"));
        System.out.println(capitalCities.get("Name")); //Bhavesh
        System.out.println(capitalCities.containsValue("Bhavesh")); //true
        System.out.println(capitalCities.containsValue("bhav")); //false
        System.out.println(capitalCities.entrySet()); //[city=delhi, course=testing, Surname=patel, Name=Bhavesh]
        System.out.println(capitalCities.keySet()); //[city, course, Surname, Name]
        System.out.println(capitalCities.values());//[delhi, testing, patel, Bhavesh]

        for(String key: capitalCities.keySet()){
            if(key.equalsIgnoreCase("Name")){
                System.out.println(key);
            }

        }

    }
}
