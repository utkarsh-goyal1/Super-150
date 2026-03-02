package lec24;

public class Dynamic_stacks extends Stack_form {
	@Override
	public void push(int item) throws Exception
	{
		if(isfull())
		{
			int []a=new int[2*arr.length];
			for(int i=0;i<arr.length;i++)
			{
				a[i]=arr[i];
			}
			arr=a;
		}
		super.push(item);
	}
}
