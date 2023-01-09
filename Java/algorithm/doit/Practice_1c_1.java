package algorithm.doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Median {
	static int med3(int a, int b, int c) {
		if (a >= b)
			if (b >= c)
				return b;
			else if (a <= c)
				return a;
			else
				return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}
}

class Practice_1c_1 extends Median {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("세 정수의 중앙값을 구하는 프로그램 입니다.");
		System.out.println("a의 값 : ");
		int a = Integer.parseInt(bf.readLine());
		
		System.out.println("b의 값 : ");
		int b = Integer.parseInt(bf.readLine());
		
		System.out.println("c의 값 : ");
		int c = Integer.parseInt(bf.readLine());
		
		System.out.println("중앙값은" + med3(a, b, c) + "입니다");
	}

}
