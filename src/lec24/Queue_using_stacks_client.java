package lec24;
import java.util.*;
public class Queue_using_stacks_client {
	public static void main(String []args)
	{
		Implement_Queue_Using_two_stacks q=new Implement_Queue_Using_two_stacks();
		q.Enqueue(1);
		q.Enqueue(2);
		System.out.println(q.getFront());
		q.Enqueue(5);
		q.Enqueue(7);
		q.Enqueue(8);
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());
		
	}
}
