package lec34;
import java.util.*;
public class HashMap_Client {
	public static void main(String []args)
	{
		HashMap<String,Integer>map=new HashMap<>();
		map.put("Kohli",18);
		map.put("Rohit", 16);
		map.put("Dhoni",7);
		map.put("Watson", 33);
		System.out.println(map.containsKey("Watson"));
		System.out.println(map.get("Kohli"));
		map.put("Rohit", 12);
		System.out.println(map.get("Rohit"));
		System.out.println(map);
	}
}
