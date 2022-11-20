package Solvedac.Class.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Egypt {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String output = "right";
		
		while (true){
			String input =br.readLine();
			
			if(input.equals("0 0 0")) {break;}
			String[] splitInput = input.split(" ");
			
			int A = (int) Math.pow(Integer.parseInt(splitInput[0]), 2);
			int B =(int) Math.pow(Integer.parseInt(splitInput[1]), 2);
			int C = (int) Math.pow(Integer.parseInt(splitInput[2]), 2);
			
			if(A == B + C || B == A + C || C == B + A) {
				output = "right";
				sb.append(output).append("\n");
			} else {
				output = "wrong";
				sb.append(output).append("\n");
			}
		}
		System.out.println(sb);
	}
}
