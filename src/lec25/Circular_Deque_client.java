package lec25;
import java.util.*;
public class Circular_Deque_client {
	public static void main(String []args)
	{
		Circular_Deque dq=new Circular_Deque(5);
		dq.insertFront(1);
		dq.insertLast(2);
		System.out.println(dq.getRear());
		System.out.println(dq.getFront());
		
	}
}
