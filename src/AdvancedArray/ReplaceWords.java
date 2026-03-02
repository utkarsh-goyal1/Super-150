package AdvancedArray;

public class ReplaceWords {

}
//class Solution {
//    public String replaceWords(List<String> dictionary, String sentence) {
//        Trie obj = new Trie();
//        for(int i=0;i<dictionary.size();i++)
//        {
//            obj.insert(dictionary.get(i));
//        }
//        StringBuilder res = new StringBuilder();
//        String []  input = sentence.split(" ");
//        for(String i : input){
//            res.append(obj.search(i));
//            res.append(" ");
//        }
//        return res.toString().trim();
//    }
//}
//class Trie {
//    class Node{
//		char data;
//		boolean isTerminal;
//		HashMap<Character,Node>child = new HashMap<>();
//	}
//	private Node root;
//	public Trie() {
//		Node nn = new Node();
//		nn.data='*';
//		root=nn;
//    }
//    public void insert(String word) {
//        Node curr=root;
//        for(int i=0;i<word.length();i++)
//        {
//            char ch = word.charAt(i);
//            if(curr.child.containsKey(ch))
//            {
//                curr=curr.child.get(ch);
//            }
//            else
//            {
//                Node nn = new Node();
//                nn.data=ch;
//                curr.child.put(ch,nn);
//                curr=nn;
//            }
//        }
//        curr.isTerminal=true;
//    }
//    
//    public String search(String word) 
//    {
//        Node curr = root;
//        for(int i = 0; i < word.length(); i++) 
//        {
//            char ch = word.charAt(i);
//            if(curr.isTerminal) 
//            {
//                return word.substring(0, i);
//            }
//            if(!curr.child.containsKey(ch)) 
//            {
//                return word;
//            }
//            curr = curr.child.get(ch);
//        }
//        return curr.isTerminal ? word.substring(0, word.length()) : word;
//    }
//}