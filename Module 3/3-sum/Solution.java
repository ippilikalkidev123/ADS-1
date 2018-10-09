
import java.util.Arrays;
import java.util.*;

 class Solution {


    private Solution()
    {
    	
    }
    private static boolean containsDuplicates(int[] array)
    {
        for (int i = 1; i < array.length; i++)
            if (array[i] == array[i-1])
            	return true;
                return false;
    }

    public static int count(int[] array)
    {
        int n = array.length;
        Arrays.sort(array);
        if (containsDuplicates(array)) throw new IllegalArgumentException("array contains duplicate integers");
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = i+1; j < n; j++)
            {
                int k = Arrays.binarySearch(array, -(array[i] + array[j]));
                if (k > j) count++;
            }
        }
        return count;
    } 


    public static void main(String[] args)
    { 
        Scanner sc = new Scanner (System.in);
       // System.out.println("Enter size of array");
      int  N=sc.nextInt();
        int[] array = new int[N];//{1000,-800,-200,234,435,3243,-3,2,1,12,-11,-1};
        for(int i=0;i<N;i++)
        {
        	//System.out.println("Enter values"+(i+1));
        	array[i]=sc.nextInt();
        }
        count(array);
    } 
}