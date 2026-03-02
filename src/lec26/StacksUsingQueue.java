package lec26;//push efficient
import lec25.Dynamic_Queue;
public class StacksUsingQueue {

	private Dynamic_Queue dq=new Dynamic_Queue();
	public boolean isEmpty()
	{
		return dq.isEmpty();
	}
	public int size()
	{
		return dq.size();
	}
	public void push(int item)throws Exception
	{
		dq.Enqueue(item);
	}
	public int pop()throws Exception
	{
		Dynamic_Queue hlp=new Dynamic_Queue();
		while(dq.size()>1)
		{
			hlp.Enqueue(dq.Dequeue());
		}
		int x=dq.Dequeue();
		while(hlp.size()>0)
		{
			dq.Enqueue(hlp.Dequeue());
		}
		return x;
	}
	public int peek()throws Exception
	{
		Dynamic_Queue hlp=new Dynamic_Queue();
		while(dq.size()>1)
		{
			hlp.Enqueue(dq.Dequeue());
		}
		int x=dq.Dequeue();
		while(hlp.size()>0)
		{
			dq.Enqueue(hlp.Dequeue());
		}
		dq.Enqueue(x);
		return x;
	}
	public static void main(String []args)throws Exception
	{
		StacksUsingQueue st=new StacksUsingQueue();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		System.out.println(st.peek());
		System.out.println(st.pop());
	}
}
