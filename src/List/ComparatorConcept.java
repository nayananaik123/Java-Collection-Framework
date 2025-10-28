package List;

import java.util.*;
//class MyComparator implements Comparator<Integer> {
//    public int compare(Integer a,Integer b){
//        return a-b; //if < 0 → a should come before b if = 0 → a and b are equal for sorting if > 0 → a should come after b
//    }
//}

//class MyComparator implements Comparator<Integer> {
//    public int compare(Integer a,Integer b){
//        return b-a; //if -ve a will come 1st if positive b will come first ascending order sorting
//
//    }
//}

//class MyComparator implements Comparator<String> {
//    public int compare(String s1 ,String s2){
//        return s2.length()-s1.length(); //if -ve a will come 1st if positive b will come first ascending order sorting
//    }
//}


public class ComparatorConcept {
    public static void main(String[] args){

        List<Integer> list =new ArrayList<>();
        list.add(7);
        list.add(2);
        list.add(3);

        List<String> list1=new ArrayList<>(Arrays.asList("banana","apple","watermelon"));
        list1.sort((a,b)->a.length()-b.length());
        list1.sort((a,b)->b.length()-a.length());

        System.out.println(list1);

    }

}
