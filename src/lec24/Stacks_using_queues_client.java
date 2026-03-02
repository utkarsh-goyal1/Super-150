package lec24;
import java.util.*;
public class Stacks_using_queues_client {
	public static void main(String []args)
	{
		Stacks_using_queues st=new Stacks_using_queues();
		st.push(1);
		st.push(2);
		st.push(30);
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.pop());
	}
}
