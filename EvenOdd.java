package fundamentals;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
//		int b= sc.nextInt();
		if (a%2!=0) {
			System.out.println("Number is Odd");
		
		}
		else {
			System.out.println("Even Number");
		}
	}

}
