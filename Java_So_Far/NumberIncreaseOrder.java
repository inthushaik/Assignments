
import java.util.Scanner;
class NumberIncreaseOrder{
	public static void main(String[] args) {
		
    Scanner in = new Scanner(System.in);
    System.out.println("enter a no:");
    int num = in.nextInt();
    if(checkNumber(num)){
    	System.out.println("Increasing order");
    }
    	else{
    	System.out.println("NON-Increasing order");	
        }

	}

	static boolean checkNumber(int num){
		int prevNum=num%10;

		boolean value=true;

		while((num/=10) != 0)	{

			if(prevNum >= num%10);

			else	return false;

			prevNum = num%10;

		}

		return true;

	}
}