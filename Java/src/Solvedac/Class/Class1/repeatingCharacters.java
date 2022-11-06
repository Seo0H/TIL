package Solvedac.Class.Class1;

import java.util.Scanner;

public class repeatingCharacters {
	//1-6. 문자열 반복
	public static void main(String[] args) {
		
		//scanner 설정
		Scanner sc = new Scanner(System.in);
		
		//1열: testCase => int
		int testCase = sc.nextInt();	
		
		//T(테스트 케이스 개수,1 ≤ T ≤ 1,000)열
		// String[testCase]이고 nextline으로 받은 후 나중에 문자열 처리
		
		// for문 안에서 t열 글자열 나누기 처리
		//	 1. 공백 제거
		//	 2. 숫자 - 글자 분리
		//	 3-1. 숫자는 for문의 인자로 들어가기.
		//	 3-2. 글자는 char 타입으로 변환, for문 안에서 인자만큼 돌린 후 변수에 따로 담기
		//	 3-3. for 루프 안에서 바로 출력.
		
		String[] input = new String[testCase];
		
		for(int i=0; i<testCase ; i++) {
			
			//변수 선언부
			String replaceInput = null; // 문자열 공백 -> # 처리
			String[] splitInput = null; // 문자열 split처리 배열
			
			int R = 0; //반복 횟수
			String S = null; //문자열
			
			//문자열 입력부
			input[i] =  sc.nextLine();
			
			//믄지열 처리부
			replaceInput = input[i].replace(" ","#");
			splitInput = replaceInput.split(" ");
			
			R = Integer.parseInt(splitInput[0]); //반복 횟수
			S = splitInput[1]; //문자열
			
			for(int j=0; j<R; j++){
				//String.toCharArray() 써서 문자열 재조합
			}
			
			System.out.println("출력값똬핫");
		}
		

		
		
	}	
}
