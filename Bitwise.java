package fundamentals;
import java.util.Scanner;
public class Bitwise {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
		// TODO Auto-generated method stub
        
//        Left shift
        System.out.println(a<<1);
        System.out.println(a<<2);
        System.out.println(a<<3);
        
//        Right Shift
        System.out.println(a>>1);
        System.out.println(a>>2);
        System.out.println(a>>3);
	}

}
