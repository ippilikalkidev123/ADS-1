import java.util.Scanner;

class Deque
{
    
    int elements;
    Node first,last;
    
    class Node
    {
        String data;
         Node next;
        
        Node(String val,Node link)
        {
            this.data = val;
            this.next = null;
        }
    }
    
    Deque()
    {
        elements = 0;
        first = null;
        last = null;
    }
   
    public void push(String value)
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
    
    public void enqueue(String value) 
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
            popped.data=null;
            popped.next=null;
            elements--;
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
				String k=sc.next();
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