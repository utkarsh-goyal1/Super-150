package lec13;
import java.util.*;//we create length wise substring to find maximum cb numbers.by use of 2 loops cb numbers will be less due to third step;
public class CB_number {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		PrintSubString(s);
	}
	public static void PrintSubString(String str)
	{
		int count=0;
		boolean [] visited=new boolean[str.length()];
		for(int len=1;len<=str.length();len++)//for length of string.
		{
			for(int i=0;i<=str.length()-len;i++)// for the value of j/calculate  value of i ,j-i==length.=>j=i+length;
			{
				int j=i+len;
				String snew=str.substring(i,j);
				long num=Long.parseLong(snew);
				if(isCBNumber(num)==true && isvisited(visited,i,j-1)==true)
				{
					count++;
					for(int k=i;k<=j-1;k++) {
						visited[k]=true;
					}
				}
			}
		}
		System.out.println(count);
	}
	public static boolean isvisited(boolean []visited ,int i,int j) {
		for(int k=i;k<=j;k++) {
			if(visited[k]==true)
			{
				return false;
			}
		}
		return true;
	}
	public static boolean isCBNumber(long num) {
		if(num==0 || num==1) 
		{
			return false;
		}
		int []A= {2,3,5,7,11,13,17,19,23,29};
		for(int i=0;i<A.length;i++)
		{
			if(num==A[i]) 
			{
				return true;
			}
		}
		for(int i=0;i<A.length;i++)
		{
			if(num%A[i]==0)
			{
				return false;
			}
		}
		return true;
	}
	
}

//generate length wise substring.
//check cb number
//check if it is not present in another substring
//visited