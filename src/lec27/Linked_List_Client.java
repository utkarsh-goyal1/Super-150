package lec27;

public class Linked_List_Client {
	public static void main(String []args)throws Exception
	{
		Linked_list ll=new Linked_list();
		ll.AddFirst(1);
		ll.AddFirst(2);
		ll.AddFirst(3);
		ll.AddFirst(4);
		ll.Display();
		ll.AddatIndex(-9, 4);
		ll.Display();
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.getAtIndex(2));
		System.out.println(ll.removeLast());
		System.out.println(ll.removeAnyIndex(2));
		ll.Display();
	}
}
