package lec32;
import java.util.*;
public class Heap_Demo_2 {
	public static void main(String []args)
	{
		//PriorityQueue<Integer>pq=new PriorityQueue<>();//minHeap
		PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());//maxHeap
		pq.add(5);
		pq.add(6);
		pq.add(2);
		System.out.println(pq.peek());
	}
}
