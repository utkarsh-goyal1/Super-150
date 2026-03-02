package lec25;
import java.util.*;
public class Queue_client {
	public static void main(String []args)throws Exception
	{
		Queue q=new Queue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
		q.Display();
		q.Dequeue();
		q.Display();
		System.out.println(q.Getfront());
		
	}
}
