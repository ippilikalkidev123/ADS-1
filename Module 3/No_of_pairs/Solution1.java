//package mergesort;

import java.util.Scanner;

class mergeSort
{
	int n,mid,left,right;
	void sort(String[] a)
	{
		n=a.length;
		System.out.println(n);
		if(n<2)
			return;
		mid=n/2;
		String[] left=new String[mid];
		String[] right=new String[n-mid];
		for(int i=0;i<mid;i++)
		{
			System.out.println(left[i]=a[i]);
			System.out.println("+");
		}
		for(int i=mid,j=0;i<n;i++,j++)
		{
			System.out.println(right[j]=a[i]);
			System.out.println("*");
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
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
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
public class Solution1
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		mergeSort ms=new mergeSort();
		while(sc.hasNext())
		{
			String s=sc.nextLine();
			String[] a=s.split(",");
			ms.sort(a);
			//ms.printArray(a);
		}
	}
}
