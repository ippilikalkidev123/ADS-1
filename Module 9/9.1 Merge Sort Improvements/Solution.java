

import java.util.Scanner;

class mergeSort
{
	int n,mid,left,right;
	void sort(String[] a)
	{
		n=a.length;
		if(n<2)
			return;
		mid=n/2;
		String[] left=new String[mid];
		String[] right=new String[n-mid];
		for(int i=0;i<mid-1;i++)
		{
			System.out.println(left[i]=a[i]);
		}
		for(int i=mid;i<n-1;i++)
		{
			System.out.println(right[i]=a[i]);
		}
		sort(left);
		sort(right);
		merge(left,right,a);
	}
	void merge(String[] left,String[] right,String[] a)
	{
		int i=0,j=0,k=0;
		while(i<mid-1 && j<n-1)
			if(Integer.parseInt(left[i])<Integer.parseInt(right[j]))
			{
				a[k]=left[i];
				i++;
			}
			else
			{
				a[k]=right[j];
				j++;
			}
		while (i<mid-1) 
		{ 
			a[k] = left[i]; 
			i++; 
			k++; 
		} 
		while (j<n-1) 
		{ 
			a[k] = right[j]; 
			j++; 
			k++; 
		} 
		}
	 void printArray(String[] a) 
	{ 
		int n = a.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(a[i] + " "); 
		System.out.println(); 
	} 
	}
public class Solution
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		while(sc.hasNext())
		{
			String s=sc.nextLine();
			String[] a=s.split(",");
			mergeSort ms=new mergeSort();
			ms.sort(a);
			ms.printArray(a);
		}
	}
}
