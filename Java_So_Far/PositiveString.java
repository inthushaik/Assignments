
import java.util.Scanner;
import java.util.Arrays;
class PositiveString{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s = sc.nextLine();
		if(isInOrder(s))
			System.out.println("true");
		else
			System.out.println("false");
        
}
	public static boolean isInOrder(String s) {
    
        int n = s.length();  
        char c[] = new char [n];  
          
        for (int i = 0; i < n; i++) 
        {  
            c[i] = s.charAt(i);  
        }   
        Arrays.sort(c);    
        for (int i = 0; i < n; i++)  
            if (c[i] != s.charAt(i))   
                return false;  
                
                return true;    
    }
}