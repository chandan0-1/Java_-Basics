package fundamentals;
import java.util.Scanner;
public class SumPatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int i=1;
        if (i==1 && n>0){
            System.out.println("1=1");
            i++;
        }
        while (i<=n){
            int j=1;
            int s=0;
            while (j<=i){
                if (j==i){
                    System.out.print(j);
                s=s+j;
                    j++;
                }
                else{
                System.out.print(j);
                s=s+j;
                System.out.print("+");
                j++;
                    
            }
            }
            System.out.print("="+s);
            i++;
            System.out.println();
        }

	}

}
