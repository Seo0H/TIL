package Solvedac.Class.Class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class numOfNum {
	//Class 1 : 2577번 숫자의 개수
	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int A = Integer.parseInt(bf.readLine());
		int B = Integer.parseInt(bf.readLine());
		int C = Integer.parseInt(bf.readLine());

		char[] mulResult = Integer.toString(A * B * C).toCharArray();

		HashMap<Integer, Integer> result = new HashMap<>();
		
		for (int i = 0; i < 10; i++){
			int count = 0;
			for (int j = 0; j < mulResult.length; j++){
				int charList = Integer.parseInt(Character.toString(mulResult[j]));
				if (i == charList) {
					count++;
				}
			}
			sb.append(count).append("\n");
		}
		System.out.println(sb);
	}

}
