package programmers.lv1;

import java.util.Arrays;

public class AddDigits {

	public static void main(String[] args) {
		
		int n = 123;
		int answer = 0;
        String dummy = Integer.toString(n); 
        String[] arr = dummy.split("");
        System.out.println(Arrays.toString(arr));
        
        for(int i=0; i<arr.length; i++){
            answer += Integer.parseInt(arr[i]); 
        }
        
        System.out.println(answer);
	}

}
