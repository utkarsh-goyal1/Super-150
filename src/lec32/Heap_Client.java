package lec32;

public class Heap_Client {
	public static void main(String []args)
	{
		Heap hp=new Heap();
		hp.Add(10);
		hp.Add(5);
		hp.Add(20);
		hp.Add(2);
		hp.Add(4);
		hp.Add(8);
		hp.Display();
		//hp.DecreaseKey(3, 5);
//		hp.deleteKey(3);
		//hp.BuildHeap();
		hp.Display();
	}
}
