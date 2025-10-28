package List;
import java.util.*;
public class VectorDemo {

    public static void main(String[] args){
        /*
            1️⃣ Dynamic Size – Grows automatically when elements are added beyond its current capacity.
            2️⃣ Synchronized – Thread-safe; only one thread can access it at a time.
            3️⃣ Legacy Class – Introduced in JDK 1.0; now mostly replaced by ArrayList.
            4️⃣ Random Access – Provides fast access to elements using an index (O(1)).
            5️⃣ Resizing – Capacity doubles each time it becomes full.
            6️⃣ Performance – Slower than ArrayList because of synchronization overhead.
            7️⃣ Implements List Interface – Supports all list operations like add, remove, get, etc.
         */


//        Vector<Integer> vector=new Vector<>(5,3);//I can give how much it should increment after list fulled
//                                                                          // and new element is added
//        System.out.println(vector.capacity());//at first the capacity will be 10
//        vector.add(1);
//        vector.add(1);
//        vector.add(1);
//        vector.add(1);
//        vector.add(1);
//        System.out.println(vector.capacity());
//        vector.add(2);
//        System.out.println(vector.capacity());
//

        Vector<Integer> list=new Vector<>();

        Thread t1=new Thread(()->{
            for(int i=0;i<1000;i++){
                list.add(i);

            }
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<500;i++){
                list.add(i);
            }
        });

        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Size of list: " + list.size()); // Output: 1500 for vector



    }
}
