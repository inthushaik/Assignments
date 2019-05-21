
import java.util.Scanner;
class PowerofTwo{
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("enter a no:");
    int number = in.nextInt();
    in.close();

    if (checkNumber(number)) {
      System.out.println("Yes it is power of two");
    } else {
      System.out.printf("Not a power of two");
    }
  }

  private static boolean checkNumber(int number) {

    if (number % 2 != 0) 
    {
      return false;
    } else {

      for (int i = 0; i <= number; i++)
       {
        if (Math.pow(2, i) == number) 
        	return true;
       }
    }
    return false;
  }
}