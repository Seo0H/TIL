package algorithm.doit;

import java.util.Scanner;

public class PracSolve_30pg {
	public static void main(String[] args) {
		//Q8. 가우스의 덧셈을 이용해 1~n 까지의 정수의 합을 구하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		
		if (n%2 == 0) {
			//n이 짝수일때
			answer = (1+n)*(n/2);
		} else {
			//n이 홀수일때
			int tmp = n-1;
			int midNum = n / 2 + 1;
			answer = (1+n)*(tmp/2) + midNum ;
		}
		
		System.out.println(answer);
	}
}
