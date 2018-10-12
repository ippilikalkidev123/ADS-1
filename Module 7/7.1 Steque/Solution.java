import java.util.Scanner;

class Deque
{
    
    int elements;
    Node first,last;
    
    class Node
    {
        int data;
         Node next;
        
        Node(int value,Node link)
        {
            this.data = value;
            this.next = null;
        }
    }
    
    Deque()
    {
        elements = 0;
        first = null;
        last = null;
    }
   
    public void push(int value)
    {
        if(first==null) 
        {
            first=new Node(value,null);
            last=first;
        } 
        else
        {
            Node newnode=new Node(value,first);
             first=newnode;
        }

        elements++;
    }
    
    public void enqueue(int value) 
    {
        if (last==null)
        {
            last=new Node(value,null);
            
            first=last;
        } 
        else 
        {
            Node newnode=new Node(value, null);
            
            last.next=newnode;
            last=newnode;
        }
        elements++;
    }
    /**
     * pop.
     */
    void pop() 
    {
        if(first!=null) 
        {
            Node popped=first;
            first=first.next;
            popped.data=0;
            popped.next=null;
            elements--;
        }
        else
        {
        	System.out.println("Steque is empty.");
        }
    }
}
class Solution
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=0;i<N;i++)
		{
			while(sc.hasNext())
			{
				String input=sc.next();
				int k=sc.nextInt();
				Deque d=new Deque();
				switch(input)
				{
				case "push":
					d.push(k);
					break;
				case "pop":
					d.pop();
					break;
				case "enqueue":
					d.enqueue(k);
					break;
				}
			}
		}
	}
}