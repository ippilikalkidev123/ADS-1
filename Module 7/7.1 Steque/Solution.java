import java.util.Scanner;

class steque
{
    
    int elements;
    Node first,last;
    
    class Node
    {
        int data;
         Node next;
        
        Node(int value)
        {
            this.data = value;
            this.next = null;
        }
    }
    
   
    public void push(int value)
    {
    	Node n=new Node(value);
    	Node temp=first;
        if(first==null) 
        {
            first=n;
            last=n;
        } 
        else
        {
        	
             first=n;
             first.next=temp;
        }

        elements++;
    }
    
    public void enqueue(int value) 
    {
        if (last==null)
        {
            last=new Node(value);
            first=new Node(value);
        } 
        else 
        {
            Node newnode=new Node(value);
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
            //elements--;
        }
        else
        {
        	System.out.println("Steque is empty.");
        }
    }
    void Display()
    {
    	Node temp=first;
    	while(temp!=null)
    	{
    		if(temp.next==null)
    		{
    		System.out.print(temp.data+", ");
    		temp=temp.next;
    		}
    		//else
    		{
    			System.out.print(temp.data);
    		}
    	}
    }
    void blank()
    {
    	first=null;
    }
}
class Solution
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		steque d=new steque();
		for(int i=0;i<N;i++)
		{
			while(sc.hasNext())
			{
				String input=sc.next();
				switch(input)
				{
				case "push":
					int k=sc.nextInt();
					d.push(k);
					System.out.println("");
					d.Display();
					break;
				case "pop":
					d.pop();
					System.out.println("");
					d.Display();
					break;
				case "enqueue":
					int k1=sc.nextInt();
					d.enqueue(k1);
					System.out.println("");
					d.Display();
					break;
				//case "":
					//d.blank();
					//break;
					
				}
			}
		}
	}
}