package lec24;
public class Stack_form {
	protected int[]arr;//it is default ,it can only be accessed within this package.
	int tos;//it will keep track at which index we will put element.
	public Stack_form()
	{
		arr=new int[5];
		tos=-1;//because there is no element in the stack.
	}
	public Stack_form(int n)
	{
		arr=new int[n];
		tos=-1;
	}
	public boolean isEmpty()
	{
		return tos==-1;
	}
	public boolean isfull()
	{
		return tos==arr.length-1;
	}
	public void push(int item) throws Exception
	{
		if(isfull())
		{
			throw new Exception("Stack is Full");
		}
		tos++;
		arr[tos]=item;
	}
	public int size()
	{
		return tos+1;
	}
	public int pop() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Stack is Empty");
		}
		int x=arr[tos];
		tos--;
		return x;
	}
	public int peek() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Stack is Empty");
		}
		int x=arr[tos];
		return x;
	}
	public void Display()
	{
		for(int i=0;i<=tos;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(".");
	}
	@Override 
	public String toString()
	{
		String ans="{";
		for(int i=0;i<=tos;i++)
		{
			if(i==tos)
			{
				ans+=""+arr[i]+"}";
			}
			else
			{
				ans+=""+arr[i]+",";
			}
		}
		return ans;
	}
}
