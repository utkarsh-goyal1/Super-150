//There is a new alien language which uses the latin alphabet. However, the order among letters are unknown to you. 
//You receive a list of non-empty words from the dictionary, where words are sorted lexicographically by the rules of this new language. Derive the order of letters in this language.
//
//Example 1:
//
//Input:
//[
//  "wrt",
//  "wrf",
//  "er",
//  "ett",
//  "rftt"
//]
//
//Output: "wertf"
package Graph2;
import java.util.*;
public class AlienDictionary {
	class Solution{
		public String alienOrder(String []words)
		{
			HashMap<Character,List<Character>>map = new HashMap<>();
			for(int i=0;i<words.length;i++)
			{
				String w= words[i];
				for(char ch:w.toCharArray()) {
					if(!map.containsKey(ch))
					{
						map.put(ch, new ArrayList<>());
					}
				}
			}
			
			for(int i=0;i<words.length-1;i++)
			{
				String s1=words[i];
				String s2=words[i+1];
				if(s1.startsWith(s2) && s1.length()>s2.length())
				{
					return "";
				}
				for(int j=0;j<Math.min(s1.length(), s2.length());j++)
				{
					if(s1.startsWith(s2) && s1.length()>s2.length())
					{
						return "";
					}
					if(s1.charAt(j)!=s2.charAt(j))
					{
						map.get(s1.charAt(j)).add(s2.charAt(j));
						break;
					}
				}
			}
			int []in = new int[26];
			for(char key:map.keySet())
			{
				for(char nbrs:map.get(key)) {
					in[nbrs-'a']++;
				}
			}
			Queue<Character>q = new LinkedList<>();
			for(char ch:map.keySet())
			{
				if(in[ch-'a']==0)
				{
					q.add(ch);
				}
			}
			String ans="";
			int count=0;
			while(!q.isEmpty())
			{
				char ch = q.poll();
				ans+=ch;
				count++;
				for(char nbrs:map.get(ch))
				{
					in[nbrs-'a']--;
					if(in[nbrs-'a']==0)
					{
						q.add(nbrs);
					}
				}
			}
			return count==map.size()?ans:"";
		}
	}
}
