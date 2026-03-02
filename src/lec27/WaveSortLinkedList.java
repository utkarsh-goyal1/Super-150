package lec27;

public class WaveSortLinkedList {

}
//Question-
//Given an unsorted Linked List of integers. The task is to sort the Linked List into a wave like Line. A Linked List is said to be sorted in Wave Form if the list after sorting is in the form: 
//
//list[0] >= list[1] <= list[2] >= …..

//Approach-
//Naive----
//Sort the entire linked list and swap the adjacent elements.(time complexity-O(n logn).

//Efficient----Time Complexity-O(n).
//Traverse all even positioned elements of input linked list, and do following. 
//If current element is smaller than previous odd element, swap previous and current.
//If current element is smaller than next odd element, swap next and current.

//import java.util.*;
//public class Main
//{
//    static class Node{
//        int val;
//        Node next;
//        public Node(int val)
//        {
//            this.val= val;
//        }
//    }
//	public static void main(String[] args) {
//	    // 		3 -> 6 -> 5 -> 10 -> 7 -> 20(input)
//	   //      6 -> 3 -> 10 -> 5 -> 20 -> 7(output)
//		Node head = new Node(3);
//		Node temp= head;
//		temp.next = new Node(6);
//		temp=temp.next;
//		temp.next = new Node(5);
//		temp=temp.next;
//		temp.next = new Node(10);
//		temp=temp.next;
//		temp.next = new Node(7);
//		temp=temp.next;
//		temp.next = new Node(20);
//		temp=temp.next;
//
//		head=sortList(head);
//		while(head!=null)
//		{
//		    System.out.print(head.val+"->");
//		    head=head.next;
//		}
//	}
//	public static Node sortList(Node head)
//	{
//	    int count=0;
//	    Node temp=head;
//	    Node prev=null;
//	    while(temp!=null)
//	    {
//	        if(count%2==0)
//	        {
//	            if (count > 0 && (prev.val > temp.val))
//                {
//                    int t = prev.val;
//                    prev.val = temp.val;
//                    temp.val = t;
//                }
//                if (temp.val < temp.next.val)
//                {
//                    int t = temp.next.val;
//                    temp.next.val = temp.val;
//                    temp.val = t;
//                }
//	        }
//	        count++;
//	        prev=temp;
//	        temp=temp.next;
//	    }
//	    return head;
//	}
//}

