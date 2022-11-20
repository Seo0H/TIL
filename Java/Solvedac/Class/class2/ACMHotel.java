package Solvedac.Class.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ACMHotel {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		// test data 크기
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			String[] input = br.readLine().split(" ");

			// 현실 1~12층 - 컴터 0~11층
			int height = Integer.parseInt(input[0]);
			int width = Integer.parseInt(input[1]);
			int N = Integer.parseInt(input[2]);

			int H = N % height; // N번째 들어온 사람의 층 수 - 사람수 / 높이 의 나머지 - 높이먼저 채워지기 때문
			int W = N / height + 1;
			// N번째 들어온 사람의 폭 수 - 사람수 / 높이 의 몫+1
			// 몫의 의미 : 꽉 채워진 호탤 높이, 나머지 의미 : 올림해야함. 소숫점 이하가 있다는 뜻은 그 공간에 자리잡았다는 의미이기 때문
			
			
			// 경우 1: H가 0인경우 
			if (H == 0) {
				//-> 높이가 딱 맞아 떨어졌다는 의미이기에 높이와 같이 설정
				H = height;
				// 딱 나누어 떨어졌기에, 소숫점 이하가 있다는 것을 의미하는 +1 제거
				W -= 1;
			}
			
			// 경우 2: W가 10이상인 경우 / 10 이하인 경우
			if(W > 9) {
				sb.append(H + "" + W).append("\n");
			} else {
				sb.append(H + "0" + W).append("\n");
			}
			
			
		}
		System.out.println(sb);
	}
}
