package queueExample;


import java.util.ArrayDeque;
import java.util.Deque;
public class dqueue1 {

	
	

	
	    public static void main(String[] args) {

	        Deque<Integer> dq = new ArrayDeque<>();

	        dq.addFirst(10);
	        dq.addLast(20);
	        dq.addFirst(5);
	        dq.addLast(30);

	        System.out.println(dq);

	        System.out.println(dq.removeFirst());
	        System.out.println(dq.removeLast());
	    }
	}

