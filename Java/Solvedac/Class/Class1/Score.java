package Solvedac.Class.Class1;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Test 케이스 개수 입력
		int T = sc.nextInt();
		sc.nextLine();

		// 문자열 입력
		String[] scoreStrRaw = new String[T];
		for (int i = 0; i < T; i++) {
			scoreStrRaw[i] = sc.nextLine();
		}

		// 1. O - X 분리 - 문자열을 다 분해 후, O가 나올때마다 점수 증가. 
		// 2. O 나올때마다 1-2-3 .. 순행으로 점수 증가 및 합산 -> 연속적인 증가를 카운트 할 수 있는 변수 필요
		// 3. 각 열의 점수 순서대로 출력

		// 문자열 분해
		String[] scoreStr = new String[scoreStrRaw.length];
		for (int k = 0; k < scoreStrRaw.length; k++) {
			scoreStr = scoreStrRaw[k].split("");

			int score = 0; // 점수
			int count = 0; // 연속적인 o 카운트

			// 문자열 처리부
			for (int j = 0; j < scoreStr.length; j++) {
				if (scoreStr[j].equals("O")) {
					count += 1;
					score += count;

				} else {
					count = 0;
				}
			}
			System.out.println(score);
		}

	}

}
