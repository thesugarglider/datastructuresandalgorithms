package stack;

import java.util.Stack;

public class Example01 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //push element into stack
        for(int element=1;element<=5;element++){
            stack.push(element);
        }

        int index = stack.search(4);
        System.out.println(index);



        //pop element
        for(int element=1;element<=5;element++){
            Integer ele = stack.pop();
            System.out.print(ele+" ");
        }

        System.out.println();

        System.out.println(stack.isEmpty());

    }
}
