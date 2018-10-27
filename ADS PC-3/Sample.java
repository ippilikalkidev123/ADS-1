import java.util.Scanner;


class Student
{
	String name,Dob;
	int m1,m2,m3,T;
	public Student(String name,String Dob,int m1,int m2,int m3,int T)
	{
		this.name=name;
		this.m1=1;
		this.m2=m2;
		this.m3=m3;
		this.T=T;
	}	
}
class SelectionSort
{
	void sort(Student[] a,int m)
	{
		for(int i=0;i<m;i++)
		{
			int min=i;
			for(int j=i+1;j<m;j++)
			{
				if (a[j].T > a[min].T) 
                    min= j; 
                if(a[j].T == a[min].T)
                {
                	if (a[j].m3 > a[min].m3) 
                        min=j; 
                }
                if((a[j].T == a[min].T)&&(a[j].m3 == a[min].m3))
                {
                	if (a[j].m2 > a[min].m2) 
                        min = j; 
                }
                if((a[j].T == a[min].T)&&(a[j].m3 == a[min].m3) && (a[j].m2 == a[min].m2))
                {
                	String[] d1= a[j].Dob.split("-");
                	String[] d2= a[min].Dob.split("-");
                	if(Integer.parseInt(d1[2])<Integer.parseInt(d2[2]))
                		min=j;
                	if(Integer.parseInt(d1[2])==Integer.parseInt(d2[2]))
                		if(Integer.parseInt(d1[1])>Integer.parseInt(d2[1]))
                			min=j;
                	
                }
			}
			Student temp = a[min]; 
            a[min] = a[i]; 
            a[i] = temp; 
            this.printArray(a, m);
		}
	}
	void printArray(Student arr[],int n) 
    {  
        for (int i=0; i<=n; ++i) 
            System.out.print(arr[i].name+" "+arr[i].Dob+" "+arr[i].m1+" "+arr[i].m2+" "+arr[i].m3+" "+arr[i].T); 
        System.out.println(" "); 
    } 
}
public class Sample
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i=0;
		String a=sc.nextLine();
		int m=Integer.parseInt(a);
		Student[] k= new Student[6];
		while(sc.hasNext())
		{
		String student = sc.nextLine();
		if(student!=null)
		{
		String[] s= student.split(",");
		String name= s[0];
		String Dob= s[1];
		int m1= Integer.parseInt(s[2]);
		int m2= Integer.parseInt(s[3]);
		int m3= Integer.parseInt(s[4]);
		int T=Integer.parseInt(s[4]);
		k[i]=new Student(name,Dob,m1,m2,m3,T);
		i++;
		}
		}
		SelectionSort s=new SelectionSort();
		s.printArray(k, m);
		s.sort(k,m);
		s.printArray(k, m);
	}
}
