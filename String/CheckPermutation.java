public class solution {

	public static boolean isPermutation(String input1, String input2) {
        if (input1.length()!=input2.length()){
            return false;
        }
	    // Write your code here
        // char c='a';
        // System.out.println((int)c);
        int[] arr=new int[256];
        for (int i=0;i<input1.length();i++){
            arr[(int)input1.charAt(i)]+=1;
        }
        for (int i=0;i<input1.length();i++){
            arr[(int)input2.charAt(i)]-=1;
        }
        for (int i=0;i<256;i++){
            if (arr[i]!=0){
                return false;
            }
        }
        return true;
	}
}

