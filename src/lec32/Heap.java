package lec32;
import java.util.*;
public class Heap {
	private ArrayList<Integer>list;
	public Heap()
	{
		list=new ArrayList<>();
	}
	public void Add(int item)
	{
		list.add(item);
		insertHeap(list.size()-1);
	}
	private void insertHeap(int ci)//ci->current index
	{
		int parent=(ci-1)/2;
		if(list.get(parent)>list.get(ci))
		{
			swap(parent,ci);
			insertHeap(parent);
		}
	}
	public int remove()//or Extract min function 
	{
		int rv=list.get(0);
		swap(0,list.size()-1);
		list.remove(list.size()-1);
		Heapify(0);
		return rv;
	}
	public void deleteKey(int index)
	{
		DecreaseKey(index,Integer.MIN_VALUE);
		remove();
	}
	public void DecreaseKey(int index,int element)//update the element at given index
	{
		list.set(index, element);
		int parent=(index-1)/2;
		if(list.get(parent)>list.get(index))
		{
			swap(index,parent);
			DecreaseKey(parent,list.get(parent));
		}
	}
	private void Heapify (int index)//index->parent index  (Min Heapify)
	{
		int lt=2*index+1;
		int rt=2*index+2;
		int smallest=index;
		if(lt<list.size() && list.get(lt)<list.get(index))
		{
			smallest=lt;
		}
		if(rt<list.size() && list.get(rt)<list.get(smallest))
		{
			smallest=rt;
		}
		if(smallest!=index)
		{
			swap(index,smallest);
			Heapify(smallest);
		}
	}
	public void BuildHeap()//rearrange all elements of list so that they follow the property of Heap.Initially you are given a unsorted list.
	{
		for(int i=(list.size()-2)/2;i>=0;i--)
		{
			Heapify(i);
		}
	}
	public void swap(int parent,int ci)
	{
		int temp=list.get(ci);
		list.set(ci, list.get(parent));
		list.set(parent, temp);
	}
	public int get()
	{
		return list.get(0);
	}
	public void Display()
	{
		System.out.println(list);
	}
}
