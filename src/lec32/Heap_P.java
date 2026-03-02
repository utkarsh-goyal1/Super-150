package lec32;
import java.util.*;
public class Heap_P {
	List<Integer>ll;
	public Heap_P()
	{
		ll=new ArrayList<>();
	}
	public int left(int index)
	{
		return 2*index+1;
	}
	public int right(int index)
	{
		return 2*index+2;
	}
	public int parent(int index)
	{
		return ((index-1)/2);
	}
	public void insert(int ele)
	{
		ll.add(ele);
		insertCorrect(ll.size()-1);
	}
	private void insertCorrect(int index)
	{
		int parent=parent(index);
		if(ll.get(parent)>ll.get(index))
		{
			swap(parent,index);
			insertCorrect(parent);
		}
	}
	public void Heapify(int index)//root node violation
	{
		int left=left(index);
		int right=right(index);
		int smallest=index;
		if(left<ll.size() && ll.get(index)>ll.get(left))
		{
			smallest=left;
		}
		if(right<ll.size() && ll.get(smallest)>ll.get(right))
		{
			smallest=right;
		}
		if(smallest!=index)
		{		
			swap(smallest,index);
			Heapify(smallest);
		}
	}
	public int extractMin()//return minimum element from heap;
	{
		int ele=ll.get(0);
		swap(0,ll.size()-1);
		ll.remove(ll.size()-1);
		Heapify(0);
		return ele;
		
	}
	public void swap(int parent,int ci)
	{
		int temp=ll.get(ci);
		ll.set(ci, ll.get(parent));
		ll.set(parent, temp);
	}
	public void decreaseKey(int index,int ele)//put the element at the given index and maintain the property of heap.
	{
		ll.set(index, ele);
		if(ll.get(parent(index))>ll.get(index))
		{
			swap(parent(index),index);
			decreaseKey(parent(index),ll.get(parent(index)));
		}
	}
	public void deleteKey(int key)
	{
		decreaseKey(key,Integer.MIN_VALUE);
		extractMin();
	}
	public void BuildHeap()
	{
		for(int i=ll.size()-2/2;i>=0;i--)
		{
			Heapify(i);
		}
	}
	public void Display()
	{
		System.out.println(ll);
	}
}
