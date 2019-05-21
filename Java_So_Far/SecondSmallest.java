
import java.util.Scanner;
class SecondSmallest{
	public static void main(String[] args) {
		getSecondSmallest();
	}

	static void getSecondSmallest(){
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array:");
		int num = sc.nextInt();
		int a[] = new int[num];
		System.out.println("Enter all the elements:");
   // try{
        for (int i = 0; i < num; i++) 
        {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < num; i++)   
        {  
            for (int j = i + 1; j < num; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
	System.out.println("2nd smallest:" +a[1]);
}
}