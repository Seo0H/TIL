package Solvedac.Class.Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class alarmClock {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] inputTimeStr = bf.readLine().split(" ");
		
		int inputT = Integer.parseInt(inputTimeStr[0]);
		int inputM = Integer.parseInt(inputTimeStr[1]);
		
		int outputT = 0;
		int outputM = inputM - 45;
		
		if(outputM < 0){
			if(inputT == 0) {
				outputT = 23;
			} else {outputT = inputT-1;}
			outputM = 60 - Math.abs(outputM);
		} else {
			outputT = inputT;
		}
		
		System.out.println(outputT + " " + outputM);
		
	}

}
