package Oops2;

public class Abstract_client {
	public static void main(String []args)
	{
		//Abstract_Demo ab=new Abstract_Demo();//here it is giving error because abstract_demo class has a abstract method (payment) which does not have body.
		Payment_Demo py=new Payment_Demo();
		py.payment();
	}
}
