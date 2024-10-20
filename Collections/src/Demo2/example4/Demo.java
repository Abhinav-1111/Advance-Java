package Demo2.example4;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(4);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("Contents of queue are: " + queue);

        queue.remove(1);
        System.out.println("Contents of queue are: " + queue);

        queue.remove(Integer.valueOf(1));
        System.out.println("Contents of queue are: " + queue);
    }
}
