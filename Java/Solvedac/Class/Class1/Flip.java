package Solvedac.Class.Class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Flip {
	//Class 1 : 상수
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		String[] splitInput = input.split(" ");
		
		String inputA = splitInput[0];
		String inputB = splitInput[1];
		
		//첫번째-마지막 글자 뒤집어서 숫자로 바꾸기
		
		// 반복되는 과정 하나로 만들기
		char dummy;
		int[] output = new int[2];
		
		for(int i=0; i<splitInput.length; i++) {
			char[] charList = splitInput[i].toCharArray();
			dummy = charList[0];
			charList[0] = charList[2];
			charList[2]=dummy;
			output[i] = Integer.parseInt(new String(charList));
		}
		System.out.println(Math.max(output[0], output[1]));
		
	}
}
