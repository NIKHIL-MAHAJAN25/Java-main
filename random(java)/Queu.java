import java.util.LinkedList;
import java.util.Queue;

public class Sample32 {
    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        
        int sum = 0;

        
        for (int num : queue) {
            sum += num;
        }

        
        System.out.println("Sum of elements in the queue: " + sum);
    }
}

