
import java.io.*; 
  
class SumOfNumbers{

    public static void main(String args[]) 
    { 
        int n = 10;
        calculateSum(n); 
    }  
   
    static int calculateSum(int n) 
    { 
        int sum = 0; 
        for (int x = 0; x <= n; x++)
        {
        if( x % 3==0 || x % 5==0 ) 
        {
           sum = sum + x;
        }

        }
        System.out.println("sum:" +sum);
        return 0;
        
    }
}
