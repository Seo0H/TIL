package Solvedac.Class.Class1;

import java.util.Arrays;
import java.util.Scanner;

public class minMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//정수의 개수
		int N = sc.nextInt();
		sc.nextLine();		
		
		//문자열로 들어오는 숫자 -> intStream 처리 -> min, max 구하기
		String[] strInput =sc.nextLine().split(" ");
		int[] intInput = Arrays.stream(strInput).mapToInt(Integer::parseInt).toArray();
		
		int max = Arrays.stream(intInput).max().getAsInt();
		int min = Arrays.stream(intInput).min().getAsInt();
		
		System.out.println(min + " " + max);

	}

}
