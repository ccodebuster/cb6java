package constructor;

public class Demo {


    String city;
    int number;


    public static void main(String[] args) {
        Demo d = new Demo("usa");
       String country= d.getCity();
        System.out.println(country);

    }

    Demo(String citys, int numbers){
        this.city = citys;
        this.number= numbers;
    }
    Demo(String citys){
        this.city = citys;
    }

    Demo(int numbers){
        this.number= numbers;
    }

    public void displayCityAndNumber(){
        System.out.println(city);
        System.out.println(number);
    }

    public  void displayCity(){
        System.out.println(city);
    }

    public  void displayNumber(){
        System.out.println(number);
    }

    public String getCity(){
        return city;
    }
}
