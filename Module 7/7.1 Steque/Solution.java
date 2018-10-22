import java.util.Scanner;

class steque
{
    
    int elements;
    Node first=null;
    Node last=null;
    
    class Node
    {
        Object data;
         Node next;
        
        Node(Object value)
        {
            this.data = value;
            this.next = null;
        }
    }
    
   
    public void push(Object value)
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
    
    public void enqueue(Object value) 
    {
    	//System.out.println("*");
    	 Node n=new Node(value);
        if (first==null)
        {
            //System.out.println("[");
            first=n;
            last=n;
        } 
        else 
        {
        	//System.out.println("]");
            last.next=n;
            last=last.next;
        }
    }
    /**
     * pop.
     */
    void pop() 
    {
    	 if(first!=null) 
    	 {
    		 Node temp=first;
     	first=temp.next;
         }
    }
    void Display()
    {
    	Node temp=first;
    	while(temp!=null)
    	{
    		if(temp.next!=null)
    		{
    		System.out.print(temp.data+", ");
    		
    	     }
    		else
    		{
    			System.out.print(temp.data);
    		}
    		temp=temp.next;
    	}		
    }
    void blank()
    {
    	first=null;
    	//System.out.println("*");
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
				String x=sc.nextLine();
				String a[]=x.split(" ");
				//System.out.println("input"+input);
				switch(a[0])
				{
				case "push":
					d.push(a[1]);
					System.out.println("");
					d.Display();
					break;
				case "pop":
					d.pop();
					System.out.println("");
					d.Display();
					if(d.first==null)
					{
						System.out.print("Steque is empty.");
					}
					break;
				case "enqueue":
					//int k1=sc.nextInt();
					d.enqueue(a[1]);
					System.out.println("");
					d.Display();
					break;
				case "":
					//System.out.println("-");
					d.blank();
					System.out.println();
					break;
					
				}
			}
		}
	}
}