package queueExample;

import java.util.PriorityQueue;
public class dequeue2 {

	

	

	

	    public static void main(String[] args) {

	        PriorityQueue<Integer> pq = new PriorityQueue<>();

	        pq.add(50);
	        pq.add(10);
	        pq.add(30);
	        pq.add(20);

	        System.out.println("Highest priority: " + pq.peek());

	        while (!pq.isEmpty()) {
	            System.out.println(pq.poll());
	        }

	        for (Integer x : pq) {
	            System.out.println(x);
	        }
	    }
	}

