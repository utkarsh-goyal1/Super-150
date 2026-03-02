package lec27;

public class Cycle_client {
	public static void main (String []args)throws Exception
	{
		Linked_list_cycle ll=new Linked_list_cycle();
		ll.AddLast(1);
		ll.AddLast(2);
		ll.AddLast(3);
		ll.AddLast(4);
		ll.AddLast(5);
		ll.AddLast(6);
		ll.AddLast(7);
		ll.AddLast(8);
		ll.Display();
		ll.CreateCycle();
//		ll.Display();
		ll.FloydCycleRemoval();
		ll.Display();
	} 

}
