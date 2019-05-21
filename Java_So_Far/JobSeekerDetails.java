import java.util.Scanner;
class JobSeekerDetails{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the username:");
        String st = sc.nextLine();
        if(st.matches("^\\b[a-zA-Z][a-zA-Z0-9\\-._]{8,}(_job)$"))
        	System.out.println("true");
        else
        	System.out.println("false");

	}
}