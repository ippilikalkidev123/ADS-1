import java.util.*;
class sample
{
	static int i=0;
	void print(String s)
		{
		int k1=0,k2=0;
		char c=' ';
		if(i==s.length()-1)
			{
			c=s.charAt(s.length()-1);
			System.out.print(c);
			return;
			}
		k1=s.charAt(i);
		k2=s.charAt(i+1);
		if(k1==k2)
		{
			System.out.print(s.charAt(i)+"*");
		}
		else
		{
			System.out.print(s.charAt(i));
		}
		i++;
		print(s);
	}
	
}
class  Demo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		sample s1= new sample();
		s1.print(s);
}
}