
import java.util.Scanner;
class SumCube {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no.");
		int num = sc.nextInt();
		cube(num);

	}
	 static void cube(int num){
	 	long cube;
	 	int sum=0,rem;
	 	while(num>0)
	 	{
	 		rem = num%10;
	 		cube=rem*rem*rem;
	 		sum+=cube;
	 		num=num/10;
	 	}
	 	System.out.println("sum:"+sum);
	 }
}