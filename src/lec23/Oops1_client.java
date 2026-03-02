package lec23;
public class Oops1_client {
	public static void main(String []args) throws Exception
	{	
		Oops1 s=new Oops1();
		System.out.println(s.getName());
		s.setAge(-1);
		System.out.println(s.getAge());
	}
}
