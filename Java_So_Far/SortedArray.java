
import java.util.Scanner;
import java.util.Arrays;
class SortedArray{
	public static void main(String[] args) {
		reverse();
	}

	static void  reverse(){
		int temp;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array:");
		int num = sc.nextInt();
		int a[] = new int[num];
		System.out.println("Enter all the elements:");
    try{
        for ( i = 0; i < num; i++) 
        {
            a[i] = sc.nextInt();
        }
        String res = Arrays.toString(a);
 
        System.out.println(new StringBuffer(res).reverse());

       }
        catch(ArrayIndexOutOfBoundsException ae){System.out.println("error occured");}
          System.out.println("\nSorted array:");
         for (int l = 0; l < num; l++) 
        {
            for (int k = l + 1; k < num; k++)
            {
                if (a[l] > a[k]) 
                {
                    temp = a[l];

                    a[l] = a[k];

                    a[k] = temp;
                }

            }
            System.out.println(a[l]);

        }
         
       

	}
}