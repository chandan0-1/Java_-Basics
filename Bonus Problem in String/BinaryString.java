import java.util.Scanner;

public class Main {
    public static void Print(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");}
            System.out.println();
        }
    }
	public static void transform(int[][] arr,int i ,int j){
        for (int row=0;row<arr[0].length;row++){
            arr[i][row]=1;
        }
        for (int col=0;col<arr.length;col++){
            arr[col][j]=1;
        }
        
    }
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        int i=0;
        while (row>i){
            int j=0;
            while (col>j){
                arr[i][j]=sc.nextInt();
                j++;
            }
            i++;
            
        }
        // Print(arr);
        int n=arr.length;
        int[][] arr1=new int[row][col];
        for(i=0;i<n;i++){
            for (int j=0;j<arr[0].length;j++){
                if (arr[i][j]==1){
                    transform(arr1,i,j);
                    
                }
            }
        }
        Print(arr1);

	}

}
