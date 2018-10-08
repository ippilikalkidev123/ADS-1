package Exam1;
import java.util.Scanner;

class AddLargeNumbers
{
	static Node head;
    public static LinkedList numberToDigits(String number)
    {
    	LinkedList num1 = new LinkedList();
    	int l1 = number.length();        
        for (int i = l1 - 1; i >= 0; i--)
            num1.push(number.charAt(i));
        return num1;
    }

    public static String digitsToNumber(LinkedList list)
    {
    	Node last=head;
    	while(last!=null)
    	{
    		String a=last.data;
    		last=last.next;
    	}
		return a;
    	
    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2)
    {

    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
               System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
               System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
               LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
               System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}
