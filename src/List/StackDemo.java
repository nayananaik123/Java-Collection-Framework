package List;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args){
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        int removed=stack.pop();//remove the last inserted element and return that
        System.out.println(stack);
        int ele=stack.peek();
        System.out.println(stack);





    }
}
