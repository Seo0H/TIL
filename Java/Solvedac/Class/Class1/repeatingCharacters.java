package Solvedac.Class.Class1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class repeatingCharacters {
	// 1-6. 문자열 반복
	public static void main(String[] args) {

		// scanner 설정
		Scanner sc = new Scanner(System.in);

		// 문자열 입력부
		// 1열: testCase => int
		int testCase = sc.nextInt();
		sc.nextLine(); //enter값 들어오는 것 보정
		
		// testCase열: R(반복횟수) S(문자열)
		String[] input = new String[testCase];
		for (int i = 0; i < testCase; i++) {
			input[i] = sc.nextLine();
		}
		
		// 문자열 처리부
		// 나눠진 R과 S가 담기는 배열
		String[] splitInput = null;
		for (int i = 0; i < testCase; i++) {
			
			// R과 S 공백을 이용해 나누기
			splitInput = input[i].split(" "); 
			
			// 반복 횟수 R, 문자열 S 선언
			int R = Integer.parseInt(splitInput[0]); 
			String S = splitInput[1];
			
			// 문자열 -> char문자 배열로 쪼개어 R만큼 for문 돌릴 준비
			char[] charS = S.toCharArray(); 
			List<String> finalSList = new ArrayList<>(); //list로 선언하여 유연하게 크기 조절. 
			
			for(int j=0; j<charS.length; j++)
				for(int k=0; k<R; k++)
					finalSList.add(String.valueOf(charS[j]));
						
			System.out.println(String.join("", finalSList));
		}
	}

}
