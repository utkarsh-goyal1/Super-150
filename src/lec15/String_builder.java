package lec15;

public class String_builder {
	public static void main(String[]args)
	{
		StringBuilder sb=new StringBuilder("Hello");//by default capacity is 16.After adding hello in string builder capacity becomes 21.
		System.out.println(sb.length());
		sb.append('c');
		System.out.println(sb.capacity());
		StringBuilder sb1=new StringBuilder();
		sb.append("Bye");
		System.out.println(sb);
		System.out.println(sb.length());
		sb.append("HellohiByeBye");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.reverse());//to reverse the string builder.
		System.out.println(sb.charAt(2));//to get a particular element at a particular index.
		System.out.println(sb.substring(1,3));
		String s=sb.toString();//to  convert a builder into string.
		sb.insert(2, 'z');
		System.out.println(sb);
		
		
	}
}
