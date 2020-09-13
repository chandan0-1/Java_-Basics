
package fundamentals;
import java.util.Scanner;
public class FahrenheittoCelsiusTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		int w = sc.nextInt();

		while(s<=e){
			float v=5.0f/9.0f;
			float tmp=(s-32)*v;

			System.out.println(s+"\t" + (int)tmp);
			// System.out.println();
			s=s+w;
		}

	}
}
