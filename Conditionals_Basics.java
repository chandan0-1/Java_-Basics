package fundamentals;

import java.util.Scanner;

public class Conditionals_Basics {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		
		if (a>b){
			System.out.println("First One is greater !");
		}
		else {
			System.out.println("Second one is greater");
		}
		System.out.println("From the if-else Block");
	}

}
