package Solvedac.Class.Class1;

import java.util.Scanner;

public class starOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String star = "*";
		
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {				
				System.out.printf(star);
			}
			System.out.printf("%n");
		}

	}
}
