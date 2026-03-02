package lec24;

public class Stack_client {
	public static void main(String []args)throws Exception {
	Stack_form st=new Stack_form();
	st.peek();
	st.push(5);
	st.push(2);
	st.push(8);
	System.out.println(st);
	st.Display();

	}	
}
