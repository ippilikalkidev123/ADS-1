

import java.util.Scanner;
class Team
{
	String name;
	int wins,loses,draws;
	public Team(String name,int wins,int loses,int draws)
	{
		this.name=name;
		this.wins=wins;
		this.loses=loses;
		this.draws=draws;
	}	
}
class InsertionSort
{ 
	int i=0;
	int count = 0;
  void sort(Team[] k) 
	    { 
		 while(k[i]!=null)
		    {
		    	if(k[i]!=null)
		    		count++;
		    	i++;
		    }
	   
	        for (i=1; i<count; ++i) 
	        { 
	            int key = k[i].wins; 
	            int j = i-1; 
	            while (j>=0 && k[j].wins > key) 
	            { 
	                k[j+1] = k[j]; 
	                j = j-1; 
	            } 
	            k[j+1].wins = key; 
	        
	    
	            if(k[i].wins==k[j].wins)
	            {
	            	for (i=1; i<count; ++i) 
	    	        { 
	    	             key = k[i].loses; 
	    	             j = i-1; 
	    	            while (j>=0 && k[j].loses < key) 
	    	            { 
	    	                k[j+1] = k[j]; 
	    	                j = j-1; 
	    	            } 
	    	            k[j+1].loses = key;
	            }
	        }
	           /* if(k[i].wins==k[j].wins && k[i].loses==k[j].loses)
	            {
	            	for (i=1; i<count; ++i) 
	    	        { 
	    	             key = k[i].draws; 
	    	             j = i-1; 
	    	            while (j>=0 && k[j].draws > key) 
	    	            { 
	    	                k[j+1] = k[j]; 
	    	                j = j-1; 
	    	            } 
	    	            k[j+1].draws = key;
	            }
	            }*/
	        }
	    }
	    
	        
   
	 void printArray(Team a[]) 
	    { 
	        for (int i=0; i<count; i++) 
	        	if(count==1)
	            {
	            	System.out.println(a[0].name);
	            	break;
	            }
	        	else if((i+1)!=count)
		        {
	            	System.out.print(a[i].name+","); 
		        }
		        else
		        {
		            System.out.print(a[i].name);
		        }
	              System.out.println(); 
	       
	    } 
} 
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		Team[] k= new Team[10];
		while(sc.hasNext())
		{
		String team = sc.nextLine();
		if(team!=null)
		{
		String[] t= team.split(",");
		String name= t[0];
		int wins= Integer.parseInt(t[1]);
		int loses= Integer.parseInt(t[2]);
		int draws= Integer.parseInt(t[3]);
		
		k[i]=new Team(name,wins,loses,draws);
		i++;
		}
		}
		InsertionSort is =new InsertionSort();
		is.sort(k);
		is.printArray(k);
	}
}

