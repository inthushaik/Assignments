import java.util.*;
import java.util.Scanner;

class StringPalindrome
{
	public static void main(String args[])
	{
    		int n,i,flag=0;
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
	 	s=sc.nextLine();
		char str[]=s.toCharArray();
    		
		n=str.length;
    		for(i=0;i<n;i++)
    		{
       	 		if(str[i]!=str[n-i-1])
        		{
            			flag=1;
            			break;
        		}
    		}
        	System.out.println("Is the string a palindrome?\n");
        	if(flag==0)
        	{
            		System.out.println("YES");
        	}
	        else
        	{
            		System.out.println("NO");
        	}   
	}
}