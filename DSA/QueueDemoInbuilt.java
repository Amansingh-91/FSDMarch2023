package DSA;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemoInbuilt {
    public static void main(String[] args) {
        Queue<String> q =  new LinkedList<>();
        q.add("Aman");
        System.out.println(q.remove());

        q.remove();
        
    }
}
