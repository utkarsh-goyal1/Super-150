package lec24;
import java.util.*;//pop efficient
//public class Stacks_using_queues {
//	Queue<Integer>q1;
//    Queue<Integer>q2;
//    public Stacks_using_queues() {
//        q1=new LinkedList<>();
//        q2=new LinkedList<>();
//    }
//    
//    public void push(int x) {
//        while(!q1.isEmpty())
//        {
//            q2.add(q1.remove());
//        }
//        q1.add(x);
//        while(!q2.isEmpty())
//        {
//            q1.add(q2.remove());
//        }
//    }
//    public int pop() {
//        return q1.remove();
//    }
//    
//    public int peek() {
//        return q1.peek();
//    }
//    
//    public boolean empty() {
//        if(q1.size()==0)
//        {
//            return true;
//        }
//        return false;
//    }
//}
//STACK USING ONE QUEUE:-------------------------------------------------------------------------------------------------------------------------

public class Stacks_using_queues {
	Queue<Integer>q1;
    public Stacks_using_queues() {
        q1=new LinkedList<>();
    }
    
    public void push(int x) 
    {
        int size=q1.size();
        q1.add(x);
        for(int i=0;i<size;i++)
        {
        	q1.add(q1.remove());
        }
    }
    public int pop() {
    	return q1.remove();
    	
    } 
    public int peek() {
    	return q1.peek();
    }
    
    public boolean empty() {
        if(q1.size()==0)
        {
            return true;
        }
        return false;
    }
}
