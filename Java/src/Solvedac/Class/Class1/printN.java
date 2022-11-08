package Solvedac.Class.Class1;

import java.util.Scanner;

public class printN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int input = sc.nextInt();
		int printNum = input;
		
		for(int i=input; 0 < i; i--) {
			sb.append(i).append("\n");
		}
		System.out.println(sb);
	}
}
