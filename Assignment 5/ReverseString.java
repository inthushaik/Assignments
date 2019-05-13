// Java program to ReverseString using ByteArray. 
import java.lang.*; 
import java.io.*; 
import java.util.*; 

// Class of ReverseString 
class ReverseString 
{ 
	public static void main(String[] args) 
	{ 
		String input = "inthu"; 

		// getBytes() method to convert string 
		// into bytes[]. 
		byte [] a = input.getBytes(); 

		byte [] result = 
				new byte [a.length]; 

		// Store result in reverse order into the 
		// result byte[] 
		for (int i = 0; i<a.length; i++) 
			result[i] = 
			a[a.length-i-1]; 

		System.out.println(new String(result)); 
	} 
} 
