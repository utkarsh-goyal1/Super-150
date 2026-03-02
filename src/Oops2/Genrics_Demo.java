package Oops2;

public class Genrics_Demo {
	public static void main(String []args)
	{
		Integer[]A= {10,20,30,40};
		Display(A);
		System.out.println();
		String []A1= {"Ram","Anku","Ankita","Raju"};
		Display(A1);
	}
	//how to make a particular method a generic
	public static <T> void Display(T[]A)
	{
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+" ");
		}
	}
}
//generic are used for non primitive datatypes.they do not support primitive data types.
