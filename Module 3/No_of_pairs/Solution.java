package Activities;
import java.util.Scanner;

class Demo
{
	int[] a;
	int size,i,j,c=0;
	public Demo(int N)
	{
		a=new int[N];
		size=N;
	}
	public void input()
	{
		for(i=0;i<size;i++)
		{
			System.out.println("Enter elements"+(i+1));
			Scanner sc = new Scanner(System.in);
			a[i]=sc.nextInt();
		}
	}
	public void check()
	{
		int temp1=0;
		for(j=0;j<size;j++)
		{
			for(int k=j+1;k<size;k++)
			{
				if(a[j]>a[k])
				{
					temp1=a[j];
					a[j]=a[k];
					a[k]=temp1;
				}		
			}
		}
		int temp = a[0];
		for(int i=1;i<size;i++)
		{
			if(a[i]==temp)
			{
				c++;
			}
			temp = a[i];	
		}
		System.out.println("No.of equal pairs in the given array are: "+c);
	}
}
					
		
public class Solution
{
	public static void main(String[] args)
	{
		Demo d = new Demo(10);
		d.input();
		d.check();
	}
}  
