package queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Example01 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println(queue.peek());

        queue.poll();

        System.out.println(queue.peek());

        Integer element = queue.remove();
        System.out.println(element);

    }
}
