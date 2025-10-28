package List;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListConecept {
    public static void main(String[] args){
        /*In linked list Node we have two entity data and pointer to the next node
          This Java's Linkedlist uses doubly Linked List which has prev and next pointer
          Insert and deletion takes O(1) time and get elements takes O(n) TC
          Compare to arraylist linkedlist more memory  bcs each node store the value and next pointer
         */

        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.addLast(15);//element will be added at last in LL
        linkedList.addFirst(20);//element will be added at the begining of the ll
        linkedList.add(2);
        System.out.println(linkedList);
        System.out.println(linkedList.get(2));//0(n) TC

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
//        linkedList.remove(1);//remove th element at specific index
//        linkedList.removeFirst();
//        linkedList.removeLast();
        System.out.println(linkedList);
        //linkedList.removeFirstOccurrence(2);
        linkedList.removeLastOccurrence(2);
        linkedList.removeIf(x->x%2!=0);//if condition true the element will be removed

        System.out.println(linkedList);

        LinkedList<String> animals=new LinkedList<>(Arrays.asList("Cat","Dog","Rabbit"));
        LinkedList<String> removeAnimal=new LinkedList<>(Arrays.asList("Cat","Dog"));

        removeAnimal.removeAll(animals);
        System.out.println(animals);//prints [cat,dog,rabbit]
        System.out.println(removeAnimal);//prints empty list



    }
}
