package algorithm.doit;

import java.util.Scanner;

public class PracSolve_33pg {
	public static void main(String[] args) {
		//Q. 양의 정수를 입력하고 자릿수를 출력하는 프로그램 작성.
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		String str = Integer.toString(input);
		
		System.out.println("그 수는 " + str.length() + "자리 입니다.");
		
	}
}
