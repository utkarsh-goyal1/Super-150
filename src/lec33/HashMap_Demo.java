//Map is an interface in java.HashMap is a class.There are three types of Map - HashMap,TreeMap,LinkedHashMap.
package lec33;
import java.util.*;
public class HashMap_Demo {
	public static void main(String []args)
	{
		//HashMap----------------------------------------------------------------------------------------Time Complexity-O(1).
		//we can also put null as a key.
		//It stores the data in random order.
		//Implementation of hashmap is done by linked list.
		
		
//		HashMap<String,Integer>h=new HashMap<>();
//		add a element.
//		h.put("HarryPotter", 8);
//		
//		remove a element
//		h.remove(key)
//		
//		get a value
//		h.get(key)
//		
//		contains
//		h.containsKey(key);
		
		//iterating a map.
//		Set<String>key=h.keySet();
//		for(String k:key)
//		{
//			System.out.println(k+" "+h.get(k));
//		}
//		for(Map.Entry<String,Integer>e:h.entrySet())
//		{
//			System.out.println(e.getKey()+" "+e.getValue());
//		}
		//TreeMap----------------------------------------------------------------------------------------Time Complexity-O(logn).
		
		//Implementation of TreeMap is done by red black tree.
		//TreeMap stores the data in sorted order.
		//we can't store null in treemap
		
//		TreeMap<String,Integer>h=new TreeMap<>();
//		h.put("Harry", 8);
//		h.put("Ron",5);
//		h.put("Hermoine", 9);
//		System.out.println(h);
		
	
		
		//LinkedHashMap---------------------------------------------------------------------------------Time Complexity-O(1).
		//Implementation of LinkedHashMap is done by doubly linked list
		//LinkedHashMap stores the data in the order in which it is stored in it.
		//It can store the null value.
		
//		LinkedHashMap<String,Integer>h=new LinkedHashMap<>();
//		h.put("Harry", 8);
//		h.put("Ron",5);
//		h.put("Hermoine", 9);
//		System.out.println(h);
		
		
		
	}
}


//Difference between HashTable and HashMap--HashMap is non-syncronized and is not thread safe while HashTable is thread safe and is synchronized. HashMap allows one null key and values can be null whereas HashTable doesn't allow null key or value. HashMap is faster than HashTable.



//Questions-----------------------------------------------------------------------------

//intersection of two arrays.
//Longest consecutive sequence
//merge k sorted lists
//group anagrams