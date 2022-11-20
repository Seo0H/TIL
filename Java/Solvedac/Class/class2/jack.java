package Solvedac.Class.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jack {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] firstInput = br.readLine().split(" ");
		String[] secondInput = br.readLine().split(" ");
		int N = Integer.parseInt(firstInput[0]); //카드 개수
		int M =Integer.parseInt(firstInput[1]); // 합의 근사치 기준
		
		int[] arrN = new int[N];
		for(int i=0; i<N; i++)
			arrN[i] = Integer.parseInt(secondInput[i]);
		
		
	}

}
