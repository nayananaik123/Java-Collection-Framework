package List;

import java.util.*;
//class MyComparator implements Comparator<Integer> {
//    public int compare(Integer a,Integer b){
//        return a-b; //if -ve a will come 1st if positive b will come first ascending order sorting
//    }
//}
class MyComparator implements Comparator<Integer> {
    public int compare(Integer a,Integer b){
        return b-a; //if -ve a will come 1st if positive b will come first ascending order sorting
    }
}
public class ComparatorConcept {
    public static void main(String[] args){

        List<Integer> list =new ArrayList<>();
        list.add(7);
        list.add(2);
        list.add(3);

        list.sort(new MyComparator());
        System.out.println(list);

    }

}
