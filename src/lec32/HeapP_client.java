package lec32;

public class HeapP_client {
	public static void main (String []args)
	{
		Heap_P pq= new Heap_P();
		pq.insert(10);
		pq.insert(5);
		pq.insert(20);
		pq.insert(2);
		pq.insert(4);
		pq.insert(8);
		pq.Display();
		pq.deleteKey(3);
		pq.Display();
	}
}
