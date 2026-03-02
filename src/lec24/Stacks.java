package lec24;
import java.util.*;
public class Stacks {
	public static void main(String []args)
	{
		Stack<Integer> st=new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		System.out.println(st.peek());
		System.out.println(st);//Here address is not print because to string method is override.
		System.out.println(st.pop());
		System.out.println(st);
	}

}
