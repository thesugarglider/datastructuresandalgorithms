package deque;

import java.util.Deque;
import java.util.LinkedList;

public class Example01 {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        deque.offer(4);

        System.out.println(deque.peek());

        deque.offerLast(5);
        System.out.println(deque.peek());

        deque.offerFirst(6);
        System.out.println(deque.peek());

        System.out.println();

        for(int element=0;element<=5;element++){
            Integer ele = deque.poll();
            System.out.print(ele+" ");
        }
    }
}
