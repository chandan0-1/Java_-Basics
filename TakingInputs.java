package fundamentals;
import java.util.Scanner;
public class TakingInputs {

	public static void main(String[] args) {
		System.out.println("Program to Take inputs from the user");
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c =sc.nextInt();
		
		String str = sc.next();
		char ch = str.charAt(0);
		
		
		System.out.println(ch);
		System.out.println((a+b+c)/3);


	}

}
