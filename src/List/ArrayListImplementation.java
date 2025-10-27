package List;
import java.util.*;
public class ArrayListImplementation {
    public static void main(String[] args){

        /*The List interface in Java is a part of the java.util package and is a sub-interface
         of the Collection interface. It provides a way to store an ordered collection
         of elements (known as a sequence). Lists allow  for precise control over where
          elements are inserted and can contain duplicate elements.
         */
        /*An ArrayList is a resizable (dynamic) array — meaning its size can grow or shrink automatically
        when you add or remove elements.It stores elements in order, allows duplicates,
        and provides fast access using an index (like arrays).
         */

        List<Integer> list=new ArrayList<>();//we can use list bcz list is parent class of arraylist
        ArrayList<Integer> list1=new ArrayList<>();
        list.add(1);
        System.out.println(list);


    }
}
