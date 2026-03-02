package Oops2;

public interface StackI extends Dynamic_StackI,Data_Str{
	public void push(int item);
	
	public int pop();
	
	public int peek();
	
	public static final int x=9;//final represents constant variable
	

	//when we use final keyword with the method then this method can not be override.
	//when we use final keyword with the class then this class can not be inherit.
	
	//java 8 main default method ko body de sakte hain
	//	default void fun() {
	//		
	//	}
	//	//java 8 main public static method ko bhi body de sakte hain.
	//	public static int fun1()
	//	{
	//		return 0;
	//	}
	//	//java 9 main private and private static method bhi bana sakte hain
	//	private static int fun2()
	//	{
	//		return 0;
	//	}
	
}


//all the methods inside the interface are abstract methods.
