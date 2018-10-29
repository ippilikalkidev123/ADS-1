class Node
{
	Node next;
	
	int data;
	public Node(int a)
	 {
		 data=a;
		 next=null;
	 }
}

class LList
{
	Node head;
	
	public LList() 
	{
		
		head=null;
	}
	
	public void pushpp(int a,int b)
	{
		Node n=new Node(b);
		int count =1;
		if(a<0)
		{
			System.out.println("Can�t insert at this position�positions will be from 0 to n-1");
		}
		if(head==null || a==0 )
		{
			if(a==0)
			{
			n.next=head;
			head=n;
			}
			
			head=n;
		}
		
		else
		{	
			Node temp=head;
			while(count!=a )
			{
				
				temp=temp.next;
				count++;
			}
			n.next=temp.next;
			temp.next=n;
			}		
	}
	public void reverse()
	{
		Node prev=null;
		Node current=head;
		Node next=null;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
	}
	public void pushend(int a)
	{
		Node n=new Node(a);
		if(head==null)
		{
			head=n;
		}
		else
		{
		Node temp =head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=n;
		}
	}
	public void pushfront(int a)
	{
		Node n=new Node(a);
		//Node temp=head;
		if(head==null)
		{
			head=n;
		}
		else
		{
		n.next=head;
		head=n;
		}
	}
	public int popatfront()
	{
	if(head==null)
		{
			System.out.print("Steque is empty.");
			return 0;
		}
		else
		{
		if(head.next==null)
		{
		int ele1=head.data;
		head=null;
		return ele1;
		}
         	int ele=head.data;
		head=head.next;
		return ele; 
	        }
       }
	public void disply()
	{	
		Node temp=head;
		while(temp!=null)
		{	
		if(temp==head)
		{
		System.out.print(temp.data);
		}
		else 
		System.out.print(", "+temp.data);
		temp=temp.next;
		}
	}
	public void disply1()
	{
		Node temp=head;
		while(temp!=null)
		{	System.out.println(temp.data+" ");
		//System.out.println();
			temp=temp.next;
		}
	//	System.out.println();
	}
	public int size()
	{	int count=0;
		Node temp=head;
		while(temp!=null)
		{
			temp=temp.next;
			count=count+1;
		}
		//System.out.println(count);
		return count;
	}
	public int popatlast()
	{
		Node temp=head;
		Node sec=null;
		if(head==null)
		{
			System.out.println("no node in list");
		}
		 if(head.next==null)
		{
			int ele=head.data;
			head=null;
			return ele;
		}
		else
		{
		while(temp.next!=null)
		{
			sec = temp;
			temp = temp.next;
		}
		sec.next = null;
		return temp.data;
		}
	}
}
public class Solution
{
	public static void main(String args[])
	{
		LList ll=new LList();
		/*for(int i=0;i<5;i++)
		{
			ll.pushfront(i);
		}
		ll.disply();*/
		ll.pushpp(0,5);
		ll.disply();
		System.out.println();
		ll.pushpp(0,7);
		ll.disply();
		System.out.println();
		ll.pushpp(1, 6);
		//ll.reverse(head);
		ll.disply();
		ll.reverse();
		System.out.println();
		ll.disply();
	}
}