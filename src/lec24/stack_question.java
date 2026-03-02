//question->Given a stack you have to find the last element or bottom element in the stack;
package lec24;
import java.util.*;
public class stack_question {
	public static void main(String []args)
	{
		Stack<Integer>s=new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(bottom_element(s));
		System.out.println(s);
	}
	public static int bottom_element(Stack<Integer>s) {
		if(s.size()==1)
		{
			return s.peek();
		}
		int ele=s.pop();
		int x=bottom_element(s);
		s.push(ele);
		return x;
	}
}
//Ques->insert a element at the bottom of stack.
//package lec24;
//import java.util.*;
//public class stack_question {
//	public static void main(String []args)
//	{
//		Stack<Integer>s=new Stack<>();
//		s.push(10);
//		s.push(20); 
//		s.push(30);
//		s.push(40);
//		insert_element(s,70);
//		System.out.println(s);
//	}
//	public static void insert_element(Stack<Integer>s,int element) {
//		if(s.size()==0)
//		{
//			s.push(element);
//			return ;
//		}
//		int ele=s.pop();
//		insert_element(s,element);
//		s.push(ele);
//	}
//}




//Question-->reverse a stack.
//package lec24;
//import java.util.*;
//public class stack_question {
//	public static void main(String []args)//Time Complexity is o(n2);
//	{
//		Stack<Integer>s=new Stack<>();
//		s.push(1);
//		s.push(2); 
//		s.push(3);
//		s.push(4);
//		System.out.println(s);
//		reverse(s);
//		System.out.println(s);
//	}
//	public static void reverse(Stack<Integer>s) {
//		if(s.size()==0)
//		{
//			return ;
//		}
//		int ele=s.pop();
//		reverse(s);
//		insert_down(s,ele);
//	}
//	public static void insert_down(Stack<Integer>s,int element) {
//		if(s.size()==0)
//		{
//			s.push(element);
//			return ;
//		}
//		int ele=s.pop();
//		insert_down(s,element);
//		s.push(ele);
//	}
//}
