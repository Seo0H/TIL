package Solvedac.Class.Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class printStar_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		String space = " ";
		String star = "*";
		
		//줄을 처리하는 부분
		for(int i=N; i>0 ; i--) {
			
			//내부 글자들을 처리하는 부분
			//공백 찍는 부분
			//공백 수는 (줄 수)-1 이다.
			int k;
			for(k=0; k<i-1; k++) {
				sb.append(space);
			}
			//별찍기 부분
			//별은 (줄 수)-(공백 수) 이다.
			for(int j=0; j<N-k; j++) {
				sb.append(star);
			}
			sb.append(System.getProperty("line.separator"));
		}
		
		System.out.println(sb);
	}
}
       


