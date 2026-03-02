package lec23;
public class Oops1 {
	private String name="Ramesh";
	private int age=78;
//	public Oops1()
//	{
//		this.name="Rahul";
//		this.age=35;
//	}
//	public Oops1(String name,int age)
//	{
//		this.name=name;
//		this.age=age;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
//	public void setAge(int age) throws Exception{//First way to generate exception.
//		if(age<0)
//		{
//			throw new Exception("incorrect age");
//		}
//		this.age = age;
//	}
	@Override
	public String toString()
	{
		return this.name+" "+this.age;
	}
	public void setAge(int age)//Second way to generate exception.
	{
		try{
			if(age<0)
			{
			throw new Exception("incorrect age");//danger code
			}
			System.out.println("In try block");
			this.age=age;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("In catch block");
		}
		finally {
			System.out.println("Finally block");
		}
	}
	
	
}
//Exception handling:-----------------------
//errors can not be handled but exception can be handled.
//throw keyword is used to generate exception.
