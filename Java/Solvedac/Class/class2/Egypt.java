package Solvedac.Class.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Egypt {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> list = new ArrayList<String>();
		
		boolean b = true;
		
		// 0 0 0 들어오기 전까지 반복되는 while문
		// 출력부랑 나눠야함..
		while (b = true){
			
			String input =br.readLine();
			if(input.equals("0 0 0")) {break;}
			
			String[] splitInput = input.split("");
			
			int[] intInput = new int[splitInput.length];
			
			//12로 나누어서 딱 떨어지면 -> right
			//12로 나누어서 안나누어 떨어지면 -> wrong
			int sum = 0;
			for (int i =0; i< splitInput.length; i++) {
				intInput[i] = Integer.parseInt(splitInput[i]);
				sum += intInput[i];
			}
			
			int divideRest = sum%12 ;
			String output = "right";
			
			if (divideRest == 0) {
				System.out.println(output);
			}else {
				output = "wrong";
				System.out.println(output);
			}
			
		}
	}
}
