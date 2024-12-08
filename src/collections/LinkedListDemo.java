package collections;

import java.util.LinkedList;

public class LinkedListDemo {

    /*
    * The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.

The LinkedList class has all of the same methods as the ArrayList class because they both implement the List interface. This means that you can add items, change items, remove items and clear the list in the same way.

However, while the ArrayList class and the LinkedList class can be used in the same way, they are built very differently.

How the ArrayList works
The ArrayList class has a regular array inside it. When an element is added, it is placed into the array. If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.

How the LinkedList works
The LinkedList stores its items in "containers." The list has a link to the first container and each container has a link to the next container in the list. To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.*/

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("code1");
        names.add("code2");
        names.add("code3");
        names.add("code4");
        names.add("code1");

        LinkedList<String> names2 = new LinkedList<>();
        names2.add("code7");
        names2.add("code8");
        names2.add("code9");

        System.out.println(names.getFirst()); // code1
        System.out.println(names.getLast()); // code1
        names.addAll(names2); // add names2 collection

        System.out.println("--------------------");
        for(String name:names){
            System.out.println(name);
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        names.removeAll(names2); // remove names2 collection
        for(String name:names){
            System.out.println(name);
        }
    }
}
