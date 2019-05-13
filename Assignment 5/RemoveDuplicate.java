import java.util.Scanner;
class RemoveDuplicate
{
    public static void main(String args[])
    {
	String s,ans="";
	char ch	;
	int l,i=0;
	Scanner sc=new Scanner(System.in);
        System.out.print("Enter any string: ");
        s = sc.nextLine();
	l=s.length();
	s+=" ";			
	ch=s.charAt(0); 
	while(i<l)
	{			 
		ans= ans+ ch;  

		while(s.charAt(++i)==ch && i<l)
		{}
	ch=s.charAt(i);	
	}

	System.out.println("String after removing repeated characters : \n"+ans);
	}
}