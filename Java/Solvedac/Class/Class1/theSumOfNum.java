package Solvedac.Class.Class1;

import java.util.Arrays;
import java.util.Scanner;

public class theSumOfNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//숫자의 개수
		int N = sc.nextInt();
		sc.nextLine();
		
		//입력 숫자 문자열 -> int배열
		int[] Arr = Arrays.stream(sc.nextLine().split("")).mapToInt(Integer::parseInt).toArray() ;
		
		int Sum = 0;
		for(int i=0; i<N ; i++) {
			Sum += Arr[i];
		}
		System.out.println(Sum);
	}
}
