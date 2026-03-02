package lec29;

public class BinaryTreeClient {
	public static void main(String []args)
	{
		// 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
		BinaryTree bt=new BinaryTree();
//		bt.Display();
//		bt.inOrder();
//		bt.preOrder();
//		bt.postOrder();
//		bt.max();
		bt.levelOrder();
//		System.out.println(bt.find(7));
		
	}
}
