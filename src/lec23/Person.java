package lec23;

public class Person {
	String name;
	int age;
	//constructor ->constructors are used to initialize the class data members.same name as class name.never return anything
	public Person(String name,int age )//constructor parameterised.
	{
		this.name="Motu";
		this.age=25;
	}
	public void fun()
	{
		String name="Hello";
		int adhar=100;
		System.out.println(this.name+" "+this.age+" "+adhar);//Here 'name' variable is defined as both class's data member and defined in class as well so to access class's data member we will use 'this' keyword.
	}
}
//1-memory allocation
//2-parsing.//update the initial value of class data members.
//3-constructor calling
