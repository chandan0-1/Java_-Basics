package fundamentals;
import java.util.Scanner;
public class TotalSal {

	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);
		
		int i = sc.nextInt();
		char c = sc.next().charAt(0);
		
		float hra= i * 0.2f;
		float da = i * 0.5f;
		float pf =i * 0.11f;
		float allow = 0f;
		
		
		if(c==65){
			allow = 1700;
		}
		else if(c==66){
			allow = 1500;

		}
		else{
			allow = 1300;
		}
		float t = i + hra +da + allow - pf;
		System.out.println(Math.round(t));

	}
}
