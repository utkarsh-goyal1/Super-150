package lec33;
import java.util.*;
public class Group_Anagrams {
	public static void main(String []args)
	{
		String []A= {"eat","tea","tan","ate","nat","bat"};
		List<List<String>>res=Anagrams(A);
		System.out.println(res);
		
	}
	public static List<List<String>>Anagrams(String []A)
	{
		HashMap<String,List<String>>h=new HashMap<>();
		for(int i=0;i<A.length;i++)
		{
			String key=Key(A[i]);
			if(!h.containsKey(key))
			{
				h.put(key, new ArrayList<>());
			}
			h.get(key).add(A[i]);
		}
		return new ArrayList<>(h.values());
	}
	public static String Key(String str)
	{
		int []frq=new int[26];
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			frq[ch-'a']++;
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<frq.length;i++)
		{
			sb.append(frq[i]+" ");
		}
		return sb.toString();
		
	}
}
