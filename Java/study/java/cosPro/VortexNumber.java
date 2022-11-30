package study.java.cosPro;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class VortexNumber {
	public int solution(int n) {
		// n=6 [1] 2 3 4 5 /6/ 7 8 9 10 [11] 12 13 14 15 /16/ 17 18 19 20 [21] 22 23 24
		// 25 26
		// n=5 [1] 2 3 4 /5/ 6 7 8 [9] 10 11 12 /13/ 14 15 /16/ [17] 18 /19/ 20 [21] 22
		// /23/ /24/ [25] > [0],[8],[16],[20],[24]
		// n=4 [1] 2 3 /4/ 5 6 [7] 8 9 /10/ 11 /12/ [13] /14/ [15] /16/ >
		// [0],[6],[12],[14]
		// n=3 [1] 2 /3/ 4 [5] 6 /7/ 8 [9] > [0],[4],[8]

		int answer = 0;
		
		if (n == 1) {
			answer = 1;
		} else {
			
			// 전체 칸 개수
			int nxn = n * n;
			
			//증가하는 칸수
			int boxIdx;
			int preNum;

			
			// 1 이후 ((n-1)*2+1)*2 만큼 더 간 것이 대각선 번호 두번째

			if (n % 2 == 0) {
				//짝수 중앙 칸수 시작
				boxIdx = 2; 
				
				//뺄셈 보정
				preNum = nxn+1;

				// n만큼 루프
				for (int i = 0; i < n/2 ; i++) {
					
					//같은 칸수(boxIdx)가 두번씩 돌기 때문...
					for (int count = 2; count > 0; count--) {
						preNum = preNum - boxIdx;
						answer += preNum;
					}
					
					//두번 돌고 4씩 증가한다
					boxIdx += 4;
				}

			} else {
				//홀수 중앙 칸수 시작
				boxIdx = 4;
				
				//뺄셈 보정
				preNum = nxn;
				answer = nxn;
					
				int loop = n/2;
				// n만큼 루프
				for (int i = 0; i < loop ; i++) {
					
					//같은 칸수(boxIdx)가 두번씩 돌기 때문...
					for (int count = 2; count > 0; count--) {
						preNum = preNum - boxIdx;
						answer += preNum;
					}
					
					//두번 돌고 4씩 증가한다
					boxIdx += 4;
				}
			}
		}

		return answer;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		VortexNumber sol = new VortexNumber();
		int n1 = 7;
		int ret1 = sol.solution(n1);
		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

	}
}