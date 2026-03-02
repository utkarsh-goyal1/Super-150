package lec30;
import java.util.*;
public class BST_Client{
	public static void main(String []args)
	{
		int []arr= {10,20,30,40,50,60,70,80,90};
		BST bst=new BST(arr);
		bst.preOrder();
	}
}
