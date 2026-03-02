package lec20;
import java.util.*;
public class Sequential_digits {
	static ArrayList<Integer>list=new ArrayList<>();
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int low=sc.nextInt();
		int high=sc.nextInt();
		for(int i=1;i<=9;i++) {
			print(low,high,i,0);
		}
		Collections.sort(list);
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
	}
	public static void print(int low,int high,int i,int num)
	{
		if(num>=low && num<=high)
		{
			list.add(num);
		}
		if(num>high)
		{
			return;
		}
		if(i>9)
		{
			return;
		}
		print(low,high,i+1,num*10+i);
	}
}
