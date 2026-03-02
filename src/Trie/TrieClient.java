package Trie;
import java.util.*;
public class TrieClient {
	public static void main(String []args) 
	{
//		Trie t = new Trie();
		TrieCounts t =new TrieCounts();
		t.insert("Hello");
		t.insert("He");
		System.out.println(t.countPartials("He"));
		System.out.println(t.countPartials("Hell"));
	}
}
