package Oops2;

public class Cars {//implements Comparable<Cars>{
	int price;
	int speed;
	String color;
	public Cars()
	{
		
	}
	public Cars(int p,int s,String c)
	{
		price=p;
		speed=s;
		color=c;
	}
	@Override
	public String toString()
	{
		return "P : "+this.price+" S: "+this.speed+" C: "+this.color;
	}
//	@Override
//	public int compareTo(Cars o) {
//		
//		//return this.speed-o.speed;
//		//return o.price-this.price;
//		return this.color.compareTo(o.color);// here we are using compareTo method of string class.
//	}
}


//Note->Comparable is an interface in java in which there is a method called compareTo() whose work is to compare two things.There is a drawback of this comparable that if we forgot to implement this in the class then we can t sort the data
//Note->Comparator is also an interface.The above problem is solved by it . here we can make our separate class and can implement comparator there and can use that class object in our code.
