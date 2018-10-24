import java.util.Scanner;
class Mergesortimp
{
void merge(String[] a,int b,int m,int l)
	{
		if(a[m+1].compareTo(a[m])>0)
		{
			System.out.println("Array is already sorted. So, skipped the call to merge...");
			return;
		}
		
		int n1 = m - b + 1; 
        int n2 = l - m;
        
        String c[] = new String[n1]; 
        String d[] = new String [n2];
        
        for (int i=0; i<n1; ++i) 
            c[i] = a[b + i]; 
        for (int j=0; j<n2; ++j) 
            d[j] = a[m + 1+ j];
  
        int i = 0, j = 0; 
   
        int k = b; 
        while (i < n1 && j < n2) 
        { 
            if (c[i].compareTo(d[j])<=0) 
            { 
                a[k] = c[i]; 
                i++; 
            }  
            else
            { 
                a[k] = d[j]; 
                j++; 
            } 
            k++; 
        } 
  
        while (i < n1) 
        { 
            a[k] = c[i]; 
            i++; 
            k++; 
        } 
  
  
        while (j < n2) 
        { 
            a[k] = d[j]; 
            j++; 
            k++; 
        } 

        		
	}
	void insertionsort(String a[],int l,int r) {
		System.out.println("Insertion sort method invoked...");
		int n = a.length; 
        for (int i=1; i<=r; ++i) 
        { 
            String key = a[i]; 
            int j = i-1; 
            while (j>=0 && a[j].compareTo(key)>0) 
            { 
                a[j+1] = a[j]; 
                j = j-1; 
            } 
            a[j+1] = key; 
        } 
		
	}
	void sort(String[] a,int b,int l)
	{
		if(b<l)
		{
			int m=(b+l)/2;
			
			 if(m>=7)
			{
			sort(a,b,m);
			sort(a,m+1,l);
			
			}
			 
			else
			{
				this.insertionsort(a,b,m);
				
				this.insertionsort(a, m+1, l);
				 
				
			}
			 
			 
	
		}
		
	}
	void display(String[] a)
	{
		int n=a.length;
		System.out.print("[");
		for(int i=0;i<n;i++)
		{
			if(i+1!=n)
			System.out.print(a[i]+",");
			else
				System.out.print(a[i]);
		}
		System.out.println("]");
	}
	
	
	   
}

public class Solution {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	Mergesortimp w=new Mergesortimp();
	while(sc.hasNext())
	{
		String p=sc.nextLine();
		String[] pp=p.split(",");
		
		int l=pp.length;
		w.sort(pp,0,l-1);
		w.display(pp);
	}
	
	}
}
