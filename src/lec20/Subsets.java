package lec20;

import java.util.ArrayList;
import java.util.List;

public class Subsets{
	public static void main(String[] args) {
		List<List<Integer>>res=new ArrayList<>();
	    List<Integer>list=new ArrayList<>();
		int []A={1,2,3};
		print(A,res,list,0);
		System.out.print(res);
	}
	public static void print(int []A,List<List<Integer>>res,List<Integer>list,int index)
	{
	    if(index>=A.length)
	    {
	        res.add(new ArrayList<>(list));
	        return ;
	    }
	    print(A,res,list,index+1);
	    list.add(A[index]);
	    print(A,res,list,index+1);
	    list.remove(list.size()-1);
	    
	}

}