package Basics.Arrays;
import java.util.ArrayList;
import java.util.List;

public class arrayList {
    public static void main(String[] args){
        List list = new ArrayList();
        // adding element to the list
        list.add(2);
        list.add("ME");
        list.add("AMANKWAH");
        list.add("KOFI");
        list.add("DANIEL");

        //the position of element'peace' in the list
        list.indexOf("ME");
        list.contains("AMANKWAH");//check if a is the list
        //remove
        list.remove(1);// remove element at index 1
        //list.clear();//clear element in the list
        list.isEmpty();//check if the list  is empty
        list.set(1, "AMANKWAH");// replace at the index 2 with 'Maker'
        // display
        System.out.println(list.toString());// getting all the element in the array list
        System.out.println(list.size());// the size of the list(or the length as in the case of array)
        System.out.println(list.get(1));// getting a particular element from the list in a specified position

    }
}
