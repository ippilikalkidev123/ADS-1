package Exam1;

class Node
{
	 int data;
	 Node next;
	 Node(int d)
	 {
		 data=d;
		 next=null;
	 }
}
public class LinkedList
{
	Node Head;
	Node tail;
	public Node push(int d)
	{
		
		Node n=new Node(d);
		if(Head==null && tail==null)
		{
			Head=n;
			tail=n;
		}
		else
		{
			tail.next=n;
			tail=tail.next;
		}
		return n;
	}
	
}