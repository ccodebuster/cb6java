package doubt;

public class Person {
    /*Write a class with the name Person. The class needs three fields (instance variables) with the names
firstName, lastName of type String and age of type int.
Write the following methods(instance methods):
*Method named getFirstName without any parameters, it needsto return the value of the firstName
field.
*Method named getLastName without any parameters, it needs to return the value of the lastName
field.
*Method named getAge without any parameters, it needs to return the value of the age field.
*Method named setFirstName with one parameter of type String, it needs to set the value of the
firstName field.
*Method named setLastName with one parameter oftype String, it needs to set the value of the
lastName field.
*Method named setAge with one parameter of type int, it needs to set the value of the age field. If
the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
*Method named isTeen without any parameters, it needs to return true if the value of the age field is
greaterthan 12 and lessthan 20, otherwise, return false.
*Method named getFullName without any parameters, it needs to return the full name ofthe person.
*In case both firstName and lastName fields are empty, Strings return an empty String.
*In case firstName is an empty String, return firstName.
*In case lastName is an empty String, return lastName.

To check if s String is empty, use the method isEmpty from the String class. For example,
firstName.isEmpty() returns true if the String is empty or in other words, when the String does not
contain any characters.
TEST EXAMPLE

TEST CODE: (Write below code in to main method then check out put)
Person person = new Person();
person.setFirstName(""); // firstName is set to empty string
person.setLastName(""); // lastName is set to empty string
person.setAge(10);
System.out.println("fullName= " + person.getFullName());
System.out.println("teen= " + person.isTeen());
person.setFirstName("John"); // firstName is set to John
person.setAge(18);
System.out.println("fullName= " + person.getFullName());
System.out.println("teen= " + person.isTeen());
person.setLastName("Smith"); // lastName is set to Smith
System.out.println("fullName= " + person.getFullName());

OUTPUT
fullName=
teen= false
fullName= John
teen= true
fullName= John Smith
NOTE: All methods should be defined as public NOT public static.
NOTE: In total, you have to write 8 methods.*/

   private String firstname;
   private String lastname;
   private int age;

    public String getFirstName(){
        return firstname;
    }

    public String getLastName(){
        return lastname;
    }

    public int getAge(){
        return age;
    }

    public void setFirstName(String firstname){
        this.firstname=firstname;
    }

    public void setLastName(String lastname){
        this.lastname=lastname;
    }

    public void setAge(int age){
        if(age>0 && age<100){
            this.age=age;
        }else{
            this.age=0;
        }

    }

    public boolean isTeen(){
        if(age>12 && age<20){
            return true;
        }else
        {
            return false;
        }
    }

    public String getFullName(){
        if(firstname.isEmpty()){
            return lastname;
        }
        if(lastname.isEmpty()){
            return firstname;
        }if(firstname.isEmpty() && lastname.isEmpty()){
            return "";
        }else{
            return firstname + " " + lastname;
        }
    }

    public static void main(String[] args) {
        Person person = new Person();
          person.setFirstName(""); // firstName is set to empty string
          person.setLastName(""); // lastName is set to empty string
          person.setAge(10);
          System.out.println("fullName= " + person.getFullName());
          System.out.println("teen= " + person.isTeen());
          person.setFirstName("John"); // firstName is set to John
          person.setAge(18);
         System.out.println("fullName= " + person.getFullName());
          System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
}
