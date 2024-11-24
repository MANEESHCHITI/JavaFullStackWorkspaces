package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Overflow {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue(6);
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		pq.add(5);
		pq.add(6);
		System.out.println(pq);
		pq.remove(1);
		System.out.println(pq);
		pq.add(10);
		System.out.println(pq);
	}

}
