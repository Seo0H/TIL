package Solvedac.Class.Class1;

import java.util.Scanner;

public class multiplicationTable {
	
	//1-7. 구구단
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=1; i<10; i++) {
			int a = N*i;
			System.out.println(N + " * " + i + " = "+ a);
		}
	}
}