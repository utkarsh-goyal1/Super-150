package lec24;
import java.util.*;//Dequeue operation costly
public class Implement_Queue_Using_two_stacks {
	    Stack<Integer>st1;
	    Stack<Integer>st2;
	    public Implement_Queue_Using_two_stacks()
	    {
	        st1=new Stack<>();
	        st2=new Stack<>();
	    }
	    public void Enqueue(int x) {
	        st1.push(x);
	    }
	    
	    public int Dequeue() {
	        while(!st1.isEmpty())
	        {
	            st2.push(st1.pop());
	        }
	        int ans=st2.pop();
	        while(!st2.isEmpty())
	        {
	            st1.push(st2.pop());
	        }
	        return ans;
	    }
	    
	    public int getFront() {
	        while(!st1.isEmpty())
	        {
	            st2.push(st1.pop());
	        }
	        int ans=st2.peek();
	        while(!st2.isEmpty())
	        {
	            st1.push(st2.pop());
	        }
	        return ans;
	    }
	    
	    public boolean empty() {
	        if(st1.size()==0)
	        {
	            return true;
	        }
	        return false;
	    }
	}
//By making Enqueue operation costly.
//public class Implement_Queue_Using_two_stacks {
//    Stack<Integer>st1;
//    Stack<Integer>st2;
//    public Implement_Queue_Using_two_stacks()
//    {
//        st1=new Stack<>();
//        st2=new Stack<>();
//    }
//    
//    public void Enqueue(int x) {
//        while(!st1.isEmpty())
//        {
//        	st2.push(st1.pop());
//        }
//        st1.push(x);
//        while(!st2.isEmpty())
//        {
//        	st1.push(st2.pop());
//        }
//    }
//    public int Dequeue() {
//        int ans=st1.pop();
//        return ans;
//    }
//    
//    public int getFront() {
//        return st1.peek();
//    }
//    
//    public boolean empty() {
//        if(st1.size()==0)
//        {
//            return true;
//        }
//        return false;
//    }
//}









//IMPLEMENT QUEUE USING ONE STACK.
//public class Implement_Queue_Using_two_stacks
//{
//	Stack<Integer>st1;
//	public Implement_Queue_Using_two_stacks()
//	{
//	  st1=new Stack<>();
//	}
//	
//	public void Enqueue(int x) {
//	 st1.push(x);
//	}
//	
//	public int Dequeue() {
//		if(st1.size()==1)
//		{
//			return st1.pop();
//		}
//		int x=st1.pop();
//		int ans=Dequeue();
//		st1.push(x);
//		return ans;
//	}
//	
//	public int getFront() {
//		if(st1.size()==1)
//		{
//			return st1.peek();
//		}
//		int x=st1.pop();
//		int ans=getFront();
//		st1.push(x);
//		return ans;
//	}
//	
//	public boolean empty() {
//	  if(st1.size()==0)
//	  {
//	      return true;
//	  }
//	  return false;
//	}
//}