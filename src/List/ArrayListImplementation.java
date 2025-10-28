package List;
import java.util.*;
public class ArrayListImplementation {
    public static void main(String[] args){

        /*The List interface in Java is a part of the java.util package and is a sub-interface
         of the Collection interface. It provides a way to store an ordered collection
         of elements (known as a sequence). Lists allow  for precise control over where
         elements are inserted and can contain duplicate elements.*/

        /*An ArrayList is a resizable (dynamic) array — meaning its size can grow or shrink automatically
          when you add or remove elements.It stores elements in order, allows duplicates,
          and provides fast access using an index (like arrays).*/

        List<Integer> list=new ArrayList<>();//we can use list bcz list is parent class of arraylist
        ArrayList<Integer> list1=new ArrayList<>();
        list.add(1);//add the value at last
        list.add(0,2);//add the value at specific index

        System.out.println(list.get(0));/*print the element based on the index to get the element O(1)TC */

        list.add(80); //O(n) TC It takes
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(0));//gives true or false based on the value present in the list

        list.remove(0);//based on the index element will be removed from the list
        System.out.println(list);

        list.set(1,3);//specific index element will be replaced
        System.out.println(list);
        list.sort(null);
        System.out.println(list);
    }
}
